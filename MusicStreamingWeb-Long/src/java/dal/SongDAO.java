/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Singer;
import model.Song;

/**
 *
 * @author nvlon
 */
public class SongDAO extends DBContext {

    public List<Song> getSongByName(String query) {
        List<Song> result = new ArrayList<>();
        String sql = "select song.songID, name, img, uri, likeCount, categoryName\n"
                + "from song inner join genre on song.songID = genre.songID \n"
                + "inner join category on genre.categoryID = category.categoryID\n"
                + "where name like '%" + query + "%'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Song s = new Song();
                s.setSongID(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setGenre(rs.getString(6));
                s.setImg(rs.getString(3));
                s.setUri(rs.getString(4));
                s.setlikeCount(rs.getInt(5));
                result.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        for (int i = 0; i < result.size(); i++) {
            List<Singer> singer = new ArrayList<>();
            sql = "select songID, singer.singerID, name, info, img \n"
                    + "from songOf inner join singer on songOf.singerID = singer.singerID \n"
                    + "where songID = ?";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setInt(1, result.get(i).getSongID());
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    Singer sg = new Singer();
                    sg.setSingerID(rs.getInt(2));
                    sg.setName(rs.getString(3));
                    sg.setInfo(rs.getString(4));
                    sg.setImg(rs.getString(5));
                    singer.add(sg);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            result.get(i).setArtist(singer);
        }

        return result;
    }

    public Song getSongByID(int songID) {
        Song s = new Song();
        String sql1 = "select song.songID, name, img, uri, likeCount, categoryName\n"
                + "from song inner join genre on song.songID = genre.songID \n"
                + "inner join category on genre.categoryID = category.categoryID\n"
                + "where song.songID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql1);
            st.setInt(1, songID);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                s.setSongID(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setGenre(rs.getString(6));
                s.setImg(rs.getString(3));
                s.setUri(rs.getString(4));
                s.setlikeCount(rs.getInt(5));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        List<Singer> singer = new ArrayList<>();
        String sql2 = "select songID, singer.singerID, name, info, img \n"
                    + "from songOf inner join singer on songOf.singerID = singer.singerID \n"
                + "where songID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql2);
            st.setInt(1, songID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Singer sg = new Singer();
                sg.setSingerID(rs.getInt(2));
                sg.setName(rs.getString(3));
                sg.setInfo(rs.getString(4));
                sg.setImg(rs.getString(5));
                singer.add(sg);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        s.setArtist(singer);
        return s;
    }

    public static void main(String[] args) {
        SongDAO sdb = new SongDAO();
        List<Song> list = sdb.getSongByName("e");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}

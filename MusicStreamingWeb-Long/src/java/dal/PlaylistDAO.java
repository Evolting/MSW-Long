package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Playlist;
import model.Song;

/**
 *
 * @author admin
 */
public class PlaylistDAO extends DBContext {

    public List<Playlist> getAllList(String username) {
        List<Playlist> list = new ArrayList<>();
        String sql = "SELECT [playlistID]\n"
                + "      ,[username]\n"
                + "      ,[playlistName]\n"
                + "  FROM [SWPDB].[dbo].[playlist] where username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Playlist p = new Playlist();
                p.setListID(rs.getInt("playlistID"));
                p.setUsername(rs.getString("username"));
                p.setListName(rs.getString("playlistName"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public List<Song> getSongByList(int id) {
        List<Song> list = new ArrayList<>();
        String sql = "select * from listDetail \n"
                + "inner join song on song.songID = listDetail.songID\n"
                + "where playlistID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Song(rs.getInt(2), rs.getInt(7), rs.getString(4), null, rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public Playlist getListById(int id) {
        String sql = "select p.playlistID, p.playlistName, p.username from playlist p where playlistID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Playlist(rs.getInt("playlistID"), rs.getString("username"), rs.getString("playlistName"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void createList(int id, String username, String name) {
        String sql = "insert into playlist values(?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteSongByList(int id) {
        String sql = "delete from listDetail where playlistID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void deleteList(int id) {
        String sql = "delete from playlist where code = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void AddtoList(int listId, int songId) {
        String sql = "insert into listDetail values(?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, listId);
            st.setInt(2, songId);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        PlaylistDAO p = new PlaylistDAO();
        List<Song> l = p.getSongByList(1);
        for (Song song : l) {
            System.out.println(song);
        }
    }
}

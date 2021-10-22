package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewContract_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Tạo mới đơn hàng</title>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"/MusicStreamingWeb-Long/assets/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"/MusicStreamingWeb-Long/assets/jumbotron-narrow.css\" rel=\"stylesheet\">      \n");
      out.write("        <script src=\"/MusicStreamingWeb-Long/assets/jquery-1.11.3.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header clearfix\">\n");
      out.write("\n");
      out.write("                <h3 class=\"text-muted\">VNPAY DEMO</h3>\n");
      out.write("            </div>\n");
      out.write("            <h3>Tạo mới đơn hàng</h3>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <form action=\"/MusicStreamingWeb-Long/vnpayajax\" id=\"frmCreateOrder\" method=\"post\">        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"language\">Loại hàng hóa </label>\n");
      out.write("                        <input name=\"ordertype\" id=\"ordertype\" class=\"form-control\" value=\"Thanh toán hóa đơn\" readonly/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"amount\">Số tiền</label>\n");
      out.write("                        <input name=\"vnp_Amount\" class=\"form-control\" id=\"amount\" type=\"number\" value=\"180000\" readonly/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"OrderDescription\">Nội dung thanh toán</label>\n");
      out.write("                        <textarea class=\"form-control\" cols=\"20\" id=\"vnp_OrderInfo\" name=\"vnp_OrderInfo\" rows=\"2\">MSW Premium</textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"bankcode\">Ngân hàng</label>\n");
      out.write("                        <select name=\"bankcode\" id=\"bankcode\" class=\"form-control\">\n");
      out.write("                            <option value=\"\">Không chọn </option>\n");
      out.write("                            <option value=\"NCB\" selected>  \tNgan hang NCB</option>\n");
      out.write("                            <option value=\"SACOMBANK\">Ngan hang SacomBank  </option>\n");
      out.write("                            <option value=\"EXIMBANK\"> \tNgan hang EximBank </option>\n");
      out.write("                            <option value=\"MSBANK\"> \tNgan hang MSBANK </option>\n");
      out.write("                            <option value=\"NAMABANK\"> \tNgan hang NamABank </option>\n");
      out.write("                            <option value=\"VISA\">  \tThanh toan qua VISA/MASTER</option>\n");
      out.write("                            <option value=\"VNMART\">  \tVi dien tu VnMart</option>\n");
      out.write("                            <option value=\"VIETINBANK\">Ngan hang Vietinbank  </option>\n");
      out.write("                            <option value=\"VIETCOMBANK\"> \tNgan hang VCB </option>\n");
      out.write("                            <option value=\"HDBANK\">Ngan hang HDBank</option>\n");
      out.write("                            <option value=\"DONGABANK\">  \tNgan hang Dong A</option>\n");
      out.write("                            <option value=\"TPBANK\"> \tNgân hàng TPBank </option>\n");
      out.write("                            <option value=\"OJB\">  \tNgân hàng OceanBank</option>\n");
      out.write("                            <option value=\"BIDV\"> Ngân hàng BIDV </option>\n");
      out.write("                            <option value=\"TECHCOMBANK\"> \tNgân hàng Techcombank </option>\n");
      out.write("                            <option value=\"VPBANK\"> \tNgan hang VPBank </option>\n");
      out.write("                            <option value=\"AGRIBANK\"> \tNgan hang Agribank </option>\n");
      out.write("                            <option value=\"MBBANK\"> \tNgan hang MBBank </option>\n");
      out.write("                            <option value=\"ACB\"> Ngan hang ACB </option>\n");
      out.write("                            <option value=\"OCB\"> Ngan hang OCB </option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <h3>Thông tin hóa đơn (Billing)</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Họ tên (*)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_billing_fullname\" name=\"txt_billing_fullname\" type=\"text\" value=\"NGUYEN VAN XO\"/>             \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Email (*)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_billing_email\"\n");
      out.write("                               name=\"txt_billing_email\" type=\"text\" value=\"xonv@vnpay.vn\"/>   \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Số điện thoại (*)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_billing_mobile\"\n");
      out.write("                               name=\"txt_billing_mobile\" type=\"text\" value=\"0934998386\"/>   \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Địa chỉ (*)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_billing_addr1\"\n");
      out.write("                               name=\"txt_billing_addr1\" type=\"text\" value=\"22 Lang Ha Dong Da Ha Noi\"/>   \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Mã bưu điện (*)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_postalcode\"\n");
      out.write("                               name=\"txt_postalcode\" type=\"text\" value=\"100000\"/> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Tỉnh/TP (*)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_bill_city\"\n");
      out.write("                               name=\"txt_bill_city\" type=\"text\" value=\"Ha Noi\"/> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Bang (Áp dụng cho US,CA)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_bill_state\"\n");
      out.write("                               name=\"txt_bill_state\" type=\"text\" value=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Quốc gia (*)</label>\n");
      out.write("                        <input class=\"form-control\" id=\"txt_bill_country\"\n");
      out.write("                               name=\"txt_bill_country\" type=\"text\" value=\"VN\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Thanh toán</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <p>\n");
      out.write("                &nbsp;\n");
      out.write("            </p>\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <p>&copy; VNPAY 2015</p>\n");
      out.write("            </footer>\n");
      out.write("        </div>  \n");
      out.write("        <link href=\"https://pay.vnpay.vn/lib/vnpay/vnpay.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://pay.vnpay.vn/lib/vnpay/vnpay.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(\"#frmCreateOrder\").submit(function () {\n");
      out.write("                var postData = $(\"#frmCreateOrder\").serialize();\n");
      out.write("                var submitUrl = $(\"#frmCreateOrder\").attr(\"action\");\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url: submitUrl,\n");
      out.write("                    data: postData,\n");
      out.write("                    dataType: 'JSON',\n");
      out.write("                    success: function (x) {\n");
      out.write("                        if (x.code === '00') {\n");
      out.write("                            if (window.vnpay) {\n");
      out.write("                                vnpay.open({width: 768, height: 600, url: x.data});\n");
      out.write("                            } else {\n");
      out.write("                                location.href = x.data;\n");
      out.write("                            }\n");
      out.write("                            return false;\n");
      out.write("                        } else {\n");
      out.write("                            alert(x.Message);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                return false;\n");
      out.write("            });\n");
      out.write("        </script>       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" asp-append-version=\"true\" />\n");
      out.write("    \n");
      out.write("    <title>Login</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"big_container\">\n");
      out.write("        <div class=\"login_container ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.errorRegister != null?\"right-panel-active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"login_container\">\n");
      out.write("            <div class=\"form-container sign-up-container\">\n");
      out.write("                <form action=\"register\" method=\"POST\">\n");
      out.write("                    <h1 class=\"login_account\">Create Account</h1>\n");
      out.write("                    <div class=\"social-container\">\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <span style=\"font-size: 12px \">or use your email for registration</span>\n");
      out.write("                    <input class=\"input\" type=\"text\" placeholder=\"Username\" name=\"username\"/>\n");
      out.write("                    <input class=\"input\" type=\"email\" placeholder=\"Email\" name=\"email\"/>\n");
      out.write("                    <input class=\"input\" type=\"password\" placeholder=\"Password\" name=\"password\"/>\n");
      out.write("                    <input class=\"input\" type=\"text\" placeholder=\"Fullname\" name=\"fullname\"/>\n");
      out.write("                    <button id=\"button\" type=\"submit\"> Sign Up</button>\n");
      out.write("                    <h4 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.errorRegister}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-container sign-in-container\">\n");
      out.write("                <form action=\"login\" method=\"POST\">\n");
      out.write("                    <h1 class=\"login_account\">Sign in</h1>\n");
      out.write("                    <div class=\"social-container\">\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <span style=\"font-size: 12px\">or use your account</span>\n");
      out.write("                    <input class=\"input\" type=\"text\" placeholder=\"Username\" name=\"username\"/>\n");
      out.write("                    <input class=\"input\" type=\"password\" placeholder=\"Password\" name=\"password\"/>\n");
      out.write("                    <a href=\"#\">Forgot your password?</a>\n");
      out.write("                    <button id=\"button\" type=\"submit\">Sign In</button>\n");
      out.write("                    <h4 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"overlay-container\">\n");
      out.write("                <div class=\"overlay\">\n");
      out.write("                    <div class=\"overlay-panel overlay-left\">\n");
      out.write("                        <h1 class=\"login_account\">Welcome Back!</h1>\n");
      out.write("                        <p class=\"read_text\">To keep connected with us please login with your personal info</p>\n");
      out.write("                        <button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"overlay-panel overlay-right\">\n");
      out.write("                        <h1 class=\"login_account\">Hello, Friend!</h1>\n");
      out.write("                        <p class=\"read_text\">Enter your personal details and start journey with us</p>\n");
      out.write("                        <button class=\"ghost\" id=\"signUp\">Sign Up</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        const signUpButton = document.getElementById('signUp');\n");
      out.write("        const signInButton = document.getElementById('signIn');\n");
      out.write("       const container = document.getElementById('login_container');\n");
      out.write("       \n");
      out.write("        signUpButton.addEventListener('click', () => {\n");
      out.write("            container.classList.add(\"right-panel-active\");\n");
      out.write("        });\n");
      out.write("       \n");
      out.write("        signInButton.addEventListener('click', () => {\n");
      out.write("            container.classList.remove(\"right-panel-active\");\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
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

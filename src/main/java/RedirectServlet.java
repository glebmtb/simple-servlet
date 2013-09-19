import javax.print.attribute.standard.Media;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RedirectServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String location = req.getParameter("page");
        if (location != null)
        {
            if ("ya".equals(location))
            {
                resp.sendRedirect("http://ya.ru/");
            }
            else if ("simpleServlet".equals(location))
            {
                resp.sendRedirect("simpleServlet");
            }
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        try (PrintWriter out = resp.getWriter())
        {
            //переедаем HTML страницу
            out.print("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<body>\n" +
                    "\n" +
                    "<h1>Servlet с переадресацией</h1>\n" +
                    "\n" +
                    "<p>Ошибка, запрашиваемой страницы нет, <br>" +
                    "попробуйте ввести <a href = \"servlets/RedirectServlet.html\">другую</a>.</p>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>");
        }


    }
}

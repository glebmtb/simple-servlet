import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PostParamServlet  extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        //получаем ссылку на объект PrintWriter, которая даёт возможность сервлету отправлять содержимое клиенту.
        try (PrintWriter out = resp.getWriter())
        {
            //переедаем HTML страницу
            out.print("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<body>\n" +
                    "\n" +
                    "<h1>Servlet c передачей POST параметров</h1>\n" +
                    "\n" +
                    "<p>" + name + ", добро пожаловать  в Servlet</p>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>");
        }
    }
}

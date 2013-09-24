import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Sniffer extends HttpServlet
{
    private static final long serialVersionUID = 1202111652173202947L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        req.setCharacterEncoding("UTF-8");
        StringBuffer jb = new StringBuffer();
        String l = null;
        BufferedReader read = req.getReader();
        while ((l = read.readLine()) != null){
            jb.append(l);
            jb.append("\n");
        }

        System.out.println(jb.toString());


    }
}

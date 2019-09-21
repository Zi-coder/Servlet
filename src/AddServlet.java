import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {


    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i + j;
        PrintWriter out = res.getWriter();
        String result = result = req.getHeader("content-length");
        out.println(
                "Nice Try Bitch\n" +
                "Result is : " + k +"\n" +
                "Content length = \n"+
                result + "\n");


    }
}

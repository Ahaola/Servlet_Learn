import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.EnumSet;

@WebServlet("/postGetParameter")
public class PostGetParameterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //假设前端传过来的数据是userid=10 & classid=20
        //服务器也是通过resp.getParameter来获取内容的
        String userid = req.getParameter("userid");
        String classid = req.getParameter("classid");
        resp.getWriter().write("userid="+ userid+"classid="+classid);
    }
}

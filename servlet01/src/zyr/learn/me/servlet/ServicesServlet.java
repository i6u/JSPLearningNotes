package zyr.learn.me.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhouweitao on 16/9/28.
 */
@WebServlet(name = "ServicesServlet",urlPatterns = "/services")
public class ServicesServlet extends HttpServlet {

    //如果覆盖service方法，就不会再执行doPost，doGet方法
    //@Override
    //protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    System.out.println("services..."+req.getParameter("test"));
    //}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post......"+request.getParameter("test"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get......"+request.getParameter("test"));
    }
}

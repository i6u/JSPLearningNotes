package zyr.learn.me.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhouweitao on 16/9/28.
 */
public class LifecycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getServletContext().getRealPath("/"));
        System.out.println("init config getParameter:"+config.getInitParameter("username"));
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service...");
        System.out.println(req.getSession().getServletContext().getRealPath("/"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

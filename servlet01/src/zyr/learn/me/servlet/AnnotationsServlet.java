package zyr.learn.me.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhouweitao on 16/9/20.
 */
@WebServlet(name = "AnnotationsServlet", urlPatterns = "/annotations")
public class AnnotationsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer num = Integer.parseInt(request.getParameter("num"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("获得项目相对路径:"+request.getContextPath());
        out.print("</br>");
        out.print("获得请求路径:"+request.getServletPath());
        out.print("</br>");
        out.print("获得项目在服务器上的绝对路径:"+request.getSession().getServletContext().getRealPath("/"));
        out.print("</br>");
        out.print(request.getPathInfo());
        out.print("</br>");
        out.print(request.getPathTranslated());
        out.print("</br>");
        out.print("获得项目相对路径:"+request.getSession().getServletContext().getContextPath());
        out.print("</br>");
        out.print("获得项目下所有文件的相对路径");
        Set<String> strs = request.getSession().getServletContext().getResourcePaths("/");
        for (String str : strs) {
            out.print("---" + str + "---");
            out.print("</br>");
        }
        out.print("</br>");
        out.print("获得请求的所有参数名");
        Enumeration<String> es = request.getParameterNames();
        while (es.hasMoreElements()) {
            out.print(es.nextElement() + "<br>");
        }
        out.print("获得请求的所有参数名，参数值");
        Map<String, String[]> ms = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : ms.entrySet()) {
            out.println("Key = " + entry.getKey() + ", ");
            for (String s : entry.getValue()) {
                out.print("Value = " + s + "<br>");
            }
        }
        out.print("获得请求的所有参数值");
        String[] sa = request.getParameterValues("a");
        for (String s : sa) {
            out.print("a:" + s + "<br>");
        }
        out.print("</body>");
        out.print("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

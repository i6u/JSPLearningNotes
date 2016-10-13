# JSPLearningNotes
###关于web项目乱码问题
[java web项目各种乱码的解决方案](http://blog.csdn.net/chenghui0317/article/details/10299103)
###Servlet相关
* 容器的概念
* Tomcat配置
* JSP/Servlet，servlet生命周期
    - JSP页面中<%写在这里的Java代码编译后会在jspService方法中%>而<%!加上'！'号，设置全局方法、属性%>
* JSP九大内置对象，作用域，常用API
* GET/POST，HTTP协议
* service，doGet/doPost方法
* 请求转发/重定向
* 静态包含/动态包含
* 乱码问题
    - 导致GET请求的URL乱码->在tomcat配置文件中设置(URIEncoding="UTF-8")
    - 导致POST请求的乱码
    - JSP页面乱码
    - Servlet获取参数乱码
* JSP运行原理
* 常用servlet容器配置
* 深入了解Tomcat
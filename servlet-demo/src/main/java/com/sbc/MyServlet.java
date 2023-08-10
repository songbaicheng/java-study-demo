package com.sbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author songbaicheng
 * @description Servlet demo
 * @date 2023/8/10 22:08
 */
@WebServlet("/servlet")
public class MyServlet extends HttpServlet {

    /**
     * 服务器关闭或者容器停止则调用此方法
     */
    @Override
    public void destroy() {
        System.out.println("我是 destroy 方法");
    }

    /**
     * 请求到达servlet容器会判断被请求的servlet是否存在，如果不存在则创建容器
     */
    @Override
    public void init() throws ServletException {
        System.out.println("MyServlet 被创建了！");
    }

    /**
     * 有请求到达servlet容器就会被调用
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset-utf-8");
        resp.setHeader("Content-Type", "text/html;charset=utf-8");

        System.out.println("我是 service 方法");
        resp.getWriter().write("我是 service 方法");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset-utf-8");
        resp.setHeader("Content-Type", "text/html;charset=utf-8");

        System.out.println("我是 doGet 方法");
        resp.getWriter().write("我是 doGet 方法");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset-utf-8");
        resp.setHeader("Content-Type", "text/html;charset=utf-8");

        System.out.println("我是 doPost 方法");
        resp.getWriter().write("我是 doPost 方法");
    }
}

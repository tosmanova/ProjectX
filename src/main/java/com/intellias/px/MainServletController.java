package com.intellias.px;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getContextPath() + req.getServerPort());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
        requestDispatcher.forward(req,resp);
    }
}

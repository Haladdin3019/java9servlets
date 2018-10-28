package com.sda;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstParam = req.getParameter("a");
        String secondParam = req.getParameter("b");



        String finalFirstParam = StringUtils.isEmpty(firstParam) ? "0" : firstParam;
        String finalSecondParam = StringUtils.isEmpty(firstParam) ? "0" : secondParam;

        Integer intValue1 = Integer.valueOf(finalFirstParam)+ Integer.valueOf(finalSecondParam);




        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Result "+finalFirstParam+" + "+ finalSecondParam + " = "+ intValue1+ "</h1>");
    }
}

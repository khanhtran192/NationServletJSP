package com.example.nationservletjsp.servlet;

import com.example.nationservletjsp.dao.DBUtil;
import com.example.nationservletjsp.model.Region;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/region/list")
public class ShowListRegion {

    private DBUtil dbUtil;

    public void init(){
        dbUtil = new DBUtil();
    }

    public void doGet(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Region> list = dbUtil.selectAll();
        request.setAttribute("listRegion", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/list.jsp");
        dispatcher.forward(request, response);
    }

}

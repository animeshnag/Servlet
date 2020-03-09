package com.java;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

        PrintWriter out=res.getWriter();
        String rollNo1=(req.getParameter("rollno1"));

        if(AddServlet.hm.containsKey(rollNo1))
        {
            req.setAttribute("record", AddServlet.hm.get(rollNo1));
            //out.println(new Gson().toJson(AddServlet.hm.get(rollNo1)));
            //out.println("Result\n\nRoll No\tName\tUniversity\n"  + AddServlet.hm.get(rollNo1));
        }
        else
        {
            out.println("Roll No not found");
        }
    }
}

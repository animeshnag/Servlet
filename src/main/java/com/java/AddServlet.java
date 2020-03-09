package com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet  {

    public static HashMap<String, Student> hm=new HashMap<String, Student>();
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{

        PrintWriter out=res.getWriter();
        String rollNo=(req.getParameter("rollno"));
        String name=req.getParameter("name");
        String university=req.getParameter("university");

        Student st=new Student(rollNo, name, university);

        //String S=rollNo + "\t" + name + "\t" + university;

        if(hm.containsKey(rollNo)){
            out.println("Same Roll No found! Enter other roll no");
        }
        else{
            hm.put(rollNo, st);
            //hm.put(rollNo, S);
            out.println("Data Successfully Submitted");
        }
        }
    }


package com.java;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Listener implements ServletContextListener {



    public void contextInitialized(ServletContextEvent servletContextEvent) {
            System.out.println("################################################");
        System.out.println("Listener Started");
            System.out.println("################################################");

            String path=servletContextEvent.getServletContext().getInitParameter("parameter");
        try {
            Properties prop=readPropertiesFile(path);
            servletContextEvent.getServletContext().setAttribute("properties",prop);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("################################################");
        System.out.println("Listner Stoped");
        System.out.println("################################################");
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        }
        catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            fis.close();
        }
        return prop;
    }
}

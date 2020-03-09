package listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Listener1 implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("################################################");
        System.out.println("Listener Started");
        System.out.println("################################################");


    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("################################################");
        System.out.println("Listenner Stoped");
        System.out.println("################################################");
    }

}
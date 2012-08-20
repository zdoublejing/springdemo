package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.DemoBean;

public class DemoBeanApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DemoBean helloWorld = (DemoBean) context.getBean("demobean");
        helloWorld.display();
    }
}

package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext contex=new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean myBean=(MyBean) contex.getBean("myBean");
        MyBean myBean1=(MyBean) contex.getBean("myBean");
        System.out.println(myBean);
        System.out.println(myBean1);
    }
}

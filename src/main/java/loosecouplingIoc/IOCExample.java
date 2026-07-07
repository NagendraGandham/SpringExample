package loosecouplingIoc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationIocLooseCouplingExample.xml");
        UserManager userManagerWithDB=(UserManager) context.getBean("userManagerWithuserDataprovider");
        System.out.println(userManagerWithDB.getUserinfo());

        UserManager userManagerWithWS=(UserManager) context.getBean("userManagerWithuserWebServiceDataprovider");
        System.out.println(userManagerWithWS.getUserinfo());
    }

}

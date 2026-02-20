package com.ioc.Coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");


       // UserDataProvider databaseProvider = new UserDatabaseProvider();
       // UserManager userManagerWithDB=new UserManager(databaseProvider);
        UserManager userManagerWithDB= (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());
    }
}

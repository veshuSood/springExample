package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //in auto-wireByName type of the setter and the object is matched name doesnot matters
        ApplicationContext context=new ClassPathXmlApplicationContext("autowireByType.xml");
        Car myCar=(Car) context.getBean("myCar");
        myCar.displayDetail();
    }
}

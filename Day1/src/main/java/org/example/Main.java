package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        CricketCoach cricketCoach = new CricketCoach();
//        System.out.println(cricketCoach.sayHello());
//        System.out.println(cricketCoach.getSportsKit());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Coach coach = (Coach) context.getBean("coach1");
        System.out.println(coach.sayHello());
        System.out.println(coach.getSportsKit());;
    }
}
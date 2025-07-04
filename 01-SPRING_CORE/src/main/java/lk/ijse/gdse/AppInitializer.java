package lk.ijse.gdse;


import lk.ijse.gdse.Bean.SpringBean;
import lk.ijse.gdse.Bean.TestBean1;
import lk.ijse.gdse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        object ekaka reference eka gann akara 3

//        class name eken
        SpringBean springBean = context.getBean(SpringBean.class);
        System.out.println(springBean);


//        Bean id eken
        SpringBean springBean1 = (SpringBean) context.getBean("springBean");
        System.out.println(springBean1);

//         class name eken ha Bean id eken
        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1" , TestBean1.class);
        System.out.println(testBean1);

        context.registerShutdownHook();




    }
}
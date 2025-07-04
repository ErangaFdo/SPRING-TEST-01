package lk.ijse.gdse;


import lk.ijse.gdse.Bean.SpringBean;
import lk.ijse.gdse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBean springBean = context.getBean(SpringBean.class);
        System.out.println(springBean);

        SpringBean springBean1 = context.getBean(SpringBean.class);
        System.out.println(springBean1);

        context.close();

    }
}
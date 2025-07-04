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

        context.registerShutdownHook();
//        registerShutdownHook() call kalama anithimatama thama context eka call wennh
//        e kiyn eka ta yatat una object hadan puluwn

        SpringBean springBean1 = context.getBean(SpringBean.class);
        System.out.println(springBean1);




    }
}
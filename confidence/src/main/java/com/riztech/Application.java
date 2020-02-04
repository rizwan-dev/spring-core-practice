package com.riztech;

import com.riztech.service.SpeakerService;
import com.riztech.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Application {


    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService service1 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service1);
    }
}

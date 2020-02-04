package com.riztech;

import com.riztech.repository.HibernateSpeakerRepositoryImpl;
import com.riztech.repository.SpeakerRepository;
import com.riztech.service.SpeakerService;
import com.riztech.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.riztech"})
public class AppConfig {

    /*@Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRespository() {
        return new HibernateSpeakerRepositoryImpl();
    }*/

    /*@Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerservice() {
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRespository());
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//        speakerService.setSpeakerRepository(getSpeakerRespository());
        return speakerService;
    }*/
}

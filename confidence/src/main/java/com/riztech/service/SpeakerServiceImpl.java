package com.riztech.service;

import com.riztech.model.Speaker;
import com.riztech.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.speakerRepository = speakerRepository;
    }


    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }


    public void setSpeakerRepository(SpeakerRepository speakerRespository) {
        System.out.println("SpeakerServiceImpl repository setter");
        this.speakerRepository = speakerRespository;
    }
}

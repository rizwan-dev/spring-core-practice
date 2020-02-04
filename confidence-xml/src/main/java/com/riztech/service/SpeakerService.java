package com.riztech.service;

import com.riztech.model.Speaker;
import com.riztech.repository.SpeakerRepository;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();

}

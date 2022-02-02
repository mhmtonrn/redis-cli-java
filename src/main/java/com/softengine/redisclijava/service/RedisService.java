package com.softengine.redisclijava.service;

import com.softengine.redisclijava.model.Model;
import com.softengine.redisclijava.repository.RedisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final RedisRepository redisRepository;


    public Model saveHash(Model model) {
        return redisRepository.save(model);
    }

    public Model getHash(String param) {
        return redisRepository.findById(param).get();
    }
}

package com.softengine.redisclijava.api;

import com.softengine.redisclijava.model.Model;
import com.softengine.redisclijava.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class Api {

    private final RedisService redisService;

    @PostMapping("/saveHash")
    public ResponseEntity<Model> saveHash(@RequestBody Model model){
        return new ResponseEntity<>(redisService.saveHash(model), HttpStatus.OK);
    }

    @GetMapping("/getHash")
    public ResponseEntity<Model> getHash(@RequestParam String param){
        return new ResponseEntity<>(redisService.getHash(param), HttpStatus.OK);
    }

    @GetMapping("/test")
    public String getServiceTest(){
        return LocalDateTime.now().toString();
    }
}

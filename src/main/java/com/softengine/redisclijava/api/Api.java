package com.softengine.redisclijava.api;

import com.softengine.redisclijava.model.Model;
import com.softengine.redisclijava.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class Api {

    private final RedisService redisService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/saveHash")
    public ResponseEntity<Model> saveHash(@RequestBody Model model){

        return new ResponseEntity<>(redisService.saveHash(model), HttpStatus.OK);
    }

    @GetMapping("/getHash")
    public ResponseEntity<Model> getHash(@RequestParam String param){
        Model deger = redisService.getHash(param);
        logger.error("{}",deger);
        return new ResponseEntity<>(deger, HttpStatus.OK);
    }

    @GetMapping("/test")
    public String getServiceTest(){
        return LocalDateTime.now().toString();
    }
}

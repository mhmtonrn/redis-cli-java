package com.softengine.redisclijava.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("MyKey")
@Data
@RequiredArgsConstructor
public class Model implements Serializable {

    @Id
    private String key;
    private String value;

    @Override
    public String toString() {
        return "{" + "'" + key +   "'='" + value + "'}";
    }
}

package com.softengine.redisclijava.repository;

import com.softengine.redisclijava.model.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepository extends CrudRepository<Model, String > {
}

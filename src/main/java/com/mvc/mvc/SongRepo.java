package com.mvc.mvc;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SongRepo extends MongoRepository<Song, Integer>{
    public List<Song> findAll();
}

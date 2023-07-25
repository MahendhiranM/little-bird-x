package com.leo.littlebird.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.littlebird.model.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>{
    
}

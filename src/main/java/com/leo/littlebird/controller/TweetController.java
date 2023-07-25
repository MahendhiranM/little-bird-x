package com.leo.littlebird.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.leo.littlebird.dto.TweetDto;
import com.leo.littlebird.model.Tweet;
import com.leo.littlebird.service.TweetService;

@Controller
public class TweetController {

    @Autowired
    private TweetService tweetService;
    
    @GetMapping("api/tweets")
    public List<Tweet> getTweets(){
        return tweetService.getTweets();
    }

    @GetMapping("api/tweets/{id}")
    public Tweet getTweet(Long id){
        return tweetService.getTweet(id);
    }

    @PostMapping("api/tweets")
    public Tweet saveTweets(TweetDto tweetDto){
        return tweetService.saveTweets(tweetDto);
    }

    @PutMapping("api/tweets/{id}")
    public Tweet updateTweets(Long id, TweetDto tweetDto){
        return tweetService.updateTweets(id, tweetDto);
    }

    @DeleteMapping("api/tweets/{id}")
    public Boolean removeTweet(Long id){
        return tweetService.removeTweet(id);
    }

}

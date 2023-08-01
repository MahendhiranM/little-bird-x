package com.leo.littlebird.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.littlebird.dto.TweetDto;
import com.leo.littlebird.model.Tweet;
import com.leo.littlebird.repository.TweetRepository;
import com.leo.littlebird.service.TweetService;

@Service
public class TweetServiceImpl implements TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Override
    public List<Tweet> getTweets() {
        return tweetRepository.findAll();
    }

    @Override
    public Tweet getTweet(Long id) {
        return tweetRepository.findById(id).get();
    }

    @Override
    public Boolean removeTweet(Long id) {
        Tweet tweet = tweetRepository.findById(id).orElse(null);
        if(tweet == null) 
            return Boolean.FALSE;
        tweetRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public Tweet saveTweets(TweetDto tweetDto) {
        Tweet tweet = new Tweet();
        Tweet savedTweet = tweetRepository.save(tweet);
        return savedTweet;
    }

    @Override
    public Tweet updateTweets(Long id, TweetDto tweetDto) {
        Tweet tweet = tweetRepository.findById(id).orElse(null);
        return tweetRepository.save(tweet);
    }
    
}

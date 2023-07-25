package com.leo.littlebird.service;

import java.util.List;

import com.leo.littlebird.dto.TweetDto;
import com.leo.littlebird.model.Tweet;

public interface TweetService {

    List<Tweet> getTweets();

    Tweet getTweet(Long id);

    Boolean removeTweet(Long id);

    Tweet saveTweets(TweetDto tweetDto);

    Tweet updateTweets(Long id, TweetDto tweetDto);
    
}

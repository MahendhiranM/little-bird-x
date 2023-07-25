package com.leo.littlebird.dto;

import java.time.LocalDate;

import com.leo.littlebird.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TweetDto {

    private String tweet;

    private User user;

    private Boolean isEdited;

    private LocalDate createAt;

    private LocalDate updateAt;
}

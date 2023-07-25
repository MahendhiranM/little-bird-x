package com.leo.littlebird.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Tweet {
    
    @Id
    private Long id;

    private String tweet;

    private User user;

    private Boolean isEdited;

    private LocalDate createAt;

    private LocalDate updateAt;
}

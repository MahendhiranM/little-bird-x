package com.leo.littlebird.model;

import java.time.LocalDate;
import java.util.List;

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
public class User {
    
    @Id
    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private long mobile;

    private String gender;

    private List<Tweet> tweets;

    private LocalDate createAt;

    private LocalDate updateAt;

}

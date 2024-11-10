package com.bu.childTest2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer childId;
    private String childName;

    @ManyToOne(cascade = CascadeType.ALL)
    private Framework framework;


}

//    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL)
//    private List<Rating> ratings;


//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "child")
//    private List<Rating> ratings;
//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "child")
//    private List<Question> questionList;

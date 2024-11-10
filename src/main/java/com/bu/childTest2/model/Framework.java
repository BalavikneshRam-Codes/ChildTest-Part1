package com.bu.childTest2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Framework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer frameworkId;
    private String frameworkName;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Question> questionList;
}

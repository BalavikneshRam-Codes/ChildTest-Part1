package com.bu.childTest2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ratingId;
    private Integer score;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="child_id")
    private Child child;

    @ManyToOne
    @JoinColumn(name = "questionid")
    private Question question;

}

package com.bu.childTest2.repository;

import com.bu.childTest2.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,Integer> {
    List<Rating> findByChild_childId(int childId);
}

package com.solankiTailorsDB.solankiTailorsDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solankiTailorsDB.solankiTailorsDB.Model.TestimonialModel;
@Repository
public interface TestimonialRepository extends JpaRepository<TestimonialModel,Integer>{

}

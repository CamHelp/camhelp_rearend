package com.camhelp.repository;

import com.camhelp.dataobject.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jupiter
 * @description
 * @create 2017-08-04-11:32
 */
public interface ProblemRepository extends JpaRepository<Problem,Integer>{
}

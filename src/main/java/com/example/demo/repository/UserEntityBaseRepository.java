package com.example.demo.repository;

import com.example.demo.domain.UserEntity;
import lombok.Generated;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
@Generated
public interface UserEntityBaseRepository extends
        JpaRepository<UserEntity, Long>,
        QuerydslPredicateExecutor<UserEntity> {
}

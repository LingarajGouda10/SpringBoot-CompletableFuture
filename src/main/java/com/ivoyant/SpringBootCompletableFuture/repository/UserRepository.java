package com.ivoyant.SpringBootCompletableFuture.repository;

import com.ivoyant.SpringBootCompletableFuture.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

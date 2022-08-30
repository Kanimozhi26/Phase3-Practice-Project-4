package com.example.demo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Repository extends JpaRepository<User, Integer> 
{
    Optional<User> findByUserName(String userName);
}
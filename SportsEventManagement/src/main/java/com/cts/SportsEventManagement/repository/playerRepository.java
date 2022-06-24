package com.cts.SportsEventManagement.repository;

import com.cts.SportsEventManagement.entity.Players.playersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface playerRepository extends JpaRepository<playersEntity,Integer>{
}

package com.cts.SportsEventManagement.repository;

import com.cts.SportsEventManagement.entity.Sports.sportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sportsRepository extends JpaRepository<sportsEntity,Integer>{

}

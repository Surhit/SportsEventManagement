package com.cts.SportsEventManagement.repository;
import com.cts.SportsEventManagement.entity.Sports.eventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface eventsRepository extends JpaRepository<eventsEntity,Integer>{
}

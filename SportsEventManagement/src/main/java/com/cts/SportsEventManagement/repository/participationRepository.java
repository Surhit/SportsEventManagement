package com.cts.SportsEventManagement.repository;

import com.cts.SportsEventManagement.entity.Participation.participationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface participationRepository extends JpaRepository<participationEntity,Integer>{
}

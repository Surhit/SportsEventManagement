package com.cts.SportsEventManagement.services;

import com.cts.SportsEventManagement.entity.Sports.sportsEntity;
import com.cts.SportsEventManagement.entity.Sports.eventsEntity;
import com.cts.SportsEventManagement.repository.eventsRepository;
import com.cts.SportsEventManagement.repository.sportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class sportsService {

    @Autowired
    private sportsRepository sport;

    @Autowired
    private eventsRepository event;

    public List<sportsEntity> getAllSports(){
        return sport.findAll();
    }
    public List<eventsEntity> getAllEvents(){
        return event.findAll();
    }

}

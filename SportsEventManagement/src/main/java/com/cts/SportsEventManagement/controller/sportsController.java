package com.cts.SportsEventManagement.controller;

import com.cts.SportsEventManagement.entity.Sports.eventsEntity;
import com.cts.SportsEventManagement.entity.Sports.sportsEntity;
import com.cts.SportsEventManagement.services.sportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")

public class sportsController {
    @Autowired
    private sportsService sport;

    @GetMapping(value = "/sports")
    private List<sportsEntity> getAllSports(){
        return sport.getAllSports();//Fetch all the sports from database
    }

    @GetMapping(value = "/events")
    private List<eventsEntity> getAllEvents(){
        return sport.getAllEvents();//Fetch all the events from database
    }

    @GetMapping(value = "/getSportsByName/{sportsName}")
    private sportsEntity getSportsByName(@PathVariable String sportsName){
        return sport.getSportsByName(sportsName);
    }

    @GetMapping(value = "/eventsByName/{name}")
    private sportsEntity getEventsByName(@PathVariable String name){
        return sport.getEventsByName(name);
    }

    @PostMapping(value = "/addEvent")
    private String addEvent(@RequestBody sportsEntity event){
        sport.addEvent(event);
        String str= "Sports Event added successfully";
        return str;
    }

    @DeleteMapping(value = "/deleteEvent/{id}")
    private String deleteEvent(@PathVariable int id){
        sport.deleteEvent(id);
        String str="Event Object with id = "+ id +" deleted successfully";
        return str;
    }







    /*GET: / sports(Input: None| Output: ListAllSportsDetails)
    o GET:/getSportsByName(Input:sports name|Output: Sports)
    o POST: /addEvent (Input: Event object | Output: Sports Event +” added successfully”)
    o DELETE: /deleteEvent (Input: Event id which is already exists |
            Output: Event Object +” deleted successfully”)
    o GET: / events(Input: None| Output: ListAllEvents)
    o GET: / eventsByName(Input: eventName| Output: Event)
*/
}

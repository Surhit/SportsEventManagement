package com.cts.SportsEventManagement.entity.Participation;

import com.cts.SportsEventManagement.entity.Players.playersEntity;
import com.cts.SportsEventManagement.entity.Sports.eventsEntity;
import com.cts.SportsEventManagement.entity.Sports.sportsEntity;
import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class participationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Participation_id;

    //One to One mapping to Player using PlayerId
    @OneToOne
    private playersEntity player;

    //One to One mapping to Event using EventId
    @OneToOne
    private eventsEntity event;

    //One to One mapping to Sports using Sports_Id
    @OneToOne
    private sportsEntity sport;

    private String status;

    /*1. Participation_id
2. Player_id
3. Player_name
4. Event_id
5. Event_name
6. Sports_id
7. Sports_name
8. Status*/

}

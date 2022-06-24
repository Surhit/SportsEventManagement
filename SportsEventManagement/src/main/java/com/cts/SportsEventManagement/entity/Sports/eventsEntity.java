package com.cts.SportsEventManagement.entity.Sports;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class eventsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;
    private Date eventDate;
    private String eventName;
    private int noofSlots;

    // One to many mapping from Events to Sports using sportsId as foreign key
    @OneToOne
    private sportsEntity sport;


}

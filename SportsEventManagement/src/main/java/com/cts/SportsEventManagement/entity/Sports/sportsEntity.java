package com.cts.SportsEventManagement.entity.Sports;

import lombok.*;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class sportsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sportsId;
    private int noOfPlayers;
    private String sportsName;
    private String sportsType;
}

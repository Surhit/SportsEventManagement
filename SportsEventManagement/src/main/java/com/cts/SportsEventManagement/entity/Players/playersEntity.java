package com.cts.SportsEventManagement.entity.Players;

import com.cts.SportsEventManagement.entity.Sports.sportsEntity;
import lombok.*;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class playersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PlayerId;
    private String playerName;
    private int age;
    private String contactNumber;
    private String email;
    private String gender;

    // One to One mapping from player to Sports using sportsId as foreign key
    @OneToOne
    private sportsEntity sport;

}

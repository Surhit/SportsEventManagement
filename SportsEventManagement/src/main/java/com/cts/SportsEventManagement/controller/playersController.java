package com.cts.SportsEventManagement.controller;

import com.cts.SportsEventManagement.services.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")

public class playersController {
    @Autowired
    private playerService player;

}

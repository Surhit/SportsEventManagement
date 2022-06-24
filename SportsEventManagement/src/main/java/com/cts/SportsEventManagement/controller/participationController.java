package com.cts.SportsEventManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cts.SportsEventManagement.services.participationService;

@RestController
@RequestMapping("/participation")

public class participationController {
    @Autowired
    private participationService participation;
}

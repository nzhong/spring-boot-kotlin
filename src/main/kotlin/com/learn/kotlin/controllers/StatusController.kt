package com.learn.kotlin.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
public class StatusController {

    @RequestMapping("/status")
    fun getStatus() : String {
        return "ok from Kotlin"
    }

}

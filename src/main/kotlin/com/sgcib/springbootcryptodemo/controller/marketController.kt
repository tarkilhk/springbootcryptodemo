package com.sgcib.springbootcryptodemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/market")
class marketController {

    @GetMapping("/price")
    fun getPrice() = 2.0
}
package com.sgcib.springbootcryptodemo.controller

import com.sgcib.springbootcryptodemo.service.MarketService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/market")
class MarketController(private val marketService: MarketService) {

    @GetMapping("/price")
    fun price() = marketService.getLastPrice()


}
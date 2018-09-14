package com.sgcib.springbootcryptodemo.controller

import com.sgcib.springbootcryptodemo.domain.Execution
import com.sgcib.springbootcryptodemo.domain.Order
import com.sgcib.springbootcryptodemo.service.MarketService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/market")
class MarketController(private val marketService: MarketService) {

    @GetMapping("/price")
    fun getPrice() = marketService.getLastPrice()

    @PostMapping("/execute")
    fun execute(size: Int): Execution {
        val order = Order(size)
        return marketService.execute(order)
    }

}
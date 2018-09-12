package com.sgcib.springbootcryptodemo.controller

import com.sgcib.springbootcryptodemo.domain.Execution
import com.sgcib.springbootcryptodemo.domain.Order
import com.sgcib.springbootcryptodemo.service.MarketService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/market")
class marketController(private val marketService: MarketService) {

    @GetMapping("/price")
    fun getPrice() = marketService.getLastPrice()

    @PostMapping("/execute")
    fun execute(@RequestParam size: Int): Execution {
        val order = Order(size)
        return marketService.execute(order)
    }

}
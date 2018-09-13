package com.sgcib.springbootcryptodemo.controller

import com.sgcib.springbootcryptodemo.service.PortfolioService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/portfolio")
class PortfolioController(private val portfolioService: PortfolioService) {

    @GetMapping("/executions")
    fun getExecutions() = portfolioService.getExecutions()


    @GetMapping("/pnl")
    fun getPnl() = portfolioService.getPnl()
}
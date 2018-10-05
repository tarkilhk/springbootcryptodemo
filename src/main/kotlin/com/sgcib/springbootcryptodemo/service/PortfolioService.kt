package com.sgcib.springbootcryptodemo.service

import com.sgcib.springbootcryptodemo.domain.Execution
import org.springframework.stereotype.Service


@Service
class PortfolioService(private val marketService: MarketService) {

    private val executions = mutableListOf<Execution>()


    fun getExecutions() = executions

    fun addExecution(execution: Execution) = executions.add(execution)

    fun calculatePnl():Double {
        // market value portfolio - cost porfolio (what i paid)
        return calculateMarketValue() - calculateCost()
    }

    fun calculateCost() = executions.map { it.order.size * it.price }.sum()

    fun calculateMarketValue():Double {
        val currentPrice = marketService.getLastPrice()
        return executions.map { it.order.size * currentPrice }.sum()
    }
}
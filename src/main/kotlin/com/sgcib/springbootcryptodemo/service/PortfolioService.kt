package com.sgcib.springbootcryptodemo.service

import com.sgcib.springbootcryptodemo.domain.Execution
import org.springframework.stereotype.Service

@Service
class PortfolioService(private val marketService: MarketService) {

    private val executions = mutableListOf<Execution>()

    fun getExecutions() = executions

    fun addExecution(execution: Execution) = executions.add(execution)

    fun calculatePnl():Double {
        // market value - cost (what i paid)
        return calculateMarketValue() - calculateCost()
    }

    fun calculateMarketValue():Double {
        val currentPrice = marketService.getLastPrice()
        return executions.map { currentPrice * it.order.size }.sum()
    }

    fun calculateCost() = executions.map { it.price * it.order.size }.sum()

}
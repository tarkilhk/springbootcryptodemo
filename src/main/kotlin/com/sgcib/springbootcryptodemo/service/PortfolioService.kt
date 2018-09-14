package com.sgcib.springbootcryptodemo.service

import com.sgcib.springbootcryptodemo.domain.Execution
import org.springframework.stereotype.Service

@Service
class PortfolioService(val marketService: MarketService) {

    private val executions = mutableListOf<Execution>()

    fun getExecutions() = executions

    fun addExecution(execution: Execution) = executions.add(execution)

    fun getCalculatePnl():Double {
        // market value of portfolio (asstes at last rice of market) - cost (what i paid)
        return calculateMarketValue() - calculateCost()
    }

    fun calculateCost():Double  {
        return executions.map { it.order.size * it.price }.sum()
    }

    fun calculateMarketValue(): Double {
        val currentPrice = marketService.getLastPrice()
        return executions.map { it.order.size * currentPrice }.sum()
    }


}
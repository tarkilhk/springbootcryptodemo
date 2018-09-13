package com.sgcib.springbootcryptodemo.service

import com.sgcib.springbootcryptodemo.domain.Execution
import org.springframework.stereotype.Service

@Service
class PortfolioService(private val marketService: MarketService) {

    private val executions = mutableListOf<Execution>()


    fun getExecutions() = executions

    fun addExecution(execution: Execution) = executions.add(execution)

    fun getPnl(): Double {
        // market value - cost
        return getMarketValue() - getCost()
    }

    fun getMarketValue(): Double {
        val lastPrice = marketService.getLastPrice()
        return executions.map { it.order.size * lastPrice }.sum()
//        return executions.map { it.order.size * pointValue }.sum()
    }

    fun getCost() = executions.map { it.order.size * it.price }.sum()

}


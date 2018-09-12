package com.sgcib.springbootcryptodemo.service

import com.sgcib.springbootcryptodemo.domain.Execution
import org.springframework.stereotype.Service
import javax.swing.DefaultBoundedRangeModel

@Service
class PortfolioService(private val marketService: MarketService) {

    private val executions = mutableListOf<Execution>()

    fun addExecution(execution:Execution) = executions.add(execution)

    fun getExecutions() = executions

    fun marketValue():Double {
        val lastPrice = marketService.getLastPrice()
        return executions.map { lastPrice * it.order.size }.sum()
    }

    fun cost(): Double {
        return executions.map { it.order.size * it.price }.sum()
    }

    fun cost2() = executions.map { it.order.size * it.price }.sum()

    fun pnl(): Double {
        // market value - cost
        return marketValue() - cost()
    }
}
package com.sgcib.springbootcryptodemo.service

import com.sgcib.springbootcryptodemo.domain.Execution
import com.sgcib.springbootcryptodemo.domain.Order
import org.springframework.stereotype.Service

@Service
class MarketService {

    fun getLastPrice() = (50_000..60_000).shuffled().last().toDouble()

    fun execute(order: Order) = Execution(order, getLastPrice())

}
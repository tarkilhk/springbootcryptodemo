package com.sgcib.springbootcryptodemo.service

import org.springframework.stereotype.Service


@Service
class MarketService {

    fun getLastPrice() = (50_000..60_000).shuffled().last().toDouble()

}
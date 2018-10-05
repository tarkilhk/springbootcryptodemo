//package com.sgcib.springbootcryptodemo.service
//
//import io.mockk.every
//import io.mockk.mockk
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.parallel.Execution
//
//internal class PortfolioServiceTest {
//    private val marketService: MarketService = mockk()
//    private val portfolioService : PortfolioService = PortfolioService(marketService)
//
//    @BeforeEach
//    fun setUp() {
//        every { marketService.getLastPrice() } returns 200.0
//        portfolioService.addExecution(Execution(Order(10), 100.0))
//        portfolioService.addExecution(Execution(Order(20), 100.0))
//        portfolioService.addExecution(Execution(Order(20), 100.0))
//    }
//
//    @Test
//    fun `Test compute pnl, expect compute for all product`() {
//        val actual = portfolioService.getCalculatePnl()
//        assertEquals(5000.0, actual)
//    }
//}
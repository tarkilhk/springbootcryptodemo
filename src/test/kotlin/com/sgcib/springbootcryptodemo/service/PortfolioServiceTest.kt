//package com.sgcib.springbootcryptodemo.service
//
//import com.sgcib.springbootcryptodemo.domain.Execution
//import com.sgcib.springbootcryptodemo.domain.Order
//import io.mockk.every
//import io.mockk.mockk
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Test
//
//internal class PortfolioServiceTest {
//    private val marketService: MarketService = mockk()
//    private val portfolioService : PortfolioService = PortfolioService(marketService)
//
//    @BeforeEach
//    fun setUp() {
//        every { marketService.getLastPrice() } returns 200.0
//        portfolioService.addExecution(Execution(100.0, Order(10)))
//        portfolioService.addExecution(Execution(100.0, Order(20)))
//        portfolioService.addExecution(Execution(100.0, Order(20)))
//    }
//
//    @Test
//    fun `Test compute pnl, expect compute for all product`() {
//        val actual = portfolioService.calculatePnl()
//        assertEquals(5000.0, actual)
//    }
//}
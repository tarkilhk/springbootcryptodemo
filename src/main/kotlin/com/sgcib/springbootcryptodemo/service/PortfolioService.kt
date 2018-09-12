package com.sgcib.springbootcryptodemo.service

import com.sgcib.springbootcryptodemo.domain.Execution
import org.springframework.stereotype.Service

@Service
class PortfolioService {

    private val executions = mutableListOf<Execution>()

    fun addExecution(execution:Execution) = executions.add(execution)

    fun getExecutions() = executions

}
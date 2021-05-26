package com.example.demo

import com.hello.service.HelloService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

// Callback Interface after the application is start
@Component
class HelloCommandLinerRunner(
    private val helloService: HelloService
): CommandLineRunner {

    override fun run(vararg args: String?) {
        helloService.sayHello("Qualas")
    }
}
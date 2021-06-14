package com.example.demo

import com.annotations.Quala
import com.hello.service.ConsoleHelloService
import com.hello.service.HelloService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HelloAutoConfiguration {

    @Bean
    fun helloService(): HelloService {
        val quala = Quala(name = "Moshe")

        return ConsoleHelloService(quala)
    }
}
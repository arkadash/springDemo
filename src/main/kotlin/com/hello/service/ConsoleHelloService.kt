package com.hello.service

import com.annotations.Quala

class ConsoleHelloService(val quala: Quala): HelloService {

    override fun sayHello(text: String) {
        println("Hello $text!! from ${quala.name}");
    }
}
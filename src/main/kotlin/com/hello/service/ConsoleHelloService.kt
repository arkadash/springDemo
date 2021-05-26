package com.hello.service

class ConsoleHelloService: HelloService {
    override fun sayHello(text: String) {
        println("Hello $text!!");
    }
}
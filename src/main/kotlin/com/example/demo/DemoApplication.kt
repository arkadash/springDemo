package com.example.demo

import com.annotations.Quala
import com.annotations.Validator
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

val quala = Quala(name = "Moshe")

fun main(args: Array<String>) {
	val validator = Validator()
	if (validator.isValid(quala)) {
		runApplication<DemoApplication>(*args)
	} else {
		println("Failed to run the application since there are no valid qualas!");
	}
}

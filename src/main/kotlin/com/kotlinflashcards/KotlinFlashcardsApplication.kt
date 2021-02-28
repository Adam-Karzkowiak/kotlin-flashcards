package com.kotlinflashcards

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinFlashcardsApplication

fun main(args: Array<String>) {
	runApplication<KotlinFlashcardsApplication>(*args)
}

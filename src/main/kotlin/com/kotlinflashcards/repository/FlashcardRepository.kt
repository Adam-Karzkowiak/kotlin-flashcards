package com.kotlinflashcards.repository

import com.kotlinflashcards.model.Flashcard
import org.springframework.data.jpa.repository.JpaRepository

interface FlashcardRepository : JpaRepository<Flashcard, Int> {
    fun save(entity: Flashcard)
}
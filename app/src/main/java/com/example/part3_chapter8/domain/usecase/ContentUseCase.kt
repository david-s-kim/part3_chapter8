package com.example.part3_chapter8.domain.usecase

import com.example.part3_chapter8.domain.model.Content
import com.example.part3_chapter8.domain.repository.ContentRepository
import javax.inject.Inject

class ContentUseCase @Inject constructor(
    private val contentRepository: ContentRepository
) {
    suspend fun save(item : Content) = contentRepository.save(item)
}
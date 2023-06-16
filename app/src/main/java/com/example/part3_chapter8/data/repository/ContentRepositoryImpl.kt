package com.example.part3_chapter8.data.repository

import com.example.part3_chapter8.data.model.ContentMapper.toRequest
import com.example.part3_chapter8.data.source.remote.api.ContentService
import com.example.part3_chapter8.domain.model.Content
import com.example.part3_chapter8.domain.repository.ContentRepository
import java.io.IOException
import javax.inject.Inject

class ContentRepositoryImpl @Inject constructor(
    private val contentService: ContentService
) : ContentRepository{

    override suspend fun save(item: Content): Boolean {
        return try {
            contentService.saveItem(item.toRequest())
            true
        } catch (e : IOException) {
            false
        }
    }
}
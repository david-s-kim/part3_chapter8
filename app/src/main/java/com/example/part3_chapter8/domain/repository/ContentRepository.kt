package com.example.part3_chapter8.domain.repository

import com.example.part3_chapter8.domain.model.Content

interface ContentRepository {

    suspend fun save(item: Content) : Boolean
}
package com.example.part3_chapter8.data.model

import com.example.part3_chapter8.data.model.dto.ContentDto
import com.example.part3_chapter8.domain.model.Content

object ContentMapper {

    fun Content.toRequest() = ContentDto(
        id = id,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount,
        commentCount = commentCount,
        viewCount = viewCount
    )
}
package com.project.memo.domain.model.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class Memo(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @field:Column
    var title: String,

    @field:Column(columnDefinition = "TEXT")
    var content: String,
) {
    @field:Column(columnDefinition = "DATETIME")
    val createdAt = LocalDateTime.now()

    @field:Column
    var isDeleted: Boolean = false

    @field:Column(columnDefinition = "DATETIME")
    var deletedAt: LocalDateTime? = null
}

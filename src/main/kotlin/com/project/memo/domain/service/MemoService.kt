package com.project.memo.domain.service

import com.project.memo.domain.model.reposiroty.MemoRepository
import org.springframework.stereotype.Service

@Service
class MemoService(
    private val memoRepository: MemoRepository
)

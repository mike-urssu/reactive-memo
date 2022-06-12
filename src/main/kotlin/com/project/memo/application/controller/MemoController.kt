package com.project.memo.application.controller

import com.project.memo.domain.service.MemoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/memos")
class MemoController(
    private val memoService: MemoService
)

package com.project.memo.domain.model.reposiroty

import com.project.memo.domain.model.entity.Memo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemoRepository : JpaRepository<Memo, Int>

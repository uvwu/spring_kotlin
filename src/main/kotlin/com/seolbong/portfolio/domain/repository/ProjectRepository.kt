package com.seolbong.portfolio.domain.repository

import com.seolbong.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>
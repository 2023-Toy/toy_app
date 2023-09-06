package com.opensw.domain.usecase

import com.opensw.domain.model.DomainCommunityTab
import com.opensw.domain.repository.CommunityRepository

class CommunityUseCase(
    private val repository: CommunityRepository
) {
    suspend fun getCommunityTabList(): List<DomainCommunityTab>{
        return repository.getCommunityTabList()
    }
}
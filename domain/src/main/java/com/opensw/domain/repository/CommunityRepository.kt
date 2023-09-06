package com.opensw.domain.repository

import com.opensw.domain.model.DomainCommunityTab

interface CommunityRepository {
    suspend fun getCommunityTabList(): List<DomainCommunityTab>
}
package com.opensw.data.remote.dataSource

import com.opensw.data.remote.dto.CommunityTabDTO
import retrofit2.http.GET

interface CommunityDataSource {
    @GET("community/community")
    suspend fun getCommunityTabList(): CommunityTabDTO
}
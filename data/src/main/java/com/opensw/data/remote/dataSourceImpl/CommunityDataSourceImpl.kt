package com.opensw.data.remote.dataSourceImpl

import com.opensw.data.remote.dataSource.CommunityDataSource
import com.opensw.data.remote.dto.CommunityTabDTO
import retrofit2.Retrofit
import javax.inject.Inject

class CommunityDataSourceImpl @Inject constructor(
    private val retrofit: Retrofit
): CommunityDataSource {
    override suspend fun getCommunityTabList(): CommunityTabDTO {
        return retrofit.create(CommunityDataSource::class.java).getCommunityTabList()
    }
}
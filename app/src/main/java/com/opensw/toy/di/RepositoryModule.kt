package com.opensw.toy.di

import com.opensw.data.remote.dataSource.CommunityDataSource
import com.opensw.data.reposigoryImpl.CommunityRepositoryImpl
import com.opensw.domain.repository.CommunityRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideCommunityRepository(
        api: CommunityDataSource
    ): CommunityRepository{
        return CommunityRepositoryImpl(api)
    }
}
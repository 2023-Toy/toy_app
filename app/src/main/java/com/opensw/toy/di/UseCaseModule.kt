package com.opensw.toy.di

import com.opensw.domain.repository.CommunityRepository
import com.opensw.domain.usecase.CommunityUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideCommunityUseCase(repository: CommunityRepository): CommunityUseCase{
        return CommunityUseCase(repository)
    }
}
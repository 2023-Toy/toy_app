package com.opensw.toy.di

import com.opensw.data.remote.dataSource.CommunityDataSource
import com.opensw.data.remote.dataSourceImpl.CommunityDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun provideCommunityDataSource(
        retrofit: Retrofit
    ): CommunityDataSource{
        return CommunityDataSourceImpl(retrofit)
    }
}
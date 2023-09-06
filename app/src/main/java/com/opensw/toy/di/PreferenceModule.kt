package com.opensw.toy.di

import android.content.Context
import android.content.SharedPreferences
import com.opensw.data.local.Prefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PreferenceModule {

    @Provides
    @Singleton
    fun providePrefs(prefs: SharedPreferences): Prefs {
        return Prefs(prefs)
    }

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext appContext: Context): SharedPreferences {
        return appContext.getSharedPreferences("TOY_PREF", Context.MODE_PRIVATE)
    }
}
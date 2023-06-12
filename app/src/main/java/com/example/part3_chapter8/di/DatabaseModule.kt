package com.example.part3_chapter8.di

import android.content.Context
import androidx.room.Room
import com.example.part3_chapter8.data.source.local.AppDatabase
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Singleton
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun providesDataBase(@ApplicationContext context: Context) : AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "chapter9.db")
            .fallbackToDestructiveMigration()
            .build()
    }
}
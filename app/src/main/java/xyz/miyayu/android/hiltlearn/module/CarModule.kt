package xyz.miyayu.android.hiltlearn.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import xyz.miyayu.android.hiltlearn.model.Car
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CarModule {

    @Provides
    @Singleton
    fun provideCar(): Car {
        return Car()
    }
}
package com.lomovskiy.android.test.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindInteractor(interactorImpl: InteractorImpl): Interactor
//
    @Binds
    abstract fun bindRepo(repoImpl: RepoImpl): Repo

}
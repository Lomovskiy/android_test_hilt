package com.lomovskiy.android.test.hilt;

import androidx.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@Module
@InstallIn(ApplicationComponent.class)
public abstract class AppModule {

//    @Binds
//    abstract @NonNull Repo bindsRepo(@NonNull RepoImpl repoImpl);

    @Binds
    public abstract @NonNull Interactor bindsInteractor(@NonNull InteractorImpl interactorImpl);

    @Provides
    @NonNull
    public static Repo provideRepo() {
        return new RepoImpl();
    }

}

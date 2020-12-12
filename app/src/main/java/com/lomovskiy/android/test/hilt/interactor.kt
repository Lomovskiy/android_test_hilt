package com.lomovskiy.android.test.hilt

import javax.inject.Inject
import javax.inject.Singleton

interface Interactor

@Singleton
class InteractorImpl @Inject constructor(private val repo: Repo) : Interactor

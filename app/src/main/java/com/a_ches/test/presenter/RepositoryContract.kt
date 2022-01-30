package com.a_ches.test.presenter

import com.a_ches.test.repository.RepositoryCallback



internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}

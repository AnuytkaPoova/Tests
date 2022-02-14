package com.a_ches.test.presenter

import com.a_ches.test.model.SearchResponse
import com.a_ches.test.repository.RepositoryCallback
import io.reactivex.Observable


interface RepositoryContract {

    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>

    suspend fun searchGithubAsync(
        query: String
    ): SearchResponse
}

package com.a_ches.test.repository

import com.a_ches.test.model.SearchResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class GitHubRepository(private val gitHubApi: GitHubApi) {

    fun searchGithub(
        query: String,
        callback: GitHubRepositoryCallback
    ) {
        val call = gitHubApi.searchGithub(query)
        call?.enqueue(object : Callback<SearchResponse?> {

            override fun onResponse(
                call: Call<SearchResponse?>,
                response: Response<SearchResponse?>
            ) {
                callback.handleGitHubResponse(response)
            }

            override fun onFailure(
                call: Call<SearchResponse?>,
                t: Throwable
            ) {
                callback.handleGitHubError()
            }
        })
    }

    interface GitHubRepositoryCallback {
        fun handleGitHubResponse(response: Response<SearchResponse?>?)
        fun handleGitHubError()
    }
}

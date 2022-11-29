package com.sun.android.data.source.remote

import com.sun.android.data.model.Movie
import com.sun.android.data.source.MovieDataSource
import com.sun.android.data.source.remote.api.ApiService
import com.sun.android.data.source.remote.api.response.BaseResponse
import com.sun.android.utils.Constant

class MovieRemoteImpl(private val apiService: ApiService) : MovieDataSource.Remote {
    override suspend fun getMovies(): BaseResponse<List<Movie>> {
        return apiService.getTopRateMovies(apiKey = Constant.BASE_API_KEY)
    }

    override suspend fun getMovieDetail(movieId: Int): Movie {
        return apiService.getMovieDetails(movieId = movieId, apiKey = Constant.BASE_API_KEY)
    }
}

package com.example.arnold.githubcommit.api;

import com.example.arnold.githubcommit.model.RepoCommit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by arnold on 21/6/16.
 */
public interface GithubCommitService {

    @GET("repos/rails/rails/commits")
    Call<List<RepoCommit>> getCommitByAuthor(@Query("author") String author);

}

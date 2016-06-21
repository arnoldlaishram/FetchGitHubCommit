package com.example.arnold.githubcommit.dashboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.arnold.githubcommit.R;
import com.example.arnold.githubcommit.api.GithubCommitServiceImpl;
import com.example.arnold.githubcommit.model.RepoCommit;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by arnold on 21/6/16.
 */
public class MainActivity extends AppCompatActivity implements Callback<List<RepoCommit>> {

    @Bind(R.id.recycler_view) RecyclerView recyclerView;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getGithubCommit();
        showProgress();
    }

    private void getGithubCommit() {
        Call<List<RepoCommit>> repoCommitCall = GithubCommitServiceImpl.getGithubCommitService(this).getCommitByAuthor("rafaelfranca");
        repoCommitCall.enqueue(this);

    }

    @Override
    public void onResponse(Call<List<RepoCommit>> call, Response<List<RepoCommit>> response) {
        hideProgress();
        GitCommitAdapter gitCommitAdapter = new GitCommitAdapter(response.body());
        LinearLayoutManager llayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llayout);
        recyclerView.setAdapter(gitCommitAdapter);
    }

    @Override
    public void onFailure(Call<List<RepoCommit>> call, Throwable t) {
        hideProgress();
        Log.d("", t.getMessage());
    }

    private void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    private void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

}

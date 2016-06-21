package com.example.arnold.githubcommit.dashboard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.arnold.githubcommit.R;
import com.example.arnold.githubcommit.model.RepoCommit;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author Arnold Laishram.
 */
public class GitCommitAdapter extends RecyclerView.Adapter<GitCommitAdapter.GithubCommitViewHolder> {

    private List<RepoCommit> repoCommitList;
    private Context context;

    public GitCommitAdapter(List<RepoCommit> repoCommitList) {
        this.repoCommitList = repoCommitList;
    }

    @Override
    public GithubCommitViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        this.context = viewGroup.getContext();

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_commit, viewGroup, false);
        GithubCommitViewHolder githubCommitViewHolder = new GithubCommitViewHolder(v);

        return githubCommitViewHolder;
    }

    @Override
    public void onBindViewHolder(final GithubCommitViewHolder githubCommitViewHolder, int position) {

        RepoCommit repoCommit = repoCommitList.get(position);

        githubCommitViewHolder.txtAuthorName.setText(repoCommit.getCommit().getAuthor().getName());
        githubCommitViewHolder.txtCommitMessage.setText(repoCommit.getCommit().getMessage());
        githubCommitViewHolder.txtCommitCount.setText(""+(position+1));
    }

    @Override
    public int getItemCount() {
        return repoCommitList.size();
    }


    public class GithubCommitViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.txt_author_name) TextView txtAuthorName;
        @Bind(R.id.txt_commit_count) TextView txtCommitCount;
        @Bind(R.id.txt_commit_message) TextView txtCommitMessage;

        public GithubCommitViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }

}

package com.test;

import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHGist;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 * Created by Edvard Piri on 01.04.2017.
 */
public class TestGitApiCommands {

    public void GitHubTest() throws Exception{
        GitHub gitHub = GitHub.connectAnonymously();
//        GHRepository repository = gitHub.getRepository("");
//        repository.getCommit();
        GHGist ghGist = new GHGist();
        ghGist.getGitPullUrl();
//        GHContent content = new GHContent();
//        content.read();
    }
}


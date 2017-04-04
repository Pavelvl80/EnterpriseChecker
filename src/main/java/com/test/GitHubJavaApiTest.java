package com.test;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitUser;

import java.io.IOException;

/**
 * Created by Edvard Piri on 03.04.2017.
 */
public class GitHubJavaApiTest {
    public static void main(String[] args) throws Exception{
        GitHubJavaApiTest ghjat = new GitHubJavaApiTest();
        ghjat.gitHubJavaApiTest();
    }

    public void gitHubJavaApiTest() throws IOException {
        GitHub github = GitHub.connect();
        GitUser gitUser = new GitUser();
        GHUser user = github.getUser("pavelvl80");
        user.getRepositories();
    }


}

package com.test;

import org.kohsuke.github.GitHub;

import java.io.IOException;

/**
 * Created by Edvard Piri on 03.04.2017.
 */
public class GitHubJavaApiTest {
    public static void main(String[] args) {

    }
    public void gitHubJavaApiTest() throws IOException {
        GitHub gitHub = GitHub.connect();
        gitHub.checkApiUrlValidity();
    }
}

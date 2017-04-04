package com.test;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Edvard Piri on 03.04.2017.
 */
public class GitHubApiTest {


    // HTTP GET request
    private void sendGet() throws Exception {


        String url = "http://www.google.com/search?q=mkyong";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        File file = new File("https://github.com/Pavelvl80/HtmlChecker.git");
        file.length();
        // optional default is GET
    }

    // HTTP POST request
}

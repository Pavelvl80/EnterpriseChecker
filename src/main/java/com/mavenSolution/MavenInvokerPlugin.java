package com.mavenSolution;

import org.apache.maven.shared.invoker.*;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Edvard Piri on 07.04.2017.
 */
public class MavenInvokerPlugin {
    private static final List<String> PUBLISH_GOALS = Arrays.asList("integration-test");

    private final Invoker invoker;
    public MavenInvokerPlugin() {
        Invoker newInvoker = new DefaultInvoker();
        this.invoker = newInvoker;
    }

    public void publishSite() throws MavenInvocationException {
        InvocationRequest request = new DefaultInvocationRequest();
        request.setGoals(PUBLISH_GOALS);
        request.setPomFile(new File("C:\\Users\\Edvard Piri\\IdeaProjects\\enterpriseChecker\\pom.xml"));
        String str = request.getBuilder();

        InvocationResult result = invoker.execute(request);
        String str2 = request.getBuilder();
    }
}

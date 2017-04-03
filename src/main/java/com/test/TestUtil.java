package com.test;

import org.apache.maven.shared.invoker.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by Edvard Piri on 31.03.2017.
 */
public class TestUtil {

    private static final List<String> PUBLISH_GOALS = Arrays.asList( "clean", "site-deploy" );

    /*// define a field for the Invoker instance.
    private final Invoker invoker;

    // now, instantiate the invoker in the class constructor...
    public SomeClass( File localRepositoryDir )
    {
        Invoker newInvoker = new DefaultInvoker();
        newInvoker.setLocalRepositoryDirectory( localRepositoryDir );

        this.invoker = newInvoker;
    }

    // this method will be called repeatedly, and fire off new builds...
    public void publishSite( File siteDirectory ) throws Exception
    {
        InvocationRequest request = new DefaultInvocationRequest();
        request.setBaseDirectory( siteDirectory );
        request.setInteractive( false );
        request.setGoals( PUBLISH_GOALS );

        InvocationResult result = invoker.execute( request );

        if ( result.getExitCode() != 0 )
        {
            if ( result.getExecutionException() != null )
            {
                throw new PublishException( "Failed to publish site.",
                        result.getExecutionException() );
            }
            else
            {
                throw new PublishException( "Failed to publish site. Exit code: " +
                        result.getExitCode() );
            }
        }
    }*/

    public void test() throws Exception{
//        JUnitCore junit = new JUnitCore();
//        Result result = junit.run(FirstTest.class);
//        result.getFailures();
//        Failure failure = result.getFailures().get(0);
//        failure.getTestHeader();
//        result.wasSuccessful();
//
//        InvocationRequest request = new DefaultInvocationRequest();
//        request.getGoals();
//        request.setPomFile(new File("C:\\Users\\Edvard Piri\\IdeaProjects\\EnterpriseChecker\\pom.xml"));
//        request.setGoals(Collections.singletonList("verify"));
//        Invoker invoker = new DefaultInvoker();
//        InvocationResult ir = invoker.execute(request);
//        ir.getExecutionException();
//        MavenCommandLineBuilder mavenCommandLineBuilder = new MavenCommandLineBuilder();
//        mavenCommandLineBuilder.


        Process process = Runtime.getRuntime().exec("mvn test");
        process.waitFor();


    }
}

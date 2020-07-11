package com.myorg;

import software.amazon.awscdk.core.App;

public class HelloApp {
    public static void main(final String argv[]) {
        App app = new App();

        new PipelineStack(app, "sam-app-cicd");

        app.synth();
    }
}

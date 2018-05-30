package com.test.mytestapp;

import com.test.mytestapp.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<Config> {

    public static void main(final String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "Dropwizard Test App";
    }

    @Override
    public void initialize(final Bootstrap<Config> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Config configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new HelloResource());
    }

}

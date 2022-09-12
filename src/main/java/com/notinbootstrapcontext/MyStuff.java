package com.notinbootstrapcontext;

import org.reactivestreams.Publisher;

import io.micronaut.context.annotation.BootstrapContextCompatible;
import io.micronaut.context.env.Environment;
import io.micronaut.context.env.PropertySource;
import io.micronaut.discovery.config.ConfigurationClient;
import io.micronaut.http.ssl.ClientSslConfiguration;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@BootstrapContextCompatible
public class MyStuff implements ConfigurationClient {

    private final WebClient client;

    @Inject
    public MyStuff(final WebClient client) {
//        ClientSslConfiguration
        this.client = client;
    }

    @Override
    public Publisher<PropertySource> getPropertySources(final Environment environment) {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}

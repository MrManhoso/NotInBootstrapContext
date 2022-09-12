package com.notinbootstrapcontext;

import java.util.Collection;

import io.micronaut.context.annotation.BootstrapContextCompatible;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Retryable;
import io.reactivex.rxjava3.core.Single;

@Client("https://some.dns/path/stuff")
@Header(name = "Accept-Version", value = "1")
@Retryable
@BootstrapContextCompatible
public interface WebClient {
    @Get("/{ip}")
    Single<Collection<String>> getAll(@Header("Authorization") String auth,
        @PathVariable(name = "ip") String ip);
}

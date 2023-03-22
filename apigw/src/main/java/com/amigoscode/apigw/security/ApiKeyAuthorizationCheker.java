package com.amigoscode.apigw.security;

public interface ApiKeyAuthorizationCheker {
    boolean isAuthorize(String key, String application);
}

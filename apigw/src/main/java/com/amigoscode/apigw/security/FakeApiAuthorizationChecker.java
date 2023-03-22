package com.amigoscode.apigw.security;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service("fake")
public class FakeApiAuthorizationChecker implements ApiKeyAuthorizationCheker{

    private static final Map<String, List<String>> keys = Map.of(
            "supersecure", List.of("customer" +
                    "")
    );

    @Override
    public boolean isAuthorize(String key, String application) {
        return keys.getOrDefault(key,List.of())
                .stream()
                .anyMatch(k  -> k.contains(application));
    }
}

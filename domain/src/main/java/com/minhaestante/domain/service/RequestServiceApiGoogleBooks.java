package com.minhaestante.domain.service;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;

public class RequestServiceApiGoogleBooks {
    public HttpRequest criarRequest( String pesquisa){
        String apiKey = "AIzaSyDUZuDjnp7_By5SFEuA7xExLjF3OY2bVfs";
        String pesquisaEncode = URLEncoder.encode(pesquisa, StandardCharsets.UTF_8);

        return HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=" + pesquisaEncode + "&key=" + apiKey))
                .build();

    }
}

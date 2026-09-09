package com.minhaestante.domain.search;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class SearchApiGoogleBooks {
    public void procuraLivro(String pesquisa) throws IOException, InterruptedException {
        String apiKey = "AIzaSyDUZuDjnp7_By5SFEuA7xExLjF3OY2bVfs";
        String pesquisaEncode = URLEncoder.encode(pesquisa, StandardCharsets.UTF_8);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=" + pesquisaEncode + "&key=" + apiKey))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);
        
    }
}

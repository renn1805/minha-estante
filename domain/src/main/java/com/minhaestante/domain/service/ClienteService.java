package com.minhaestante.domain.service;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteService {

    private final HttpClient client;

    public ClienteService() {
        this.client =  HttpClient.newHttpClient();
    }

    public <T>HttpResponse<T> enviar(HttpRequest request, HttpResponse.BodyHandler<T> bodyHandler){
        try {
            return client.send(request, bodyHandler);
        } catch (IOException | InterruptedException  e) {
            throw new RuntimeException("Erro ao realizar requisição HTTP", e);
        }
    }

}

package com.minhaestante.domain.service;

import com.minhaestante.domain.dto.ResponseDto;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ResponseServiceApiGoogleBooks {

    public String buscarLivroJson(String pesquisa, ClienteService clienteService,RequestServiceApiGoogleBooks requestService){
        HttpRequest request = requestService.criarRequest(pesquisa);

        HttpResponse<String> response = clienteService.enviar(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return response.body();
        }else {
            System.out.println("Erro na requisição. Código HTTP: " + response.statusCode());
            return null;
        }
    }

}

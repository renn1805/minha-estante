package com.minhaestante.domain.service;

import com.google.gson.Gson;
import com.minhaestante.domain.dto.ResponseDto;
import com.minhaestante.domain.model.Livro;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class TratamentoJsonGoogleBooks {

    public Livro converterJson(String json, ClienteService clienteService) {
        Gson gson = new Gson();

        ResponseDto responseDto = gson.fromJson(json, ResponseDto.class);

        if (responseDto != null && responseDto.items() != null
                && !responseDto.items().isEmpty()) {
            ResponseDto.VolumeInfoDto volumeInfoDto = responseDto.items().getFirst().volumeInfo();

            String titulo = volumeInfoDto.title();

            String autor = (volumeInfoDto.authors() != null &&
                    !volumeInfoDto.authors().isEmpty())
                    ? volumeInfoDto.authors().getFirst()
                    : "Autor desconhecido";

            int paginas = volumeInfoDto.pageCount() != null ? volumeInfoDto.pageCount() : 0;

            String urlCapa = (volumeInfoDto.imageLinks() != null)
                    ? volumeInfoDto.imageLinks().smallThumbnail()
                    : null;

            byte[] capaEmBytes = new byte[0];

            if (urlCapa != null && !urlCapa.isBlank()) {
                urlCapa = urlCapa.replace("http://", "https://");

                HttpRequest requestImagem = HttpRequest.newBuilder()
                        .uri(URI.create(urlCapa))
                        .GET()
                        .build();
                HttpResponse<byte[]> responseImagem = clienteService.enviar(requestImagem,
                        HttpResponse.BodyHandlers.ofByteArray());

                if (responseImagem.statusCode() == 200) {
                    capaEmBytes = responseImagem.body();
                }
            }

            String descicao = (volumeInfoDto.description() != null && !volumeInfoDto.description().isBlank())
                    ? volumeInfoDto.description() : "Sem descrição disponível";


            return new Livro(titulo, descicao, autor, paginas, capaEmBytes);
        }

        return null;
    }
}





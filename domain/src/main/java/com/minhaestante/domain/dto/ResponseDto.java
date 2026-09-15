package com.minhaestante.domain.dto;

public record ResponseDto (String title,
                           String authors,
                           String publishedDate,
                           String description,
                           String categories,
                           String smallThumbnail,
                           String pageCount){
}

package com.minhaestante.domain.dto;

import java.util.List;

public record ResponseDto (List<ItemDto> items){ }

record ItemDto(VolumeInfoDto volumeInfo){}

record VolumeInfoDto(
        String title,
        List<String> authors,
        String publishedDate,
        String description,
        List<String> categories,
        ImageLinksDto imageLinks,
        Integer pageCount
){}

record ImageLinksDto(
        String smallThumbnail
){}

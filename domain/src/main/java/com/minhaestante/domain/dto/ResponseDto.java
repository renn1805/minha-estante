package com.minhaestante.domain.dto;

import java.util.List;

public record ResponseDto (List<ItemDto> items) {

    public record ItemDto(VolumeInfoDto volumeInfo) {
    }

    public record VolumeInfoDto(
            String title,
            List<String> authors,
            String publishedDate,
            String description,
            List<String> categories,
            ImageLinksDto imageLinks,
            Integer pageCount
    ) {
    }

    public record ImageLinksDto(
            String smallThumbnail
    ) {
    }
}

package com.easymap.easymap.dto.response.poi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoiImgResponseDTO {

    private Long poiImgId;

    private String poiImgS3Url;
}

package com.funnycode.onlineshop.model.mapper;

import com.funnycode.onlineshop.entity.Color;
import com.funnycode.onlineshop.model.dto.ColorDTOCreate;
import com.funnycode.onlineshop.model.dto.ColorDTOResponse;
import com.funnycode.onlineshop.model.dto.ColorDTOUpdate;

public class ColorMapper {
    public static Color toColor(ColorDTOCreate colorDTOCreate) {
        return Color.builder()
                .colorName(colorDTOCreate.getColorName())
                .build();
    }

    public static ColorDTOResponse toColorDTOResponse(Color color) {
        return ColorDTOResponse.builder()
                .id(color.getId())
                .colorName(color.getColorName())
                .build();
    }

    public static Color toColor(ColorDTOUpdate colorDTOUpdate) {
        return Color.builder()
                .colorName(colorDTOUpdate.getColorName())
                .build();
    }
}

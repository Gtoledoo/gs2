package com.gs2.gs2.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gs2.gs2.dtos.PainelSolarUpdateDto;
import com.gs2.gs2.dtos.PainelSolarResponseDto;
import com.gs2.gs2.dtos.PainelSolarCreateDto;
import com.gs2.gs2.model.PainelSolar;

@Component
public class PainelSolarMapper {

    @Autowired
    private  ModelMapper modelMapper;

    public PainelSolarResponseDto toDto(PainelSolar painelSolar) {
        return modelMapper.map(painelSolar, PainelSolarResponseDto.class);
    }

    public PainelSolar toModel(PainelSolarCreateDto dto) {
        return modelMapper.map(dto, PainelSolar.class);
    }

    public PainelSolar toModel(Long id, PainelSolarUpdateDto dto) {
        PainelSolar result = modelMapper.map(dto, PainelSolar.class);
        result.setId(id);
        return result;
    }

}

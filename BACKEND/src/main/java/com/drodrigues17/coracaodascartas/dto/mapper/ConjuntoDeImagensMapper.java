package com.drodrigues17.coracaodascartas.dto.mapper;

import com.drodrigues17.coracaodascartas.dto.api.ApiImageSet;
import com.drodrigues17.coracaodascartas.dto.response.ConjuntoDeImagensResponse;
import com.drodrigues17.coracaodascartas.model.ConjuntoDeImagens;

public interface ConjuntoDeImagensMapper {
    static ConjuntoDeImagens converterParaEntidade(ApiImageSet apiList) {
        return ConjuntoDeImagens.builder()
                .urlDaImagem(apiList.image_url())
                .urlDaImagemPequena(apiList.image_url_small())
                .urlDaImagemCortada(apiList.image_url_cropped())
                .build();
    }

    static ConjuntoDeImagensResponse converterParaResponse(ConjuntoDeImagens entidade) {
        return new ConjuntoDeImagensResponse(entidade.getUrlDaImagem(), entidade.getUrlDaImagemPequena(), entidade.getUrlDaImagemCortada());
    }
}

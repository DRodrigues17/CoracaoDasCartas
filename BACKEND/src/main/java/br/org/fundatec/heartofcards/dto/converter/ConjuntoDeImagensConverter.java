package br.org.fundatec.heartofcards.dto.converter;

import br.org.fundatec.heartofcards.dto.api.ApiImageSet;
import br.org.fundatec.heartofcards.dto.response.ConjuntoDeImagensResponse;
import br.org.fundatec.heartofcards.model.ConjuntoDeImagens;

public class ConjuntoDeImagensConverter {
    public static ConjuntoDeImagens converterParaEntidade(ApiImageSet apiList) {
        return ConjuntoDeImagens.builder()
                .urlDaImagem(apiList.image_url())
                .urlDaImagemPequena(apiList.image_url_small())
                .urlDaImagemCortada(apiList.image_url_cropped())
                .build();
    }

    public static ConjuntoDeImagensResponse ConverterParaResponse(ConjuntoDeImagens entidade) {
        return new ConjuntoDeImagensResponse(entidade.getUrlDaImagem(), entidade.getUrlDaImagemPequena(), entidade.getUrlDaImagemCortada());
    }
}

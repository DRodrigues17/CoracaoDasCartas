package br.org.fundatec.heartofcards.model.carta;

import br.org.fundatec.heartofcards.model.Deck;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Magia")
public class CartaMagia extends Carta {

    @Builder
    public CartaMagia(UUID id, String nome, String tipo, String descricaoDaCarta, List<Deck> decks, List<String> imagensDaCarta) {
        super(id, nome, tipo, descricaoDaCarta, decks, imagensDaCarta);
    }
}

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
@AllArgsConstructor
@DiscriminatorValue("Monstro")
public class CartaMonstro extends Carta{
    private int pontosDeAtaque;
    private int pontosDeDefesa;
    private int nivel;
    private String raca;
    private String atributo;

    @Builder
    public CartaMonstro(UUID id, String nome, String tipo, String descricaoDaCarta, List<Deck> decks, List<String> imagensDaCarta, int pontosDeAtaque, int pontosDeDefesa, int nivel, String raca, String atributo) {
        super(id, nome, tipo, descricaoDaCarta, decks, imagensDaCarta);
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
        this.nivel = nivel;
        this.raca = raca;
        this.atributo = atributo;
    }
}

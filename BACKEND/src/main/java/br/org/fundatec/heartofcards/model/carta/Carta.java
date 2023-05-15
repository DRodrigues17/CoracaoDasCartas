package br.org.fundatec.heartofcards.model.carta;

import br.org.fundatec.heartofcards.model.ConjuntoDeImagens;
import br.org.fundatec.heartofcards.model.Deck;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
    protected String nome;
    protected String tipo;
    @Lob
    protected String descricaoDaCarta;
    @Nullable
    @ManyToMany(mappedBy = "cartas")
    protected List<Deck> decks;
    @OneToMany(mappedBy = "carta")
    protected List<ConjuntoDeImagens> imagensDaCarta;
    protected int pontosDeAtaque;
    protected int pontosDeDefesa;
    protected int nivel;
    protected String raca;
    protected String atributo;

}

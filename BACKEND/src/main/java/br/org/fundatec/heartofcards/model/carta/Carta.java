package br.org.fundatec.heartofcards.model.carta;

import br.org.fundatec.heartofcards.model.Deck;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_carta",
        discriminatorType = DiscriminatorType.STRING)
public abstract class Carta {
    @Id
    protected UUID id;
    protected String nome;
    protected String tipo;
    protected String descricaoDaCarta;

    @ManyToMany(mappedBy = "cartas")
    protected List<Deck> decks;

    protected List<String> imagensDaCarta;
}

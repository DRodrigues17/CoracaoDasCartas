package br.org.fundatec.heartofcards.model;

import br.org.fundatec.heartofcards.model.carta.Carta;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Deck {

    @Id
    private UUID id;
    private String nome;
    private String descricao;

    @ManyToMany
    @JoinTable(name = "carta_deck",
            joinColumns = @JoinColumn(name = "carta_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "deck_id", referencedColumnName = "id"))
    private List<Carta> cartas;
}

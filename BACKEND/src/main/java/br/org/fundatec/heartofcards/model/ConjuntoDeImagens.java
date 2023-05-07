package br.org.fundatec.heartofcards.model;

import br.org.fundatec.heartofcards.model.carta.Carta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConjuntoDeImagens {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idDaLista;
    private String urlDaImagem;
    private String urlDaImagemPequena;
    private String urlDaImagemCortada;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Carta carta;

}

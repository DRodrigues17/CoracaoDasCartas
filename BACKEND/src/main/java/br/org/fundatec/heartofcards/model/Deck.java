package br.org.fundatec.heartofcards.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Deck {

    private UUID id;
    private String nome;
    private String descricao;
    private List<Card> cards = new ArrayList<>();
}

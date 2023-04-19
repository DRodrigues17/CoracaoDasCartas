package br.org.fundatec.heartofcards.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url= "https://db.ygoprodeck.com/api/v7/cardinfo.php")
public class CardClient {

}

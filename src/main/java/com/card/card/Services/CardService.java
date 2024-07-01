package com.card.card.Services;

import com.card.card.Dao.CardRepository;
import com.card.card.entities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
@Autowired
private CardRepository cardRepository;

public List<Card> getAllUser()
{
List<Card> list=(List<Card>) this.cardRepository.findAll();
return list;
}

public Card getByUser(long id){
    Card card=null;
card=this.cardRepository.findById(id);
return card;

}

public Card addUser(Card c){
Card v=this.cardRepository.save(c);
return v;
}

public void deleteUser(long l){
this.cardRepository.deleteById(l);
}

public void updateUser(Card card,long l)
{
    this.cardRepository.save(card);
}

}

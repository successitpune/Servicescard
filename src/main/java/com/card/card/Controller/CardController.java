package com.card.card.Controller;

import com.card.card.Services.CardService;
import com.card.card.entities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class CardController {
@Autowired
private CardService cardService;

@GetMapping("/card")


public List<Card> getAllUser()
{
return this.cardService.getAllUser();
}
@GetMapping("/card/{id}")
public Card getById(@PathVariable ("id")long id)
{
return this.cardService.getByUser(id);
}

    @PostMapping("/card")
    public Card addCard(@RequestParam("photo") MultipartFile photo,
                        @RequestParam("heading") String heading,
                        @RequestParam("headingtwo") String headingtwo,
                        @RequestParam("price") long price,
                        @RequestParam("priceinfo") String priceinfo,
                        @RequestParam("desc") String desc,
                        @RequestParam("desctwo") String desctwo,
                        @RequestParam("cart") String cart) throws IOException {

        Card card = new Card();
        card.setPhoto(photo.getBytes());  // Store image as byte array
        card.setHeading(heading);
        card.setHeadingtwo(headingtwo);
        card.setPrice(price);
        card.setPriceinfo(priceinfo);
        card.setDesc(desc);
        card.setDesctwo(desctwo);
        card.setCart(cart);

        // Call service method to add the card
        return cardService.addUser(card);
    }


@DeleteMapping("/card/{cardid}")
    public void deleteUser(@PathVariable("cardid")long cardid){
    this.cardService.deleteUser(cardid);
}
@PutMapping("/card/{cardid}")
public Card UpdateUser(@RequestBody Card card,@PathVariable("cardid") long cardid){
this.cardService.updateUser(card,cardid);
return card;
}
}

package com.card.card.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;

@Data
@NoArgsConstructor
@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Assuming it's an auto-generated numeric ID

    @Lob
    private byte[] photo;

    private String heading;
    private String headingtwo;
    private long price;
    private String priceinfo;

    @Column(name = "description") // Use a different name for the column to avoid reserved keyword
    private String desc;

    private String desctwo;
    private String cart;

    // Constructors
    public Card(byte[] photo, String heading, String headingtwo, long price, String priceinfo, String desc, String desctwo, String cart) {
        this.photo = photo;
        this.heading = heading;
        this.headingtwo = headingtwo;
        this.price = price;
        this.priceinfo = priceinfo;
        this.desc = desc;
        this.desctwo = desctwo;
        this.cart = cart;
    }

    // Getters and setters
    // ID getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Photo getter and setter
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    // Other getters and setters omitted for brevity

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", photo=" + Arrays.toString(photo) +
                ", heading='" + heading + '\'' +
                ", headingtwo='" + headingtwo + '\'' +
                ", price=" + price +
                ", priceinfo='" + priceinfo + '\'' +
                ", desc='" + desc + '\'' +
                ", desctwo='" + desctwo + '\'' +
                ", cart='" + cart + '\'' +
                '}';
    }
}

package br.com.guilchaves.ramengo.dto;

import br.com.guilchaves.ramengo.entities.Broth;

import java.io.Serial;
import java.io.Serializable;

public class BrothDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -6151182268731269286L;

    private String id;
    private String imageInactive;
    private String imageActive;
    private String name;
    private String description;
    private Double price;


    public BrothDTO() {
    }

    public BrothDTO(Broth entity){
        this.id = entity.getId();
        this.imageInactive = entity.getImageInactive();
        this.imageActive = entity.getImageActive();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
    }

    public String getId() {
        return id;
    }

    public String getImageInactive() {
        return imageInactive;
    }

    public String getImageActive() {
        return imageActive;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}

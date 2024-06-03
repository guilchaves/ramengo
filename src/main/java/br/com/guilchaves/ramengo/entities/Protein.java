package br.com.guilchaves.ramengo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_protein")
public class Protein implements Serializable {

    @Serial
    private static final long serialVersionUID = 2693067448728628450L;

    @Id
    private String id;
    private String imageInactive;
    private String imageActive;
    private String name;
    private String description;
    private Double price;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Protein protein = (Protein) o;
        return Objects.equals(id, protein.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Protein{" +
                "id='" + id + '\'' +
                ", imageInactive='" + imageInactive + '\'' +
                ", imageActive='" + imageActive + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

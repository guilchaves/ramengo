package br.com.guilchaves.ramengo.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Table(name = "tb_order_request")
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 4528359399475036453L;

    @OneToOne
    @JoinColumn(name = "broth_id")
    private Broth broth;

    @OneToOne
    @JoinColumn(name = "protein_id")
    private Protein protein;

    public Broth getBroth() {
        return broth;
    }

    public void setBroth(Broth broth) {
        this.broth = broth;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order that = (Order) o;
        return Objects.equals(broth, that.broth) && Objects.equals(protein, that.protein);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broth, protein);
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "broth=" + broth +
                ", protein=" + protein +
                '}';
    }
}

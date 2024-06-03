package br.com.guilchaves.ramengo.dto;

public class OrderRequestDTO {
    private String brothId;
    private String proteinId;

    public OrderRequestDTO(String brothId, String proteinId) {
        this.brothId = brothId;
        this.proteinId = proteinId;
    }

    public OrderRequestDTO() {
    }

    public String getBrothId() {
        return brothId;
    }

    public void setBrothId(String brothId) {
        this.brothId = brothId;
    }

    public String getProteinId() {
        return proteinId;
    }

    public void setProteinId(String proteinId) {
        this.proteinId = proteinId;
    }
}

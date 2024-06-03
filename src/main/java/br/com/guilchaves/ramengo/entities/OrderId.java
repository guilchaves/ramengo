package br.com.guilchaves.ramengo.entities;

public class OrderId {

    private String orderId;

    public OrderId() {
    }

    public OrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}

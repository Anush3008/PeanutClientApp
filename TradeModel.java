package com.example.peanutclientapp.activities;

public class TradeModel {
    private String tradeId;
    private String type;
    private String product;
    private String amount;
    private String status;

    public TradeModel(String tradeId, String type, String product, String amount, String status) {
        this.tradeId = tradeId;
        this.type = type;
        this.product = product;
        this.amount = amount;
        this.status = status;
    }

    public String getTradeId() { return tradeId; }
    public String getType() { return type; }
    public String getProduct() { return product; }
    public String getAmount() { return amount; }
    public String getStatus() { return status; }
}
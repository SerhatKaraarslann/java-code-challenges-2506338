package com.linkedinlearning.challenges;

public class VATCalculator {

  public double vat;
  public String currencySymbol;

  public VATCalculator(double vat, String currencySymbol)
  {
    this.vat = vat;
    this.currencySymbol = currencySymbol;
  }

  public String renderInvoice(double price)
  {
    var vatAmount = calculateVAT(price);
    var total = price + vatAmount;

    return """
        Netto : %.2f%s
        VAT(%.2f): %.2f%s
        Total : %.2f%s
        """.formatted(price,currencySymbol,
        vat,vatAmount,currencySymbol,total,currencySymbol);
  }

  private double calculateVAT(double price) {
    
    return price*vat;
  }

}

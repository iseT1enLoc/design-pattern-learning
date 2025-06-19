/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.Momo;

/**
 *
 * @author iseT1enLoc
 */
public interface MomoPaymentInterface {
    //get card no
    String getCardNo();
    //get exp month
    int getExpirationMonth();
    //get exp year
    int getExpirationYear();
    //get card amount
    float getCardAmount();
    //get customer name
    String getCustomerName();
    void setMomoNo(String momoNo);

    void setExpirationMonth(int expirationMonth);

    void setExpirationYear(int expirationYear);

    void setCardAmount(float cardAmount);

    void setCustomerName(String customerName);
    
    
}

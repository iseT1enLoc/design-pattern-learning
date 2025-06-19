/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adapter.VNpay;

/**
 *
 * @author iseT1enLoc
 */
public interface VNPayInterface {
    //get card no
    String getCardNo();
    //get exp month
    int getExpirationMonth();
    //get exp year
    int getExpirationYear();
    //get card amount
    float getCardAmount();
    //get customer name
    String getOwnerName();
    
    void setVnpayNo(String vnpayNo);
    

    void setExpirationMonth(int expirationMonth);
    void setExpirationYear(int expirationYear);

    void setCardAmount(float cardAmount);

    void setOwnerName(String ownerName);
}

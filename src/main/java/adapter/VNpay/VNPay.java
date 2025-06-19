/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.VNpay;

/**
 *
 * @author iseT1enLoc
 */
public class VNPay implements VNPayInterface {
    String vnpayNo;
    int expirationMonth;
    int expirationYear;
    float cardAmount;
    String ownerName;

    @Override
    public String toString() {
        return "VNPay{" + "vnpayNo=" + vnpayNo + ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear + ", cardAmount=" + cardAmount + ", ownerName=" + ownerName + '}';
    }

    
    @Override
    public void setVnpayNo(String vnpayNo) {
        this.vnpayNo = vnpayNo;
    }
    
    @Override
    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }
    
    @Override
    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    @Override
    public void setCardAmount(float cardAmount) {
        this.cardAmount = cardAmount;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    
    @Override
    public String getCardNo() {
        return vnpayNo;
    }

    @Override
    public int getExpirationMonth() {
        return this.expirationMonth;
    }

    @Override
    public int getExpirationYear() {
        return this.expirationYear;
    }

    @Override
    public float getCardAmount() {
        return this.cardAmount;
    }

    @Override
    public String getOwnerName() {
        return this.ownerName;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.VNPayToMomoAdapter;

import adapter.Momo.MomoPaymentInterface;
import adapter.VNpay.VNPay;
import adapter.VNpay.VNPayInterface;

/**
 *
 * @author iseT1enLoc
 */
public final class VNPayToMomoAdapter implements MomoPaymentInterface {
    String momoNo;
    int expirationMonth;
    int expirationYear;
    float cardAmount;
    String customerName;
    VNPayInterface vnpay;

    public VNPayToMomoAdapter(VNPayInterface vnpay) {
        this.vnpay = vnpay;
        setProps();
    }

    @Override
    public String toString() {
        return "VNPayToMomoAdapter{" + "momoNo=" + momoNo + ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear + ", cardAmount=" + cardAmount + ", customerName=" + customerName + ", vnpay=" + vnpay + '}';
    }


    @Override
    public String getCardNo() {
       return this.momoNo;
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
    public String getCustomerName() {
       return this.customerName;
    }

    @Override
    public void setMomoNo(String momoNo) {
       this.momoNo = momoNo;
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
    public void setCustomerName(String customerName) {
       this.customerName = customerName;
    }

    void setProps(){
        setCardAmount(this.vnpay.getCardAmount());
        setExpirationMonth(this.vnpay.getExpirationMonth());
        setExpirationYear(this.vnpay.getExpirationYear());
        setCustomerName(this.vnpay.getOwnerName());
        setMomoNo(this.vnpay.getCardNo());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adapter;

import com.mycompany.designpattern.*;
import adapter.Momo.MomoPayment;
import adapter.Momo.MomoPaymentInterface;
import adapter.VNPayToMomoAdapter.VNPayToMomoAdapter;
import adapter.VNpay.VNPay;
import adapter.VNpay.VNPayInterface;

/**
 *
 * @author iseT1enLoc
 */
public class Designpattern {

    public static void main(String[] args) {
        MomoPaymentInterface momo = new MomoPayment();
        momo.setCardAmount(10000000);
        momo.setCustomerName("Nguyen Vo Tien Loc");
        momo.setExpirationMonth(9);
        momo.setExpirationYear(2026);
        momo.setMomoNo("jiafhihwg#");
        System.out.println(momo);
        
        VNPayInterface vnpay = new VNPay();
        vnpay.setCardAmount(100000000);
        vnpay.setExpirationMonth(10);
        vnpay.setExpirationYear(2027);
        vnpay.setOwnerName("Pham Van Duy");
        vnpay.setVnpayNo("8h8h8fhw8h8");
        System.out.println(vnpay);
        
        MomoPaymentInterface momov2 = new VNPayToMomoAdapter(vnpay);
        System.out.println(momov2);
    }
}

package ai.indxo;

import java.util.function.Supplier;

public class SupplierOTPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> s = ()->{
			String otp = "";
			for(int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random()*10);
			}
			return otp;
		};
		System.out.println("OTP: "+s.get());
		System.out.println("OTP: "+s.get());
		System.out.println("OTP: "+s.get());
	}

}

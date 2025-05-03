package ai.indxo;

import java.security.SecureRandom;

public class OTPGenerator {

    // Define characters allowed in OTP (uppercase, lowercase, digits)
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

    // Method to generate OTP
    public static String generateOTP(int length) {
        if (length <= 0) throw new IllegalArgumentException("OTP length must be greater than 0.");

        StringBuilder otp = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            otp.append(CHARACTERS.charAt(index));
        }
        return otp.toString();
    }

    public static void main(String[] args) {
        int otpLength = 6;  // Set desired OTP length
        String otp = generateOTP(otpLength);
        System.out.println("Generated OTP: " + otp);
    }
}

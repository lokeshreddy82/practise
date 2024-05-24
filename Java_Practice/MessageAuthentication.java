import javax.crypto.Mac; 
import javax.crypto.spec.SecretKeySpec; 
import java.security.InvalidKeyException; 
import java.security.NoSuchAlgorithmException; 
public class MessageAuthentication { 
    public static void main(String[] args) { 
        String key = "secretKey"; 
        String message = "Hello, world!"; 
        try { 
            String hmacSHA256 = calculateHMAC(key, message); 
            System.out.println("HMAC-SHA256: " + hmacSHA256); 
        } catch (NoSuchAlgorithmException | InvalidKeyException e) { 
            e.printStackTrace(); 
        } 
    } 
    private static String calculateHMAC(String key, String message) 
        throws NoSuchAlgorithmException, InvalidKeyException { 
        String algorithm = "HmacSHA256"; 
        Mac mac = Mac.getInstance(algorithm); 
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm); 
        mac.init(secretKeySpec); 
        byte[] hmacBytes = mac.doFinal(message.getBytes()); 
        // Convert bytes to hexadecimal format 
        StringBuilder sb = new StringBuilder(); 
        for (byte b : hmacBytes) { 
            sb.append(String.format("%02x", b)); 
        }
        return sb.toString(); 
    } 

}

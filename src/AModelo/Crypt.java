package AModelo;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

//Esto nos ayuda por ejemplo a la pantalla de registro a encriptar la contraseña por medio del metodo Blowfish
public class Crypt {
    private static final String ALGORITHM = "Blowfish";
    
   public static String encrypt(String input, String key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

   //Esto nos ayuda a desencreptar la contraseña por ejemplo en el de recup por preguntas de seguridad donde le aparecera la contraseña desencreptada y podra verla
    public static String decrypt(String encryptedInput, String key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedInput);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}

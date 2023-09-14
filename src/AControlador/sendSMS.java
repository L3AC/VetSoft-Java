
package AControlador;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class sendSMS {
public static final String ACCOUNT_SID = "ACfb0b56fe70356e0a7d5445a49cbb233b";
    public static final String AUTH_TOKEN = "120668d9764bde64c286bdae580930c9";
    public static final String TWILIO_PHONE_NUMBER = "+16067140725";

    public void send(String tel,String code) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(
                new PhoneNumber("+503" + tel),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                "Tu código de recuperación es " + code
        ).create();

        System.out.println(message.getSid());
    }
   
}

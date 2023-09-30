
package AControlador;

import com.twilio.Twilio;
import com.twilio.exception.TwilioException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class sendSMS {
    public static final String ACCOUNT_SID = "ACfb0b56fe70356e0a7d5445a49cbb233b";
    public static final String AUTH_TOKEN = "77bb0b84e1bb359f04054d7ad2238c23";
    public static final String TWILIO_PHONE_NUMBER = "+16067140725";

    public void send(String tel,String code) {
        try{
            
        
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(
                new PhoneNumber("+503" + tel),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                "Su código de recuperación es " + code
        ).create();
        System.out.println(message.getSid());
        }
        catch(TwilioException e){
            System.err.println(e.toString());
        }
    }
   
}

package ISPGood;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class ApplePhone implements getSMS,MakeCall,ReceiveCall,SendSMS
{

        @Override
        public String makePhoneCall() {
            return "Number is being dialled";
        }

        @Override
        public String receiveCall() {
            return "You are receiving a call!";
        }

        @Override
        public String receiveText() {
            return "You have received an SMS";
        }

        @Override
        public String sendText()
        {
            return "Send a message";
        }

}

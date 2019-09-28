import org.eclipse.paho.client.mqttv3.*;
import java.lang.Throwable;
import java.awt.AWTException;
import java.awt.Robot;

public class SubscribeCallback implements MqttCallback {

     public void connectionLost(Throwable cause) {}

     public void messageArrived(String topic, MqttMessage message) {
    	 Robot robot = null;
    	 try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 System.out.println(topic + ": " + message.toString());
    	 char tecla = message.toString().charAt(0);
    	 switch(tecla) {
    	 //IZQUIERDA
    	 case 'l':
    		 robot.keyPress(90);
    		 break;
    		 //GOLPE
    	 case 'v':
    		 robot.keyPress(88);
    		 break;
    		 //DERECHA
    	 case 'r':
    		 robot.keyPress(67);
    		 break;
    	 }
     }

     public void deliveryComplete(IMqttDeliveryToken token) {}

}
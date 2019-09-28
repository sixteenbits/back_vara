import org.eclipse.paho.client.mqttv3.*;
import java.lang.Throwable;

public class SubscribeCallback implements MqttCallback {

     public void connectionLost(Throwable cause) {}

     public void messageArrived(String topic, MqttMessage message) {
          System.out.println(topic + ": " + message.toString());
     }

     public void deliveryComplete(IMqttDeliveryToken token) {}

}
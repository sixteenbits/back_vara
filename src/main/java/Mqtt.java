import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.internal.ClientComms;
import org.eclipse.paho.client.mqttv3.internal.ClientState;
import org.eclipse.paho.client.mqttv3.internal.MessageCatalog;
import java.awt.Robot;

public class Mqtt {
	 static MqttClient client;
	public static void main(String[] args) {
		
        String clientId = "cliente";
        
        try {
            client = new MqttClient(BROKER_URL, clientId);
            client.setCallback(new SubscribeCallback());
            client.connect();
            client.subscribe("jamtoday/vara");
        }
        catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        }
        
	}
	public static final String BROKER_URL = "tcp://192.168.43.215:1883";
    

    public Mqtt() {

    }
}

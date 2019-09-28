import org.eclipse.paho.client.mqttv3.*;
/*import org.eclipse.paho.client.mqttv3.internal.ClientComms;
import org.eclipse.paho.client.mqttv3.internal.ClientState;
import org.eclipse.paho.client.mqttv3.internal.MessageCatalog;
import java.awt.Robot;*/

public class Mqtt {
	 static MqttClient client;
	 public static final String BROKER_URL = "tcp://localhost:1883";
	public static void main(String[] args) {
		
		String url = args[0];
        String clientId = "cliente";
        final String TOPIC = "jamtoday/vara";
        
        try {
            client = new MqttClient(BROKER_URL, clientId);
            client.setCallback(new SubscribeCallback());
            client.connect();
            System.out.println("Entra");
            client.subscribe(TOPIC);
        }
        catch (MqttException e) {
            e.printStackTrace();
            System.exit(1);
        }
        
	}
	
    

    public Mqtt() {

    }
}

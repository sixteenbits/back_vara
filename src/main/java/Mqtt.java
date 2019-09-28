import org.eclipse.paho.client.mqttv3.*;

public class Mqtt {
	public static final String BROKER_URL = "tcp://192.168.43.215:1883";
    private MqttClient client;

    public Mqtt() {

         String clientId = "demonio";
         try {
             client = new MqttClient(BROKER_URL, clientId);
         }
         catch (MqttException e) {
             e.printStackTrace();
             System.exit(1);
         }
    }

    public void start() {

         try {
             client.setCallback(new SubscribeCallback());
             client.connect();
             client.subscribe("derecha");
             client.subscribe("izquierda");
             client.subscribe("golpe");
         }
         catch (MqttException e) {
             e.printStackTrace();
             System.exit(1);
         }

    }
}

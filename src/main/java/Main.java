import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

public class Main  {


    public static void main(String[] args) {



        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("ws://192.168.1.9:8000/JsonData").build();
        WebSocketServer listener = new WebSocketServer();
        WebSocket ws = client.newWebSocket(request, listener);

//
//        client.dispatcher().executorService().shutdown();


    }

}

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConnectionAPI {
	
	private String address = "https://economia.awesomeapi.com.br/json/last/";
	
	public String requestAPI(String requestCoin) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(address + requestCoin + "-BRL"))
				.build();
	}
}

package Http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpStart {
    public static void main(String[] args) throws URISyntaxException, IOException,
            InterruptedException {
        String uri = "https://static-maps.yandex.ru/v1\n" +
                "  ? apikey=<string>\n" +
                "  & ll=<float,float>\n" +
                "  & [spn=<float>]" +
                "  & [z=<integer>]\n" +
                "  & [size=<integer,integer>]\n" +
                "  & [scale=<float>]\n" +
                "  & [pt=<string>]\n" +
                "  & [pl=<string>]";
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(uri)).GET().build();
        HttpResponse<String> response = HttpClient.newHttpClient().
                send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response);
        System.out.println(response.body());


    }
}

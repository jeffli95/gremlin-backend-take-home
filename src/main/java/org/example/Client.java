package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {
    final static String url = "http://api.forismatic.com/api/1.0/";

    ObjectMapper objectMapper = new ObjectMapper();
    HttpClient httpClient;

    public Client() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public String sendPost(String lang) throws IOException, InterruptedException {
        String urlWithParameters = url + new RequestParameters(lang);
        HttpRequest request = HttpRequest.newBuilder()
                .setHeader("Accept", "application/json")
                .setHeader("Content-type", "application/json")
                .uri(URI.create(urlWithParameters))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), Response.class).toString();
    }
}

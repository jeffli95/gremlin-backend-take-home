package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] validArgs = { "English", "Russian", null };
        String lang = null;
        if (args.length > 0) {
            lang = args[0];
        }
        if (!Arrays.asList(validArgs).contains(lang)) {
            System.out.println("Error: Only English, Russian, or null are accepted as arguments");
        } else {
            Client client = new Client();
            String response = client.sendPost(lang);
            System.out.println(response);
        }
    }
}
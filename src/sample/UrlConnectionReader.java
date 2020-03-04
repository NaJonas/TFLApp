package sample;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class UrlConnectionReader {
    public static String read() throws Exception {
        String url = "https://api.tfl.gov.uk/Line/circle/Status?detail=true&app_id=d46d49e5&app_key=2ac0358f4a33011d62a582e5c912c430\n";
        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();

        // Optional default is Get
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);


        StringBuilder response = new StringBuilder();
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {


            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }



            //print result
            System.out.println(response.toString());
        }
        // Cut Down the Input String so JSONObject can read it and I can get status Description
        String substring = response.substring(response.indexOf("{")+1);
        substring.trim();
        String temp = substring.substring(substring.indexOf("{"));
        temp.trim();



        JSONObject myRespone = new JSONObject(temp);
        System.out.println("Status of Circle Line: " + myRespone.getString("statusSeverityDescription"));
        return myRespone.getString("statusSeverityDescription");




    }
}


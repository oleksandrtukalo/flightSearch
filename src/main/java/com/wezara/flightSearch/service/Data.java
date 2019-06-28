package com.wezara.flightSearch.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@Service
public class Data {

    private static String getConnection() {
        String result = "";
        try {
            URL url = new URL("https://kbp.aero/wp-content/themes/borispol-magenta/js/board.js");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            System.out.println("Response code is: " + responsecode);
            if (responsecode != 200)
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            else {
                Scanner sc = new Scanner(url.openStream());
                sc.nextLine();
                sc.nextLine();
                sc.nextLine();
                result = "[" + sc.nextLine().substring(1).replaceAll(",}", "}") + "]";
                sc.close();
            }
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String getFlightArray() {
        return getConnection();
    }
}

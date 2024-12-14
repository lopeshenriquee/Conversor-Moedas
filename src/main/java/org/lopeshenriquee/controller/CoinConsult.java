package org.lopeshenriquee.controller;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CoinConsult {
    public Coin getCoin(String baseCurrency, String targetCurrency) {
        String urlStr = ("https://v6.exchangerate-api.com/v6/39e7c4f49219e92df88e94fa/latest/" + baseCurrency);
        try {
            URL url = new URL(urlStr);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null){
                content.append(inputLine);
            }

            in.close();
            conn.disconnect();

            JSONObject json = new JSONObject(content.toString());

            if (!json.getString("result").equalsIgnoreCase("success")){
                throw new RuntimeException("Moeda inválida ou erro na API" + json.getString("error-type"));
            }

            JSONObject rates = json.getJSONObject("conversion_rates");

            if (!rates.has(targetCurrency)){
                throw new RuntimeException("Moeda de destino invàlida: " + targetCurrency);
            }

            double value = rates.getDouble(targetCurrency);
            String lastUpdateUtc = json.getString("time_last_update_utc");

            return new Coin(targetCurrency, value, lastUpdateUtc);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter dados da API: " + e.getMessage());
        }
    }
}

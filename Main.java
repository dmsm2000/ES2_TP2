import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        // Criar e exportar
        /*
        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", 100);

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter(".\\JSON_RESULTS\\test.json")) {
            file.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);
        */

        // Importar

        /*
        JSONParser parser = new JSONParser();

        JSONObject orders = (JSONObject) parser.parse(new FileReader(".\\JSON_IMPORT\\orders.json"));

        JSONArray a = (JSONArray) orders.get("orders");

        for (int i = 0; i < a.size(); i++) {

            JSONObject order = (JSONObject) a.get(i);

            String customer =  order.get("customer").toString();
            System.out.println(customer);

            String destination = order.get("destination").toString();
            System.out.println(destination);

            String containers = order.get("containers").toString();
            System.out.println(containers);
        */

        try {
            String file = new String(Files.readAllBytes(Paths.get(".\\JSON_IMPORT\\orders.json")));

            Gson gson = new Gson();

            OrdersCollection shippingOrder = gson.fromJson(file,OrdersCollection.class);

        } catch (IOException e) {
            System.out.println("Erro ao carregar o ficheiro!");
        }



        }

    }


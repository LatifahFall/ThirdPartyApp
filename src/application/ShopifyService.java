package application;

import application.models.Order;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ShopifyService {

    public static void processOrders() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Order> orders = mapper.readValue(new File("data/input.json"),
                    mapper.getTypeFactory().constructCollectionType(List.class, Order.class));
            mapper.writeValue(new File("data/output.json"), orders);
            System.out.println("Traitement des commandes terminé !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskManager {

    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void scheduleTask() {
        scheduler.scheduleAtFixedRate(() -> {
            ShopifyService.processOrders();
            System.out.println("Planification automatique effectuée.");
        }, 0, 1, TimeUnit.HOURS);
    }
}

package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainController {

    @FXML
    private Button processButton;

    @FXML
    private TextArea logArea;

    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    @FXML
    public void initialize() {
        logArea.setEditable(false);
        processButton.setOnAction(e -> processOrders());
    }

    private void processOrders() {
        logArea.appendText("Démarrage du traitement des commandes...\n");
        
        executorService.submit(() -> {
            try {
                ShopifyService.processOrders();
                logArea.appendText("Traitement terminé avec succès.\n");
            } catch (Exception ex) {
                logArea.appendText("Erreur lors du traitement : " + ex.getMessage() + "\n");
                ex.printStackTrace();
            }
        });
    }
}

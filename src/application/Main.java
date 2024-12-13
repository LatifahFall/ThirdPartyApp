package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ScheduledTaskManager.scheduleTask();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/main.fxml"));
        primaryStage.setScene(new javafx.scene.Scene(loader.load()));
        primaryStage.setTitle("Shopify Integration");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

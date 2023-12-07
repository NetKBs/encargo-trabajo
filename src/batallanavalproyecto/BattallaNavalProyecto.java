package batallanavalproyecto;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BattallaNavalProyecto extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/tablero.fxml"));
        Scene scene = new Scene(loader.load());  
        stage.setScene(scene);
        stage.setTitle("Batalla Naval - Inicio");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

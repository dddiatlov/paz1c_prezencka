package sk.upjs.paz;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SceneController {
    private String filename;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_generate;

    @FXML
    private Button button_filename;

    @FXML
    private TextField input_filename;

    @FXML
    private Label label_number;

    @FXML
    void loadStudentsClick(ActionEvent event) throws IOException {
        List<Student> students = StudentService.loadStudents(this.filename);
        label_number.setText(String.valueOf(students.size()));
    }

    @FXML
    void initialize() {
        assert button_generate != null : "fx:id=\"button_generate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert label_number != null : "fx:id=\"label_number\" was not injected: check your FXML file 'Scene.fxml'.";
        button_generate.setOnAction(event -> {
            label_number.setText((int) (Math.random() * 100) + "");
        });

        button_filename.setOnAction(event -> {
           String input = input_filename.getText();
           if (!input.contains(".csv")) {
               label_number.setText("Wrong filename passed! Must contain .csv");
           }

           this.filename = input;
           System.out.println("[DEBUG] Setted inner field 'filename' with value: " + this.filename);
        });
    }

}

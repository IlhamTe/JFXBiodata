/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formbiodata;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button Submit;
    @FXML
    private Label label;
    @FXML
    private Button Hapus;
    @FXML
    private TextField Telepon;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Nama;
    @FXML
    private TextField Kelas;
    @FXML
    private TextField Umur;
    @FXML
    private TextField Absen;
    @FXML
    private TextArea Hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
   void buttonSubmit(ActionEvent event) {
        String nama=Nama.getText();
        String kelas=Kelas.getText();
        String umur=Umur.getText();
        String absen=Absen.getText();
        String alamat=Alamat.getText();
        String telepon=Telepon.getText();
        
        Hasil.setText("Nama : "+nama+"\nKelas : "+kelas+"\nUmur : "+umur+"\nAbsen : "+absen+"\nAlamat : "+alamat+"\nTelepon : "+telepon);
    }

    @FXML
     void buttonHapus(ActionEvent event) {
        Hasil.setText("");
        Nama.setText("");
        Kelas.setText("");
        Umur.setText("");
        Absen.setText("");
        Alamat.setText("");
        Telepon.setText("");
    }
    
}

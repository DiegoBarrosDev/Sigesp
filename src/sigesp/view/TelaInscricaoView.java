
package sigesp.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sigesp.controller.InscricaoController;
import sigesp.controller.LoginController;
import sigesp.model.Model;

public class TelaInscricaoView {
    
  public static void carregar(Stage stage, Model model) {
        try {
            FXMLLoader loader = new FXMLLoader(LoginView.class.getResource("/sigesp/view/telaInscricao.fxml"));
            if (loader.getLocation() == null) {
                throw new IOException("O arquivo FXML não pôde ser encontrado.");
            }
            
            Parent novaTela = loader.load();
            
            InscricaoController controller = loader.getController();
            controller.setModel(model);
            
            stage.setScene(new Scene(novaTela));
            stage.setTitle("Inscreva-se");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace(); // Log adequado do erro
        }
    }

    
    
    
}

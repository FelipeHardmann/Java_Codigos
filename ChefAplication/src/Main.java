package application;

import builders.AlunoBuilder;
import builders.LoginBuilder;
import builders.MateriaBuilder;
import builders.MenuBuilder;
import builders.NotaBuilder;
import builders.ProfessorBuilder;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

	LoginBuilder loginBuilder;
	MenuBuilder menuBuilder;
	ProfessorBuilder professorBuilder;
	MateriaBuilder materiaBuilder;
	AlunoBuilder alunoBuilder;
	NotaBuilder notaBuilder;
	Scene telaLogin, telaMenu, telaProfessor, telaMateria;

	@Override
	public void start(Stage primaryStage) {
		try {

			
			materiaBuilder = new MateriaBuilder(primaryStage);
						
			professorBuilder = new ProfessorBuilder(primaryStage);
			
			alunoBuilder = new AlunoBuilder(primaryStage); 
			
			notaBuilder = new NotaBuilder(primaryStage);

			menuBuilder = new MenuBuilder(primaryStage);
			Group groupMenu= menuBuilder.build();
			telaMenu= new Scene(groupMenu,500,500);
			
			loginBuilder = new LoginBuilder(primaryStage);
			Group groupLogin = loginBuilder.build();
			telaLogin = new Scene(groupLogin, 500, 500);
			
			professorBuilder.setTelaMenu(telaMenu);
			materiaBuilder.setTelaMenu(telaMenu);
			alunoBuilder.setTelaMenu(telaMenu);
			notaBuilder.setTelaMenu(telaMenu);

			menuBuilder.setTelaLogin(telaLogin);
			menuBuilder.setTelaProfessor(telaProfessor);
			menuBuilder.setTelaMateria(telaMateria);
			
			loginBuilder.setTelaMenu(telaMenu);
			
			primaryStage.setTitle("Login");
			primaryStage.setScene(telaLogin);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

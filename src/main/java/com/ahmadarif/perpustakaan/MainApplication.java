package com.ahmadarif.perpustakaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.stage.Stage;

@SpringBootApplication
public class MainApplication extends Application {

	private static String[] argument;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Task<Object> task = new Task<Object>() {
			@Override
			protected Object call() throws Exception {
				SpringApplication.run(MainApplication.class, argument);
				return null;
			}
		};
		task.setOnSucceeded(e -> {
			primaryStage.setTitle("Main Application");
			primaryStage.show();			
		});
		task.run();
	}

	public static void main(String[] args) {
		MainApplication.argument = args;
		launch(args);
	}
}
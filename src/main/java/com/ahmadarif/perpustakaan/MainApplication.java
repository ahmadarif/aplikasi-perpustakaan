package com.ahmadarif.perpustakaan;

import com.ahmadarif.perpustakaan.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication extends Application {
    
    private ApplicationContext springContext = null;

    private static String[] argument;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Task<Object> task = new Task<Object>() {
            @Override
            protected Object call() throws Exception {
                springContext = SpringApplication.run(MainApplication.class, argument);
                return null;
            }
        };
        task.setOnSucceeded(e -> {
            HomeController controller = springContext.getBean(HomeController.class);
            
            Parent parent = (Parent) controller.initView();
            
            Scene scene = new Scene(parent);
            
            primaryStage.setTitle("Main Application");
            primaryStage.setScene(scene);
            primaryStage.show();			
        });
        task.setOnFailed(e -> {
            System.exit(0);
            Platform.exit();
        });
        task.run();
    }

    public static void main(String[] args) {
        MainApplication.argument = args;
        launch(args);
    }
}
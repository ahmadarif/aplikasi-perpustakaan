package com.ahmadarif.perpustakaan.config;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Ahmad Arif
 */
public interface BootInitializable extends Initializable, ApplicationContextAware {
    
    public void initConstruct();
    
    public void stage(Stage primaryStage);
    
    public Node initView();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadarif.perpustakaan.controller;

import com.ahmadarif.perpustakaan.config.BootInitializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ahmad Arif
 */
@Component
public class HomeController implements BootInitializable {
    
    private ApplicationContext springContext;

    @Override
    public void initConstruct() {
    }

    @Override
    public void stage(Stage primaryStage) {
    }

    @Override
    public Node initView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/scene/Home.fxml"));
            loader.setController(springContext.getBean(this.getClass()));
            return loader.load();
        } catch (IOException ex) {
            System.err.println("Can't load scene");
            return null;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @Override
    public void setApplicationContext(ApplicationContext springContext) throws BeansException {
        this.springContext = springContext;
    }
 
    @FXML
    public void doClose(ActionEvent event) {
        System.out.println("Close");
    }
    
    @FXML
    public void tampilBuku(ActionEvent event) {
        
    }
    
    @FXML
    public void tampilPenerbit(ActionEvent event) {
        
    }
    
    @FXML
    public void tampilAnggota(ActionEvent event) {
        
    }
    
    @FXML
    public void tampilPeminjaman(ActionEvent event) {
        
    }
    
    @FXML
    public void tampilPengembalian(ActionEvent event) {
        
    }
}
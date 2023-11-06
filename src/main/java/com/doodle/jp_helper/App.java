package com.doodle.jp_helper;

import com.google.common.base.Stopwatch;
import com.google.gson.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import com.doodle.jp_helper.datatypes.JMDict.JMDictRoot;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("gui/primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
//        launch();
        
        try{
            loadData();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void loadData() throws Exception {
            String path = "./jmdict-eng-3.5.0.json";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            GsonBuilder builder = new GsonBuilder();
            builder.setLenient();

            Gson gson = builder.create();

            Stopwatch timer = Stopwatch.createStarted();
            
            System.out.println("Loading data...");

            JMDictRoot root = gson.fromJson(bufferedReader, JMDictRoot.class);

            System.out.println("Finished reading data in: " + timer.stop());
            System.out.println("Total dictionary entries: " + root.getWords().size());
    }

}

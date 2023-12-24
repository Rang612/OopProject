package com.example.forntend;

import com.example.backend.Model.NftFloor.NFT;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public abstract class SwitchLayout {
    private Stage stage;
    private Scene scene;
    public void switchToHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToBlog(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blog.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToTwitter(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Twitter.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToNFT(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NFT-page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToOpenSea(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NFT-OpenSea.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNifty(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NFT-Nifty.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToBinace(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NFT-Binance.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRarible(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NFT-Rarible.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
//    public void switchBinanceFloor(ActionEvent event) throws IOException {
//        setStyle();
//        binance.setOnAction(e -> {
//            // Đổi màu của button khi sự kiện xảy ra
//            binance.setStyle("-fx-background-color: #ab3e3f;");
//        });
//        BinanceSelect1D();
    }
//    public void switchOpenseaFloor(ActionEvent event) throws IOException {
//        setStyle();
//        opensea.setOnAction(e -> {
//            // Đổi màu của button khi sự kiện xảy ra
//            opensea.setStyle("-fx-background-color: #ab3e3f;");
//        });
//        OpenSea1D();
//    }
//    public void switchNiftyFloor(ActionEvent event) throws IOException {
//        setStyle();
//        nifty.setOnAction(e -> {
//            // Đổi màu của button khi sự kiện xảy ra
//            nifty.setStyle("-fx-background-color: #ab3e3f;");
//        });
//        BinanceSelect1D();
//    }
//    public void switchRaribleFloor(ActionEvent event) throws IOException {
//        setStyle();
//        rarible.setOnAction(e -> {
//            // Đổi màu của button khi sự kiện xảy ra
//            rarible.setStyle("-fx-background-color: #ab3e3f;");
//        });
//        Rarible1D();
//    }

//    public void setStyle(){
//        String binanceOriginal = binance.getStyle();
//        String raribleOriginal = rarible.getStyle();
//        String openseaOriginal = opensea.getStyle();
//        String niftyOriginal = nifty.getStyle();
//        rarible.setOnAction(event -> {
//            // Xử lý sự kiện khi nút "Reset" được nhấn
//            binance.setStyle(binanceOriginal); // Quay về trạng thái ban đầu
//            opensea.setStyle(openseaOriginal); // Quay về trạng thái ban đầu
//            nifty.setStyle(niftyOriginal); // Quay về trạng thái ban đầu
//        });
//        binance.setOnAction(event -> {
//            // Xử lý sự kiện khi nút "Reset" được nhấn
//            rarible.setStyle(raribleOriginal); // Quay về trạng thái ban đầu
//            opensea.setStyle(openseaOriginal); // Quay về trạng thái ban đầu
//            nifty.setStyle(niftyOriginal); // Quay về trạng thái ban đầu
//        });
//        opensea.setOnAction(event -> {
//            // Xử lý sự kiện khi nút "Reset" được nhấn
//            rarible.setStyle(raribleOriginal); // Quay về trạng thái ban đầu
//            binance.setStyle(binanceOriginal); // Quay về trạng thái ban đầu
//            nifty.setStyle(niftyOriginal); // Quay về trạng thái ban đầu
//        });
//        nifty.setOnAction(event -> {
//            // Xử lý sự kiện khi nút "Reset" được nhấn
//            rarible.setStyle(raribleOriginal); // Quay về trạng thái ban đầu
//            binance.setStyle(binanceOriginal); // Quay về trạng thái ban đầu
//            opensea.setStyle(openseaOriginal); // Quay về trạng thái ban đầu
//        });
//    }



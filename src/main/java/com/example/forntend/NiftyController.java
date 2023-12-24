package com.example.forntend;

import com.example.backend.JsonRead.NFTJsonReader;
import com.example.backend.Model.NftFloor.NFT;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;

public class NiftyController extends SwitchLayout implements Initializable {
    @FXML
    private Button Exit;

//    @FXML
//    private Button Exit1;

    @FXML
    private Label Menu;

    @FXML
    private Label MenuBack;

    @FXML
    private Button backButton;

    @FXML
    private Button binance;
    @FXML
    private Button nifty;
    @FXML
    private Button oneday;

    @FXML
    private Button opensea;

    @FXML
    private Button rarible;

    @FXML
    private TextField searchText;

    @FXML
    private Pane slider;
    @FXML
    private TableView<NFT> view;
    @FXML
    private TableColumn<NFT, Double> floorPricecol;

    @FXML
    private TableColumn<NFT, String> idcol;

    @FXML
    private TableColumn<NFT, String> namecol;

    @FXML
    private TableColumn<NFT, Integer> numOwnerscol;
    @FXML
    private TableColumn<NFT, String> urlcol;
    @FXML
    private TableColumn<NFT, Integer> totalSupplycol;
    @FXML
    private TableColumn<NFT, Double> volumecol;
    @FXML
    private TableColumn<NFT, Double> volumeChangecol;


    private Stack<Scene> sceneStack = new Stack<>();
    NFTJsonReader op = new NFTJsonReader();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        slider.setTranslateX(-176);
        Menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(false);
                MenuBack.setVisible(true);
            });
        });

        MenuBack.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(true);
                MenuBack.setVisible(false);
            });
        });
        Nifty1D();
        //SearchbyName("Az");

    }

    // SetTable
    public void initializeTableView(ObservableList<NFT> list) {
        namecol.setCellValueFactory(new PropertyValueFactory<NFT, String>("name"));
        idcol.setCellValueFactory(new PropertyValueFactory<NFT, String>("id"));
        //urlcol.setCellValueFactory(new PropertyValueFactory<NFT, String>("url"));
        numOwnerscol.setCellValueFactory(new PropertyValueFactory<NFT, Integer>("numOwners"));
        totalSupplycol.setCellValueFactory(new PropertyValueFactory<NFT, Integer>("totalSupply"));
        volumecol.setCellValueFactory(new PropertyValueFactory<NFT, Double>("volume"));
        floorPricecol.setCellValueFactory(new PropertyValueFactory<NFT, Double>("floorPrice"));
        //numOfSalescol.setCellValueFactory(new PropertyValueFactory<NFT, Integer>("numOfSales"));
        volumeChangecol.setCellValueFactory(new PropertyValueFactory<NFT, Double>("volumeChange"));
        view.setItems(list);
    }

    public void Nifty7D(){
        List<NFT> nftList = op.readNFTJson("data//NiftyGateway7D.json");
        ObservableList<NFT> list = FXCollections.observableList(nftList);
        initializeTableView(list);
    }
    public void Nifty1D(){
        List<NFT> nftList = op.readNFTJson("data//NiftyGateway1D.json");
        ObservableList<NFT> list = FXCollections.observableList(nftList);
        initializeTableView(list);
    }



}

package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    //tabele
    public TableView tabelaDenar;
    public TableView<Plantaze> plantaze;
    public TableView<Gangitos> tabelaGangitos;
    public TableView<Delo> tabelaDelo;
    public TableView<Sovrazniki> tabelaSovrazniki;
    public TableView<GangitosDelo> tabelaGangitosDelo;
    public TableView<GangitosSovrazniki> tabelaGangitosSovrazniki;
    public TableView<Denar> tabelaNadPovprecnegaDenarja;

    public TableColumn <Plantaze,String>  IDPlantaze;
    public TableColumn <Plantaze,String> vrstaPlantaze;
    public TableColumn <Plantaze,String>  letniPlantaze;
    public TableColumn <Plantaze,String> lokacijaPlantaze;

    public TableColumn<Denar,String> IDDenar;
    public TableColumn<Denar,String> Naslov;
    public TableColumn<Denar,String> SteviloDenarja;
    public TableColumn<Denar,String> DatumDostave;

    public TableColumn<Denar,String> IDDenar1;
    public TableColumn<Denar,String> Naslov1;
    public TableColumn<Denar,String> SteviloDenarja1;
    public TableColumn<Denar,String> DatumDostave1;


    public TableColumn<Gangitos,String> IDGangitos;
    public TableColumn<Gangitos,String> Ime;
    public TableColumn<Gangitos,String> Priimek;
    public TableColumn<Gangitos,String> Regija;

    public TableColumn<Sovrazniki,String> IDSovrazniki;
    public TableColumn<Sovrazniki,String> ImeSovrazniki;
    public TableColumn<Sovrazniki,String> PriimekSovrazniki;
    public TableColumn<Sovrazniki,String> Prebivalisce;

    public TableColumn<Delo,String> IDDelo;
    public TableColumn<Delo,String> VrstaDela;

    public TableColumn<GangitosDelo,String> IDGangitos1;
    public TableColumn<GangitosDelo,String> IDDelo1;

    public TableColumn<GangitosSovrazniki,String> IDGangitos2;
    public TableColumn<GangitosSovrazniki,String> IDSovrazniki2;

    private ObservableList<Plantaze> data;
    private ObservableList<Denar> podatki;
    private ObservableList<Gangitos> gangitosi;
    private ObservableList<Delo> deloList;
    private ObservableList<Sovrazniki> sovraznikiList;
    private ObservableList<GangitosDelo> gangitosDelolist;
    private ObservableList<GangitosSovrazniki> gangitosSovraznikiList;
    private ObservableList<Denar> podatkiDenar;

    //gumbi
    public Button osvezi;
    public Button dodajGangitosaGumb;
    public Button dodajSovraznikaGumb;
    public Button dodeliNovoVrstoDelaGumb;
    public Button dodajNovoPlantazoGumb;
    public Button dodeliSovraznikaGumb;
    public Button dodajNovoLokacijoDenarjaGumb;
    public Button odstraniGangitosaGumb;
    public Button odstraniSovraznikaGumb;
    public Button odstraniPlantazoGumb;
    public Button odstraniLokacijoDenarjaGumb;
    public Button prestejPolja;

    public TextField ImeGangitosaText;
    public TextField PriimekGangitosText;
    public TextField RegijaGangitosText;
    public TextField ImeSovraznikaText;
    public TextField PriimekSovraznikaText;
    public TextField PrebivalisceText;
    public TextField IDGangitosaDelo;
    public TextField IDDeloGangitos;
    public TextField VrstaPoljaText;
    public TextField LetniDobicekPoljaText;
    public TextField LokacijaPoljaText;
    public TextField IDGangitosaSovraznikiText;
    public TextField IDSovraznikaGangitosText;
    public TextField NaslovText;
    public TextField KolicinaText;
    public TextField DatumDostaveText;
    public TextField IDGangitosaOdstraniText;
    public TextField IDSovraznikaOdstraniText;
    public TextField IDPlantazeOdstraniText;
    public TextField IDLokacijeDenarjaOdstraniText;
    public TextField IDPoljaRaznoText;


    public void initialize(URL location, ResourceBundle resources){
        IDPlantaze.setCellValueFactory(new PropertyValueFactory<Plantaze, String>("ID"));
        vrstaPlantaze.setCellValueFactory(new PropertyValueFactory<Plantaze, String>("VrstaPlantaze"));
        letniPlantaze.setCellValueFactory(new PropertyValueFactory<Plantaze, String>("LetniPlantaze"));
        lokacijaPlantaze.setCellValueFactory(new PropertyValueFactory<Plantaze, String>("Lokacija"));
        IDDenar.setCellValueFactory(new PropertyValueFactory<Denar, String>("ID"));
        Naslov.setCellValueFactory(new PropertyValueFactory<Denar, String>("Naslov"));
        SteviloDenarja.setCellValueFactory(new PropertyValueFactory<Denar, String>("SteviloDenarja"));
        DatumDostave.setCellValueFactory(new PropertyValueFactory<Denar, String>("DatumDostave"));
        IDGangitos.setCellValueFactory(new PropertyValueFactory<Gangitos, String>("ID"));
        Ime.setCellValueFactory(new PropertyValueFactory<Gangitos, String>("Ime"));
        Priimek.setCellValueFactory(new PropertyValueFactory<Gangitos, String>("Priimek"));
        Regija.setCellValueFactory(new PropertyValueFactory<Gangitos, String>("Regija"));
        IDDelo.setCellValueFactory(new PropertyValueFactory<Delo, String>("ID"));
        VrstaDela.setCellValueFactory(new PropertyValueFactory<Delo, String>("VrstaDela"));
        IDSovrazniki.setCellValueFactory(new PropertyValueFactory<Sovrazniki, String>("ID"));
        ImeSovrazniki.setCellValueFactory(new PropertyValueFactory<Sovrazniki, String>("Ime"));
        PriimekSovrazniki.setCellValueFactory(new PropertyValueFactory<Sovrazniki, String>("Priimek"));
        Prebivalisce.setCellValueFactory(new PropertyValueFactory<Sovrazniki, String>("Prebivalisce"));
        IDGangitos1.setCellValueFactory(new PropertyValueFactory<GangitosDelo, String>("IDGangitos"));
        IDDelo1.setCellValueFactory(new PropertyValueFactory<GangitosDelo, String>("IDDelo"));
        IDGangitos2.setCellValueFactory(new PropertyValueFactory<GangitosSovrazniki, String>("IDGangitos"));
        IDSovrazniki2.setCellValueFactory(new PropertyValueFactory<GangitosSovrazniki, String>("IDSovrazniki"));
        IDDenar1.setCellValueFactory(new PropertyValueFactory<Denar, String>("ID"));
        Naslov1.setCellValueFactory(new PropertyValueFactory<Denar, String>("Naslov"));
        SteviloDenarja1.setCellValueFactory(new PropertyValueFactory<Denar, String>("SteviloDenarja"));
        DatumDostave1.setCellValueFactory(new PropertyValueFactory<Denar, String>("DatumDostave"));

        try{
            nastaviStanjeVtabelah();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void nastaviStanjeVtabelah(){

        nastaviStanjeVtabeliPlantaze();
        nastaviStanjeVtabeliDenar();
        nastaviStanjeVtabeliGangitos();
        nastaviStanjeVtabeliDelo();
        nastaviStanjeVtabeliSovrazniki();
        nastaviStanjeVtabeliGangitosDelo();
        nastaviStanjeVtabeliGangitosSovrazniki();
        nastaviStanjeVtabelitabelaNadPovprecnegaDenarja();

    }
    public void nastaviStanjeVtabeliPlantaze(){
        String SQL = "SELECT * FROM LokacijePlantaz;";
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected");
            ResultSet rs = conn.createStatement().executeQuery(SQL);

            List<Plantaze> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new Plantaze(String.valueOf(rs.getInt(1)),rs.getString(2),String.valueOf(rs.getBigDecimal(3)),rs.getString(4)));
            }
            conn.close();
            data = FXCollections.observableList(list);
            plantaze.setItems(data);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nastaviStanjeVtabeliDenar(){
        String SQL = "SELECT * FROM LokacijeDenarja;";
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            ResultSet rs = conn.createStatement().executeQuery(SQL);

            List<Denar> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new Denar(String.valueOf(rs.getInt(1)),rs.getString(2),String.valueOf(rs.getBigDecimal(3)),rs.getString(4)));
            }
            conn.close();
            podatki = FXCollections.observableList(list);
            tabelaDenar.setItems(podatki);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nastaviStanjeVtabeliGangitos(){
        String SQL = "SELECT * FROM Gangitos;";
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            ResultSet rs = conn.createStatement().executeQuery(SQL);

            List<Gangitos> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new Gangitos(String.valueOf(rs.getInt(1)),rs.getString(2),String.valueOf(rs.getString(3)),rs.getString(4)));
            }
            conn.close();
            gangitosi = FXCollections.observableList(list);
            tabelaGangitos.setItems(gangitosi);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nastaviStanjeVtabeliDelo(){
        String SQL = "SELECT * FROM Delo;";
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            ResultSet rs = conn.createStatement().executeQuery(SQL);

            List<Delo> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new Delo(String.valueOf(rs.getInt(1)),rs.getString(2)));
            }
            conn.close();
            deloList = FXCollections.observableList(list);
            tabelaDelo.setItems(deloList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nastaviStanjeVtabeliSovrazniki(){
        String SQL = "SELECT * FROM Sovrazniki;";
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            ResultSet rs = conn.createStatement().executeQuery(SQL);

            List<Sovrazniki> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new Sovrazniki(String.valueOf(rs.getInt(1)),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
            conn.close();
            sovraznikiList = FXCollections.observableList(list);
            tabelaSovrazniki.setItems(sovraznikiList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nastaviStanjeVtabeliGangitosDelo(){
        String SQL = "SELECT * FROM GangitosDelo;";
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            ResultSet rs = conn.createStatement().executeQuery(SQL);

            List<GangitosDelo> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new GangitosDelo(String.valueOf(rs.getInt(1)),String.valueOf(rs.getString(2))));
            }
            conn.close();
            gangitosDelolist = FXCollections.observableList(list);
            tabelaGangitosDelo.setItems(gangitosDelolist);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nastaviStanjeVtabeliGangitosSovrazniki(){
        String SQL = "SELECT * FROM GangitosSovraznik;";
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            ResultSet rs = conn.createStatement().executeQuery(SQL);

            List<GangitosSovrazniki> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new GangitosSovrazniki(String.valueOf(rs.getInt(1)),String.valueOf(rs.getString(2))));
            }
            conn.close();
            gangitosSovraznikiList = FXCollections.observableList(list);
            tabelaGangitosSovrazniki.setItems(gangitosSovraznikiList);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void nastaviStanjeVtabelitabelaNadPovprecnegaDenarja(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {

            Connection conn = DriverManager.getConnection(url, userName, password);
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM vNadpovprecnaKolicinaDenarja");

            List<Denar> list = new ArrayList<>();

            while (rs.next()) {
                list.add(new Denar(String.valueOf(rs.getInt(1)),rs.getString(2),String.valueOf(rs.getBigDecimal(3)),rs.getString(4)));
            }
            conn.close();
            podatkiDenar = FXCollections.observableList(list);
            tabelaNadPovprecnegaDenarja.setItems(podatkiDenar);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dodajGangitosa(){

        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.dodajNovegaGangitosa(?,?,?)}");
            cstmt1.setString(1,ImeGangitosaText.getText());
            cstmt1.setString(2, PriimekGangitosText.getText());
            cstmt1.setString(3,RegijaGangitosText.getText());
            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dodajSovraznika(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.dodajNovegaSovraznika(?,?,?)}");
            cstmt1.setString(1,ImeSovraznikaText.getText());
            cstmt1.setString(2, PriimekSovraznikaText.getText());
            cstmt1.setString(3,PrebivalisceText.getText());
            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dodeliNovoNalogo(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.dodajGangitosDelo(?,?)}");
            cstmt1.setInt(1,Integer.valueOf(IDGangitosaDelo.getText()));
            cstmt1.setInt(2, Integer.valueOf(IDDeloGangitos.getText()));

            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dodajNovoPlantazo(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.vstaviNovoLokacijoPlantaze(?,?,?)}");
            cstmt1.setString(1,VrstaPoljaText.getText());
            cstmt1.setInt(2, Integer.valueOf(LetniDobicekPoljaText.getText()));
            cstmt1.setString(3, LokacijaPoljaText.getText());
            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dodeliSovraznika(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.dodajGangitosSovraznik(?,?)}");
            cstmt1.setInt(1,Integer.valueOf(IDGangitosaSovraznikiText.getText()));
            cstmt1.setInt(2, Integer.valueOf(IDSovraznikaGangitosText.getText()));

            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dodajNovoLokacijoDenarja(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.dodajNovoLokacijoDenarja(?,?,?)}");
            cstmt1.setString(1,NaslovText.getText());
            cstmt1.setInt(2, Integer.valueOf(KolicinaText.getText()));
            cstmt1.setString(3, DatumDostaveText.getText());

            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void odstraniGangitosa(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.odstraniGangitosa(?)}");

            cstmt1.setInt(1, Integer.valueOf(IDGangitosaOdstraniText.getText()));


            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void odstraniSovraznika(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.odstraniSovraznika(?)}");

            cstmt1.setInt(1, Integer.valueOf(IDSovraznikaOdstraniText.getText()));


            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void odstraniPlantazo(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.odstraniPlantazo(?)}");

            cstmt1.setInt(1, Integer.valueOf(IDPlantazeOdstraniText.getText()));


            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void odstraniLokacijoDenarja(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{call dbo.odstraniLokacijoDenarja(?)}");

            cstmt1.setInt(1, Integer.valueOf(IDPlantazeOdstraniText.getText()));


            cstmt1.execute();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void funkcijaPrestejPolja(){
        String userName = "Student";
        String password = "VajeIS2019";
        String url = "jdbc:sqlserver://212.235.190.237;databaseName=ElPablitoDBMehdiAmi";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement cstmt1 = conn.prepareCall("{? = CALL PrestejSurovino(?)}");
            cstmt1.registerOutParameter(1, Types.INTEGER);
            cstmt1.setString(2, IDPoljaRaznoText.getText());
            cstmt1.execute();
            int output = cstmt1.getInt(1);
            IDPoljaRaznoText.setText(String.valueOf(output));
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}





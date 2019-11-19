package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Gangitos {
    private SimpleStringProperty ID;
    private SimpleStringProperty Ime;
    private SimpleStringProperty Priimek;
    private SimpleStringProperty Regija;

    public Gangitos(String id,String ime, String Priimek, String Regija){
        this.ID = new SimpleStringProperty(id);
        this.Ime = new SimpleStringProperty(ime);
        this.Priimek = new SimpleStringProperty(Priimek);
        this.Regija = new SimpleStringProperty(Regija);
    }

    public String getIme() {
        return Ime.get();
    }

    public void setIme(String firstName) {
        this.Ime.set(firstName);
    }

    public String getPriimek() {
        return Priimek.get();
    }

    public void setPriimek(String lastName) {
        this.Priimek.set(lastName);
    }

    public String getID(){
        return this.ID.get();
    }

    public void setID(String id){
        this.ID.set(id);
    }

    public String getRegija(){
        return this.Regija.get();
    }

    public void setRegija(String regija){
        this.Regija.set(regija);
    }




}

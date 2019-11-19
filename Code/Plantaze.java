package sample;

import javafx.beans.property.*;

import java.math.BigDecimal;

public class Plantaze {

    private SimpleStringProperty ID;
    private SimpleStringProperty vrstaPlantaze;
    private SimpleStringProperty letniPlantaze;
    private SimpleStringProperty lokacijaPlantaze;

    public Plantaze(String id1,String vrstPlantaze1, String letniPlantaze, String lokacijaPlantaze1){
        this.ID=new SimpleStringProperty(id1);
        this.vrstaPlantaze=new SimpleStringProperty(vrstPlantaze1);
        this.letniPlantaze=new SimpleStringProperty(letniPlantaze);
        this.lokacijaPlantaze=new SimpleStringProperty(lokacijaPlantaze1);
    }

    public String getID() {
        return ID.get();
    }
    public void setID(String id){
        this.ID.set(id);
    }


    public String getVrstaPlantaze() {
        return vrstaPlantaze.get();
    }
    public void setVrstaPlantaze(String vrstaPlantaze) {
        this.vrstaPlantaze.set(vrstaPlantaze);
    }
    public String getLetniPlantaze() {
        return letniPlantaze.get();
    }
    public void setLetniPlantaze(String denar) {
        letniPlantaze.set(denar);
    }
    public String getLokacija() {
        return lokacijaPlantaze.get();
    }
    public void setLokacijaPlantaze(String lokacijaPlantaze) {
        this.lokacijaPlantaze.set(lokacijaPlantaze);
    }
}




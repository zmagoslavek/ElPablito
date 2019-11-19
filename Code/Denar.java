package sample;

import javafx.beans.property.*;

import java.math.BigDecimal;

public class Denar{

    private SimpleStringProperty ID;
    private SimpleStringProperty Naslov;
    private SimpleStringProperty SteviloDenarja;
    private SimpleStringProperty DatumDostave;

    public Denar(String id,String naslov, String stevilodenarja, String datumdostave){
        this.ID=new SimpleStringProperty(id);
        this.Naslov =new SimpleStringProperty(naslov);
        this.SteviloDenarja =new SimpleStringProperty(stevilodenarja);
        this.DatumDostave = new SimpleStringProperty(datumdostave);
    }

    public String getID() {
        return ID.get();
    }
    public void setID(String id){
        this.ID.set(id);
    }


    public String getNaslov() {
        return Naslov.get();
    }
    public void setNaslov(String vrstaPlantaze) {
        this.Naslov.set(vrstaPlantaze);
    }
    public String getSteviloDenarja() {
        return SteviloDenarja.get();
    }
    public void setSteviloDenarja(String denar) {
        SteviloDenarja.set(denar);
    }
    public String getDatumDostave() {
        return DatumDostave.get();
    }
    public void setDatumDostave(String lokacijaPlantaze) {
        this.DatumDostave.set(lokacijaPlantaze);
    }
}




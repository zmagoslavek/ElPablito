package sample;

import javafx.beans.property.SimpleStringProperty;

public class GangitosSovrazniki {

    private SimpleStringProperty IDGangitos;
    private SimpleStringProperty IDSovraznik;


    public GangitosSovrazniki(String id,String IDSovraznik) {
        this.IDGangitos = new SimpleStringProperty(id);
        this.IDSovraznik = new SimpleStringProperty(IDSovraznik);
    }

    public String getIDGangitos(){
        return IDGangitos.get();
    }
    public void setIDGangitos(String id){
        this.IDGangitos.set(id);
    }


    public String getIDSovrazniki() {
        return IDSovraznik.get();
    }
    public void setIDSovrazniki(String IDSovraznik) {
        this.IDSovraznik.set(IDSovraznik);
    }

}

package sample;

import javafx.beans.property.SimpleStringProperty;

public class GangitosDelo {

    private SimpleStringProperty IDGangitos;
    private SimpleStringProperty IDDelo;


    public GangitosDelo(String id,String iddelo) {
        this.IDGangitos = new SimpleStringProperty(id);
        this.IDDelo = new SimpleStringProperty(iddelo);
    }

    public String getIDGangitos(){
        return IDGangitos.get();
    }
    public void setIDGangitos(String id){
        this.IDGangitos.set(id);
    }


    public String getIDDelo() {
        return IDDelo.get();
    }
    public void setIDDelo(String iddelo) {
        this.IDDelo.set(iddelo);
    }

}

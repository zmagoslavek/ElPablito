package sample;

import javafx.beans.property.SimpleStringProperty;

public class Delo {

        private SimpleStringProperty ID;
        private SimpleStringProperty VrstaDela;


        public Delo(String id,String vrsta) {
            this.ID = new SimpleStringProperty(id);
            this.VrstaDela = new SimpleStringProperty(vrsta);
        }

        public String getID(){
            return ID.get();
        }
        public void setID(String id){
            this.ID.set(id);
        }


        public String getVrstaDela() {
            return VrstaDela.get();
        }
        public void setVrstaDela(String vrsta) {
            this.VrstaDela.set(vrsta);
        }

}

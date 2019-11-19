package sample;

import javafx.beans.property.SimpleStringProperty;

public class Sovrazniki {

        private SimpleStringProperty ID;
        private SimpleStringProperty Ime;
        private SimpleStringProperty Priimek;
        private SimpleStringProperty Prebivalisce;

        public Sovrazniki(String id,String ime, String Priimek, String Prebivalisce){
            this.ID = new SimpleStringProperty(id);
            this.Ime = new SimpleStringProperty(ime);
            this.Priimek = new SimpleStringProperty(Priimek);
            this.Prebivalisce = new SimpleStringProperty(Prebivalisce);
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

        public String getPrebivalisce(){
            return this.Prebivalisce.get();
        }

        public void setPrebivalisce(String Prebivalisce){
            this.Prebivalisce.set(Prebivalisce);
        }
}

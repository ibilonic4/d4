/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filozofijada;

/**
 *
 * @author Ivor
 */
public class Student {
    private int sifra;
    private int jmbag;
    private String ime;
    private String prezime;
    private float prosjek;
    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public int getJmbag() {
        return jmbag;
    }

    public void setJmbag(int jmbag) {
        this.jmbag = jmbag;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public float getProsjek() {
        return prosjek;
    }

    public void setProsjek(float prosjek) {
        this.prosjek = prosjek;
    }

    @Override
    public String toString() {
        return ime + " " +prezime;
    }


    
}

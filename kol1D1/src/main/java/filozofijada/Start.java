/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filozofijada;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Start {
    private List<Prijava> prijave = new ArrayList<>();
    
    public Start(){

        ucitajPrijave();
        ispisiBrojPrijava();
        ispisiProsjeke();
    }

    public static void main(String[] args) {
        new Start();
    }
    
    
    private void ucitajPrijave() {
String s;
while(true){
ucitajPrijavu();
s=JOptionPane.showInputDialog("unesi n za prekid");
if(s.trim().toLowerCase().equals("n")){break;}

}

    }

    private void ucitajPrijavu() {
        JOptionPane.showMessageDialog(null, "unos nove prijave");
        
       Prijava p = new Prijava();
       
       p.setSifra(Pomocno.ucitajBroj("sifra"));
       p.setDatum(Pomocno.ucitajDatum("unesi datum dd.MM.yyyy."));
       p.setStudent(ucitajStudenta());
        
        prijave.add(p);
    }

    private Student ucitajStudenta() {

        JOptionPane.showMessageDialog(null, "unos studenta za prijavu");
Student s = new Student();
s.setJmbag(Pomocno.ucitajBroj("jmbag"));
s.setIme(Pomocno.ucitajString("ime"));
s.setPrezime(Pomocno.ucitajString("prezime"));
s.setProsjek(Pomocno.ucitajProsjek());

return s;

    }

    private void ispisiBrojPrijava() {
int i= 0;
for(Prijava p : prijave ){
i++;
}
        System.out.println("ukupan broj prijava je " + i);

    }

    private void ispisiProsjeke() {

float min= Integer.MAX_VALUE;
float max= Integer.MIN_VALUE;

for(Prijava p : prijave){
if(p.getStudent().getProsjek()<min){min=p.getStudent().getProsjek();}
if(p.getStudent().getProsjek()>max){max=p.getStudent().getProsjek();}
}
        System.out.println("Najveci prosjek je " + max + " najmanji je "+ min);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

import javax.swing.*;

/**
 * Created by Daniel_D'AGE on 04.05.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World!");
        String password = JOptionPane.showInputDialog(null, "Podaj hasło:");

        if(password.equals("Daniel")){

            JOptionPane.showMessageDialog(null, "Podałeś poprawne hasło! :)");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Podałeś niepoprawne hasło! :(");
        }

        /*
        Program który odczytuje hasło, sprawdza czy hasło to Akdemia. Jesli hasło
        jest poprawnie wpisane to wypisuje komunikat gratulacje , a jesli nie to nic
         */
    }
}

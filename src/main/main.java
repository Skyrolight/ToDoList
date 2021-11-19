package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connexion.connexion;

public class main {
    public static void main(String[] args) {
        connexion maConnexion = new connexion();
        try {
            PreparedStatement statement = maConnexion.creeConnection().prepareStatement("SELECT * FROM compte");
            ResultSet res = statement.executeQuery();
            while (res.next()) {
                int id = res.getInt("idCompte");
                String pseudo = res.getString("pseudo");
                String mdp = res.getString("mot_de_passe");
                String admail = res.getString("ad_mail");

                System.out.println("ID: " + id + " pseudo: " + pseudo + " mdp: " + mdp + " Adresse mail: "+admail);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}

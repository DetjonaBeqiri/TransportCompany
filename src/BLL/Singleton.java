/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.Date;

/**
 *
 * @author detjona
 */
public class Singleton {
    
    static public Singleton instancaUnike ;
    static public int idPuntorit = 0;
    static String emri;
    static String mbiemri;
    static String numriTelefonit;
    static Date date;
    static String pagesa;
    static double tax = 0.17;

   
    public static Singleton getInstancaUnike() {
        return instancaUnike;
    }

    public static void setInstancaUnike(Singleton instancaUnike) {
        Singleton.instancaUnike = instancaUnike;
    }

    public static String getEmri() {
        return emri;
    }

    public static void setEmri(String emri) {
        Singleton.emri = emri;
    }

    public static String getMbiemri() {
        return mbiemri;
    }

    public static void setMbiemri(String mbiemri) {
        Singleton.mbiemri = mbiemri;
    }

    public static String getNumriTelefonit() {
        return numriTelefonit;
    }

    public static void setNumriTelefonit(String numriTelefonit) {
        Singleton.numriTelefonit = numriTelefonit;
    }

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        Singleton.date = date;
    }

    public static String getPagesa() {
        return pagesa;
    }

    public static void setPagesa(String pagesa) {
        Singleton.pagesa = pagesa;
    }
    
     public static double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        Singleton.tax = tax;
    }

    

    public Singleton(){
        if(instancaUnike == null){
            instancaUnike = new Singleton();
        }
        
    }

    static public void setIDPuntorit(int id){
        idPuntorit = id;
    }
    static public int getIdPuntorit(){
        return idPuntorit;
    }
}

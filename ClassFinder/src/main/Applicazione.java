/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package main;



/**
 *
 * @author mion00
 */
public class Applicazione {
    public static void main(String args[]) throws Exception
    {
        Applicazione app=new Applicazione();
    }
    
    Applicazione() throws Exception
    {
        java.util.Date data=new java.util.Date();
        
        

        try{
            GestisciDati dati=new GestisciDati(data);
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
}

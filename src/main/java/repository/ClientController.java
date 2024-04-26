/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import com.mycompany.royalgrepositoryi.ServiceImpl.RoyalGRepositoryI;
import entities.Client;

/**
 *
 * @author adral
 */
public class ClientController {
   public static void main(String[] args){
       RoyalGRepositoryI<Client,Integer> client= new RoyalGRepositoryI<>(Client.class);
       Client marc=new Client(1,"Marc");
       client.save(marc);
   }
    
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kato
 */
public class Main {
    public static void main(String[] args) {
        macamAnimal hewan1 = new macamAnimal ("yama", "ayam", "petokpetok");
        macamAnimal hewan2 = new macamAnimal ("meng", "kucing", "meoongggg");
        macamAnimal hewan3 = new macamAnimal ("tigris", "macan", "gggggrrrrrrrrr");
        macamAnimal hewan4 = new macamAnimal ("ganyu", "kambing", "mbeek");
        
        hewan1.printAnimal(hewan1);
        hewan2.printAnimal(hewan2);
        hewan3.printAnimal(hewan3);
        hewan4.printAnimal(hewan4);
    }
}

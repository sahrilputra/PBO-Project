/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

//import java.util.UUID;

import java.util.UUID;

/**
 *
 * @author ASUS
 */
abstract public class random implements id {

    @Override
    public String generateId() {
        String id = UUID.randomUUID().toString();
//        System.out.println("pppp");
        return id;
    }
;
}

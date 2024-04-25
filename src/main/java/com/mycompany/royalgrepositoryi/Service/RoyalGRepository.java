/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.royalgrepositoryi.Service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marc Apedoh
 */
public interface RoyalGRepository <T extends Serializable, K>{
    
    void save(final T t);
    List<T> findAll();
    T findById(K k);
    void deleteById(final K k);
    
}

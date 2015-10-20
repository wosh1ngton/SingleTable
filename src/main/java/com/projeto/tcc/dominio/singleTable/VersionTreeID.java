/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.dominio.singleTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Woshington
 */
@Entity
public class VersionTreeID {
    
    @Id
    private String value;
    @Column
    private String trunkVersion;
    @Column
    private String branchNumber;
    @Column
    private String branchVersion;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
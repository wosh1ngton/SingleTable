package com.projeto.tcc.dominio.singleTable;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Woshington
 */
@Entity
public class VersionTreeID implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String value;
    private String trunkVersion;
    private String branchNumber;
    private String branchVersion;

    public VersionTreeID() {
    }

    public VersionTreeID(String value, String trunkVersion, String branchNumber, String branchVersion) {
        this.value = value;
        this.trunkVersion = trunkVersion;
        this.branchNumber = branchNumber;
        this.branchVersion = branchVersion;
    }
    
    
    public String getTrunkVersion() {
        return trunkVersion;
    }

    public void setTrunkVersion(String trunkVersion) {
        this.trunkVersion = trunkVersion;
    }

    public String getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getBranchVersion() {
        return branchVersion;
    }

    public void setBranchVersion(String branchVersion) {
        this.branchVersion = branchVersion;
    }
    
    
    

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
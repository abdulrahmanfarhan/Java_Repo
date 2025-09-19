package com.abood;

import java.io.Serializable;

public class Model implements Serializable {
    private Integer id;
    private String nationalId;
    private String name;
    private String email;
    private String address;

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setNationalId(String nationalId){
        this.nationalId=nationalId;
    }

    public String getNationalId(){
        return this.nationalId;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return this.address;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.getId().equals(((Model) obj).getId());
    }

    @Override
    public int hashCode() {
        if(this.id==null) {
            return toString().hashCode();
        }
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        StringBuffer buf=new StringBuffer();
        buf.append(this.id).append(",");
        buf.append(this.nationalId).append(",");
        buf.append(this.name).append(",");
        buf.append(this.email).append(",");
        buf.append(this.address).append(",");
        return buf.toString();
    }
}
package com.onlineshopping.model;

import javax.persistence.*;

@Entity
@Table (name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "idUser")
    private Integer idUser;
    private Integer idProduct;
    private Integer cantity;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer user) {
        this.idUser = user;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getCantity() {
        return cantity;
    }

    public void setCantity(Integer cantity) {
        this.cantity = cantity;
    }
}

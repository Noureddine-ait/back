package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntiteAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private Long code;
    private User responsable;
    private CategorieEntiteAdmin categorieEntiteAdmin;
    private EntiteAdmin entiteAdminSuperieur;


}

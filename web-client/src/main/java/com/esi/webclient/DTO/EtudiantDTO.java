package com.esi.webclient.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class EtudiantDTO {

    public  Long idEtudiant;
    private String nom;

    private String promo;

    private Date dateInscription;

    private FormationDTO formation;
}

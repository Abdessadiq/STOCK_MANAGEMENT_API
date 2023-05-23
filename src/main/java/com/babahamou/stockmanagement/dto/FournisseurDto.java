package com.babahamou.stockmanagement.dto;
import com.babahamou.stockmanagement.model.Adresse;
import lombok.*;
import java.util.List;
@Getter @Setter
@Builder
public class FournisseurDto {
    private Integer id;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private String numTel;
    private String mail;
    private List<CommandeFournisseurDto> commandeFournisseurs;

}

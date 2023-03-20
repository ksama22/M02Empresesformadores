package entities;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Empresa {
    @Id
    private String cif;

    private String nom;

    private String adreça;

    @OneToMany(mappedBy = "empresa")
    private List<Alumne> alumnes;

    // Getters i setters
}

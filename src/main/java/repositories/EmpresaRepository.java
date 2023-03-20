package repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Alumne;
import entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    Optional<Empresa> findById(String cif);
}

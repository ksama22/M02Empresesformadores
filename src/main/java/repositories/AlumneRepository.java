package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Alumne;

public interface AlumneRepository extends JpaRepository<Alumne, Long> {
}

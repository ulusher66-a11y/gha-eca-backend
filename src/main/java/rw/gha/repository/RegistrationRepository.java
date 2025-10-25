package rw.gha.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import rw.gha.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
package rw.gha.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.gha.entity.ECA;
@Repository
public interface ECARepository extends JpaRepository<ECA,Long> {
}

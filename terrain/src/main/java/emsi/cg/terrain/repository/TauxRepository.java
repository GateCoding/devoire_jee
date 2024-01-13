package emsi.cg.terrain.repository;

import com.example.tnb.entity.Taux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxRepository extends JpaRepository<Taux, Integer> {
    Taux findById(long id);
}

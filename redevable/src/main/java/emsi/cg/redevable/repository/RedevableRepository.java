package emsi.cg.redevable.repository;

import emsi.cg.redevable.entity.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedevableRepository extends JpaRepository<Redevable, Integer> {
    Redevable findById(long id);
    Redevable findByCin(String cin);
}

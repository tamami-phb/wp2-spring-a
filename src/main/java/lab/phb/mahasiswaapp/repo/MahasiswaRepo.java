package lab.phb.mahasiswaapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import lab.phb.mahasiswaapp.model.Mahasiswa;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepo extends JpaRepository<Mahasiswa, String> {

}
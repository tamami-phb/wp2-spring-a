package lab.phb.mahasiswaapp.repo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;
import lab.phb.mahasiswaapp.model.Mahasiswa;

@SpringBootTest
public class MahasiswaRepoTest {

    @Autowired
    private MahasiswaRepo repo;

    private Logger log = LoggerFactory.getLogger("MahasiswaRepoTest");

    @Test
    public void getAllDataTest() {
        List<Mahasiswa> result = repo.findAll();
        for(Mahasiswa mhs : result) {
            log.info(mhs.toString());
        }
        Assertions.assertNotNull(result);
    }

}
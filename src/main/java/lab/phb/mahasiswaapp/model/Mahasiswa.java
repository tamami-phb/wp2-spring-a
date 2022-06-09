package lab.phb.mahasiswaapp.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "mahasiswa")
@Data
public class Mahasiswa {

    @Id @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "kelas")
    private String kelas;

}
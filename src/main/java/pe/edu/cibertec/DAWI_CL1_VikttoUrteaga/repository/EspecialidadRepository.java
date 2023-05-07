package pe.edu.cibertec.DAWI_CL1_VikttoUrteaga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.DAWI_CL1_VikttoUrteaga.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,Integer> {

}

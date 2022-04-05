package br.com.ucsal.manutencao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ucsal.manutencao.entity.LaboratorioEntity;

public interface LaboratorioRepository extends JpaRepository<LaboratorioEntity, Integer> {

}

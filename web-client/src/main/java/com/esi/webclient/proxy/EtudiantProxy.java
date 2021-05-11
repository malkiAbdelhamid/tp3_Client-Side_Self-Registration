package com.esi.webclient.proxy;

import com.esi.webclient.DTO.EtudiantDTO;
import com.esi.webclient.DTO.FormationDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ms-scolarite")
@LoadBalancerClient(name="ms-scolarite")
public interface EtudiantProxy {
    @GetMapping("/api/etudiant/{id}")
    EtudiantDTO getEtudiantWithFormation(@PathVariable("id") Long ide);

    @GetMapping("/api/etudiant")
    List<EtudiantDTO> getEtudiantswithFortmation();


    @GetMapping("/etudiants")
    CollectionModel<EtudiantDTO> getEtudiantsWithOutFormation();

}

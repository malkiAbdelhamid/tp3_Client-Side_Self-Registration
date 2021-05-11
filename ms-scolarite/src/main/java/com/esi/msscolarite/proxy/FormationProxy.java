package com.esi.msscolarite.proxy;

import com.esi.msscolarite.DTO.FormationDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-formation")
@LoadBalancerClient(name="ms-formation",configuration = LBConfiguration.class)
public interface FormationProxy {
    @GetMapping("/formations/{id}")
    FormationDTO getFormation(@PathVariable("id") Long idf);
}

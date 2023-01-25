package com.call.telco.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

@RequestMapping("/rest/api/catalogo")
public class CatalogoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CircuitBreakerFactory cbFactory;

    @GetMapping("/recarga")
    public String getRecargas(){
        String url = "http://telco-eureka-recargas/recarga";
        // restTemplate.getForObject(url,String.class);
        return cbFactory.create("recarga")
                .run(()-> restTemplate.getForObject(url,String.class), e -> alternativeRecargas(e));
    }

    public String alternativeRecargas(Throwable e) {
        String url = "http://telco-eureka-respaldo/recarga";
        return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("/redes")
    public String getRedes(){
        String url = "http://telco-eureka-redes/redes";
        // restTemplate.getForObject(url,String.class);
        return cbFactory.create("redes")
                .run(()-> restTemplate.getForObject(url,String.class), e -> alternativeRedes(e));
    }

    public String alternativeRedes(Throwable e) {
        String url = "http://telco-respaldo-redes/redes";
        return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("/internet")
    public String getPkgInternet(){
        String url = "http://telco-eureka-internet/internet";
        // restTemplate.getForObject(url,String.class);
        return cbFactory.create("internet")
                .run(()-> restTemplate.getForObject(url,String.class), e -> alternativePkgInternet(e));
    }

    public String alternativePkgInternet(Throwable e) {
        String url = "http://telco-respaldo-internet/internet";
        return restTemplate.getForObject(url,String.class);
    }


}

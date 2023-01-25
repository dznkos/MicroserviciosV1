package com.call.telco.clients;


import com.call.telco.entity.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="servicio-usuarios")
public interface UsuarioFeignClient {

	@GetMapping("/usuarios/search/buscar-username")
	public Usuario findByUsername(@RequestParam String username);
}

package com.call.telco.service;


import com.call.telco.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}

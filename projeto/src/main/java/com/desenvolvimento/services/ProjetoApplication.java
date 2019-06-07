package com.desenvolvimento.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desenvolvimento.domain.Cliente;
import com.desenvolvimento.repositories.ClienteRepository;
import com.desenvolvimento.repositories.ProdutoRepository;
import com.desenvolvimento.repositories.VendaRepository;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRep;
	
    @Autowired
    private ProdutoRepository produtoRep;
    
    @Autowired
    private VendaRepository vendaRep;
    
    public static void main(String[] args) {
    	
    	SpringApplication.run(ProjetoApplication.class, args); 	
    }
    
    @Override
    public void run(String... args) throws Exception{
    	Cliente cliente = new Cliente();
    	cliente.setCodigo(1);
    	cliente.setNome("eliesio");
    	cliente.setCpf("09812365412");
    	cliente.setEndereco("av.joaquim brito");
    			
    	clienteRep.saveAll(Arrays.asList(cliente));
    	
    	
    	
    	
    	
    }
}

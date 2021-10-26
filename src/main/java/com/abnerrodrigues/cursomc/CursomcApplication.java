package com.abnerrodrigues.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abnerrodrigues.cursomc.domain.Categoria;
import com.abnerrodrigues.cursomc.domain.Cidade;
import com.abnerrodrigues.cursomc.domain.Cliente;
import com.abnerrodrigues.cursomc.domain.Endereco;
import com.abnerrodrigues.cursomc.domain.Estado;
import com.abnerrodrigues.cursomc.domain.ItemPedido;
import com.abnerrodrigues.cursomc.domain.Pagamento;
import com.abnerrodrigues.cursomc.domain.PagamentoComBoleto;
import com.abnerrodrigues.cursomc.domain.PagamentoComCartao;
import com.abnerrodrigues.cursomc.domain.Pedido;
import com.abnerrodrigues.cursomc.domain.Produto;
import com.abnerrodrigues.cursomc.domain.enums.EstadoPagamento;
import com.abnerrodrigues.cursomc.domain.enums.TipoCliente;
import com.abnerrodrigues.cursomc.repositories.CategoriaRepository;
import com.abnerrodrigues.cursomc.repositories.CidadeRepository;
import com.abnerrodrigues.cursomc.repositories.ClienteRepository;
import com.abnerrodrigues.cursomc.repositories.EnderecoRepository;
import com.abnerrodrigues.cursomc.repositories.EstadoRepository;
import com.abnerrodrigues.cursomc.repositories.ItemPedidoRepository;
import com.abnerrodrigues.cursomc.repositories.PagamentoRepository;
import com.abnerrodrigues.cursomc.repositories.PedidoRepository;
import com.abnerrodrigues.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
}


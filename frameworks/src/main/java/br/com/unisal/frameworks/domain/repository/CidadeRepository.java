package br.com.unisal.frameworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unisal.frameworks.domain.model.Cidade;

/**
 * Interface para persistir {@link Cidade}
 * Como estamos Usando Framework Spring Data,
 *  nosso framework ja possui implementação de todo o código necessário para salvar, editar, exluir, listar, paginar nossas cidades no banco de dados 
 *  Com isso ganhamos tempo em não precisar desenvolver essa lógica, ou seja, reinventar a roda! :)
 * @author “Paulo Leite
 *
 */
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	/**
	 * Veja! Nao precisamos implementar Nada,
	 * devido ao uso do nosso framework spring com sua implementação Spring Data que já faz todo a integração com banco de dados para nós!
	 */

}

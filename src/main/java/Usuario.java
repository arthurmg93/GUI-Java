/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

/**
 * Classe Usuario
 */
public class Usuario
{
    // Atributos da classe Usuario
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String sexo;
    private Cargo cargo;
    private ListaPerfil perfil = new ListaPerfil();
    
    

    /**
     * Construtor para objetos da classe Usuario
     */
    public Usuario(String nome, String cpf, String dataNascimento, String sexo, Cargo cargo, Perfil perfil)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cargo = cargo;
        this.perfil.addPerfil(perfil);
    }

    /**
     * Cadastrar o Usuario
     */
    public void cadastrarUsuario(Usuario u)
    {
        //A ideia aqui é fazer a conexão com o banco de dados para salvar o objeto Usuario juntamente com a data
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        LocalDateTime tempo = LocalDateTime.now();
        String data = dtf.format(tempo);
        
        //Upar as informações de usuário e a data em que o mesmo foi criado
        //O norte que eu queria seguir era usando
    }
    
    /**
     * Editar os atributos do Usuario
     */
    public void editarUsuario(Usuario u, String nome, String cpf, String dataNascimento, String sexo, Cargo cargo, Perfil perfil)
    {
    	u.nome = nome;
    	u.cpf = cpf;
    	u.dataNascimento = dataNascimento;
    	u.sexo = sexo;
    	u.cargo = cargo;
    	u.perfil.addPerfil(perfil);
    }
    
    /**
     * Atualiza o atributo nome do Usuario
     */
    public void setNome(String nome)
    {
    	this.nome = nome;
    }
    
    /**
     * Atualiza o atributo cpf do Usuario
     */
    public void setCpf(String cpf)
    {
    	this.cpf = cpf;
    }
    
    /**
     * Atualiza o atributo dataNascimento do Usuario
     */
    public void setDataNascimento(String dataNascimento)
    {
    	this.dataNascimento = dataNascimento;
    }
    
    /**
     * Atualiza o atributo sexo do Usuario
     */
    public void setSexo(String sexo)
    {
    	this.sexo = sexo;
    }
    
    /**
     * Atualiza o atributo cargo do Usuario
     */
    public void setCargo(Cargo cargo)
    {
    	this.cargo = cargo;
    }
    
    /**
     * Atualiza o atributo perfil do Usuario
     */
    public void setPerfil(Perfil perfil)
    {
    	this.perfil.addPerfil(perfil);
    }
}

package com.springweb.userdept.entities.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity                         // - Notação usada para falar que objeto é um tabela
@Table(name = "tb_department")  // - Explicita o nome da tabela no banco de dados
public class Department {

    @Id                                                 // - Explicita que é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // - Explicita que id é auto incrementavel
    private long id;
    private String name;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(){

    }

    public Department(long id, String name){
        this.id = id;
        this.name = name;
    }
}

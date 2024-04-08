package com.springweb.userdept.entities.User;

import com.springweb.userdept.entities.Department.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity                   // - Notação que explicita que objeto é uma tabela
@Table(name = "tb_user")  // - Indentifica nome da tabela
public class User {

    @Id                                                 // - Explicita que é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // - Explicita que id é auto incrementavel
    private long id;
    private String name;
    private String email;

    @ManyToOne                          // - Explicita relacionamento 1 - N entre user e department
    @JoinColumn(name = "department_id") // -- Configura o nome da chave estrangeira com o banco de dados
    private Department department;

    public User() {

    }

    public User(long id, String name, String email, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
}

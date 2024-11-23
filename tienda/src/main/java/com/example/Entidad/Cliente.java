package com.example.Entidad;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreDelCliente")
    private String nombreDelCliente;

    @Column(name = "emailDelCliente")
    private String emailDelCliente;

    @Column(name = "telefono")
    private String telefono;

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente){
        this.nombreDelCliente = nombreDelCliente;
    }

    public String getEmailDelCliente() {
        return emailDelCliente;
    }

    public void setEmailDelCliente(String emailDelCliente){
        this.emailDelCliente = emailDelCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
}


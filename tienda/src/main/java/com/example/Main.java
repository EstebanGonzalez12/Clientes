package com.example;

import com.example.Entidad.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Cliente cliente = new Cliente();
        cliente.setNombreDelCliente("Esteban");
        cliente.setEmailDelCliente("esteban@gmail.com");
        cliente.setTelefono("3226985540");

        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }
    
    //leer
    // public static Cliente leerCliente(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     Cliente cliente1 = em.find(Cliente.class, id);
    //     em.close();
    //     return cliente1;
    // }

    //actualizar
    // public static void actualizarCliente(Long id, String nuevoNombre, String nuevoEmail, String nuevoTelefono){
    //     EntityManager em = emf.createEntityManager();
    //     em.getTransaction().begin();

    //     Cliente cliente2 = em.find(Cliente.class, id);
    //     if (cliente2 !=null){
    //         cliente2.setNombreDelCliente("Laura");
    //         cliente2.setEmailDelCliente("laura@gmail.com");
    //         cliente2.setTelefono("3113236557");
    //         em.merge(cliente2);
    //     }
    // }
    
    //Eliminar
    // public static void eliminarCLiente(Long id) {
    //     EntityManager em = emf.createEntityManager();
    //     em.getTransaction().begin();

    //     Cliente cliente3 = em.find(Cliente.class, id);
    //     if(cliente3 != null) {
    //         em.remove(cliente3);
    //     }
    // }

}
package com.mikke.shoppstat;

import com.mikke.shoppstat.DAO.PersonDAO;
import com.mikke.shoppstat.entities.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Principal {
    public static void main(String[] args)
    {
        PersonDAO userDAO = new PersonDAO();
        Person userDB = null;
        long idToRemove = 0;

        LocalDate dateTime = null;

        //Creamos 2 instancias de Usuario
        Person user1 = new Person("Maikel", "Perez", "Javier", "mikke008@gmail.com",
                "56936392021", LocalDate.of(1981, 8, 9),
                "Santa Victoria 366 Depto 1412");

        Person user2 = new Person("Yasnaya", "Ferras", "Solorzano", "yasnayaferras@gmail.com",
                "5353589710", LocalDate.of(1989, 12, 31),
                "UCI");

        //Guardamos las dos instancias, guardamos el id del usuario1 para usarlo posteriormente
        userDAO.addUser(user1);
        idToRemove = userDAO.addUser(user2);

        //Modificamos el contacto 1 y lo actualizamos
        user1.setMail("mikkepj2o15@gmail.com");
        userDAO.updateUser(user1);

        //Recuperamos el contacto1 de la base de datos
        userDB = userDAO.getUser(idToRemove);
        System.out.println("Recuperamos a " + userDB.getName() + " " + userDB.getFirstLastname());

        //Eliminamos al contactoRecuperado (que es el contacto2)
        userDAO.deleteUser(userDB);

        //Obtenemos la lista de contactos que quedan en la base de datos y la mostramos
        List<Person> userList = userDAO.getAllUsers();
        System.out.println("Hay " + userList.size() + "usuarios en la base de datos:");

        for(Person u : userList)
        {
            System.out.println("-> " + u.getName() + " " + u.getFirstLastname());
        }
    }
}

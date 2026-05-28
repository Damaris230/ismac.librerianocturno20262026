package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {
    private Autor autor;

    @BeforeEach
    public void setUp() {
        autor = new Autor(
                1,
                "Gabriel",
                "García Márquez",
                "Colombia",
                "Calle 123",
                "0991234567",
                "ggarcia@correo.com"
        );
    }
    @Test
    public void testAutorConstructorAndGetters() {
        assertAll("Pruebas unitarias - Constructor y Getters - Autor",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Gabriel", autor.getNombre()),
                () -> assertEquals("García Márquez", autor.getApellido()),
                () -> assertEquals("Colombia", autor.getPais()),
                () -> assertEquals("Calle 123", autor.getDireccion()),
                () -> assertEquals("0991234567", autor.getTelefono()),
                () -> assertEquals("ggarcia@correo.com", autor.getCorreo())
        );
        System.out.println(autor.toString());
    }

    @Test
    public void testAutorSetters() {
        autor.setIdAutor(2);
        autor.setNombre("Jorge");
        autor.setApellido("Luis Borges");
        autor.setPais("Argentina");
        autor.setDireccion("Av. Corrientes 456");
        autor.setTelefono("0987654321");
        autor.setCorreo("jborges@correo.com");

        assertAll("Pruebas unitarias - Setters - Autor",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Jorge", autor.getNombre()),
                () -> assertEquals("Luis Borges", autor.getApellido()),
                () -> assertEquals("Argentina", autor.getPais()),
                () -> assertEquals("Av. Corrientes 456", autor.getDireccion()),
                () -> assertEquals("0987654321", autor.getTelefono()),
                () -> assertEquals("jborges@correo.com", autor.getCorreo())
        );
        System.out.println(autor.toString());
    }

    @Test
    public void testAutorToString() {
        String str = autor.toString();
        assertAll("Pruebas Unitarias - ToString - Autor",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Gabriel")),
                () -> assertTrue(str.contains("García Márquez")),
                () -> assertTrue(str.contains("Colombia")),
                () -> assertTrue(str.contains("Calle 123")),
                () -> assertTrue(str.contains("0991234567")),
                () -> assertTrue(str.contains("ggarcia@correo.com"))
        );
    }
}
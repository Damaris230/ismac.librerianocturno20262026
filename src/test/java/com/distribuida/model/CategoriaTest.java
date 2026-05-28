package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {
    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(
                1,
                "Novela",
                "Obras de ficción narrativa extensa"
        );
    }
    @Test
    public void testCategoriaConstructorAndGetters() {
        assertAll("Pruebas unitarias - Constructor y Getters - Categoria",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Novela", categoria.getCategoria()),
                () -> assertEquals("Obras de ficción narrativa extensa", categoria.getDescription())
        );
        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaSetters() {
        categoria.setIdCategoria(2);
        categoria.setCategoria("Ciencia Ficción");
        categoria.setDescription("Historias basadas en avances científicos y tecnológicos");

        assertAll("Pruebas unitarias - Setters - Categoria",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Ciencia Ficción", categoria.getCategoria()),
                () -> assertEquals("Historias basadas en avances científicos y tecnológicos", categoria.getDescription())
        );
        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaToString() {
        String str = categoria.toString();
        assertAll("Pruebas Unitarias - ToString - Categoria",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Novela")),
                () -> assertTrue(str.contains("Obras de ficción narrativa extensa"))
        );
    }
}
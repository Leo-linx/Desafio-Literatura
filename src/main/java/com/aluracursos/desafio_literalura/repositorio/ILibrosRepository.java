// Importa la clase Libros, que es la Entidad mapeada a la tabla libros de la base de datos.
// JpaRepository es una interfaz de Spring Data JPA que provee métodos CRUD automáticos.
// List para retornar listas de Libros.

package com.aluracursos.desafio_literalura.repositorio;
import com.aluracursos.desafio_literalura.models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ILibrosRepository extends JpaRepository<Libros, Long> {
    Libros findByTitulo(String titulo);

    List<Libros> findByLenguajesContaining(String lenguaje);
}

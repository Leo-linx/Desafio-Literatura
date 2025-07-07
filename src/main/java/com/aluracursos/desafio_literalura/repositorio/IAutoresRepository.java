// Importa la clase Autores, que es la Entidad mapeada a la tabla autores de la base de datos.
// JpaRepository es una interfaz de Spring Data JPA que provee métodos CRUD automáticos.
// List para retornar listas de autores.

package com.aluracursos.desafio_literalura.repositorio;
import com.aluracursos.desafio_literalura.models.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface IAutoresRepository extends JpaRepository<Autores, Long> {
    Autores findByNameIgnoreCase(String nombre);

    List<Autores> findByAñoNacimientoLessThanEqualAndAñoMuerteGreaterThanEqual(int añoInicial, int añoFinal);
}

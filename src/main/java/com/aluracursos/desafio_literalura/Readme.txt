

DESAFIO LITERATURA  
Este es un proyecto desarrollado en Java con Spring Boot que permite consultar y almacenar informacion
literaria a partir de la API de Gutendex. Cuenta con un menu interactivo para realizar diferentes operaciones sobre libros y autores, guardando los datos en una base de datos PostgreSQL

Funcionalidades del menu
1 - Buscar libros por titulo
2 - Listar libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en un determinado ano
5 - Listar libros por idioma en Base de Datos
0 - Salir del programa

Estructura del Proyecto

com.aluracursos.desafio_literalura

Application.java ---->  Punto de entrada de la aplicacion
Principal.java ------>  Clase con menu interactivo
Modelos/ ------------>  Entidades: Autores, Libros
Servicios/ ---------->  Logica de negocio   consumo de API, validaciones, filtros
Desafío Literalura -->  Documentación del Proyecto
Repositorio/ -------->  Interfaces JpaRepo


## 🧪 Tecnologías utilizadas

| Herramienta         | Versión         | Descripción                                   |
|---------------------|-----------------|-----------------------------------------------|
| Java                | SE 17           | Lenguaje de programación                      |
| Spring Boot         | 3.3.0           | Framework para desarrollo de aplicaciones web |
| Maven               | -               | Gestor de dependencias                        |
| PostgreSQL          | -               | Base de datos relacional                      |
| IntelliJ IDEA       | -               | Entorno de desarrollo (IDE)                   |
| Jackson Core        | -               | Librería para serialización JSON              |
| Jackson Dataformat  | -               | Soporte para diferentes formatos de JSON      |
| Spring Data JPA     | -               | Persistencia de datos con JPA                 |
| PostgreSQL Driver   | -               | Conector JDBC para PostgreSQL                 |
-----------------------------------------------------------------------------------------

Base de Datos
Se utiliza PostgreSQL para almacenar los datos persistentes. Las entidades estan mapeadas con JPA y se
relacionan mediante anotaciones como @OneToMany y @ManyToOne.


Como ejecutar el proyecto
1. Clona este repositorio.
2. Crea una base de datos PostgreSQL.
3. Configura application.properties con:
 spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
 spring.datasource.username=tu_usuario
 spring.datasource.password=tu_contrasena
 spring.jpa.hibernate.ddl-auto=update
4. Abre el proyecto en IntelliJ.
5. Ejecuta Application.java
6. Usa el menu en consola.

Notas adicionales
- Se conecta a la API de Gutendex.
- La busqueda es insensible a mayusculas.
- Los datos se guardan en la base de datos.




<img src="https://img.shields.io/badge/STATUS-FINALIZADO-green" display="inline" >

# Desafío de Consulta de Libros **APIBOOKS**
# ApiBooks
Api que consume libros con SpringBoot (Desafio)

Este proyecto es una aplicación de línea de comandos desarrollada en Java con Spring Boot. Permite a los usuarios buscar información detallada sobre libros utilizando la API de Gutendex, que proporciona metadatos de libros del Proyecto Gutenberg.

# Funcionalidades
### Búsqueda de Libros:
Los usuarios pueden ingresar el nombre de un libro y la aplicación buscará información detallada sobre ese libro, incluyendo el título, el autor, los idiomas disponibles y la cantidad de descargas.

### Estadísticas de Descargas:
La aplicación calcula estadísticas como la cantidad media, máxima y mínima de descargas entre los libros encontrados.

### Interacción con el Usuario:
La aplicación guía al usuario a través del proceso de búsqueda y muestra los resultados de manera clara y estructurada.

## Tecnologías Utilizadas
Java
Spring Boot
JUnit (para pruebas)
Gutendex JSON web API (para consultar metadatos de libros)

# Ejecución del Proyecto
1) Clona este repositorio a tu máquina local.
2) Abre el proyecto en tu IDE de preferencia.
3) Ejecuta la clase DesafioApplication como una aplicación de Spring Boot.
4) Sigue las instrucciones en la consola para interactuar con la aplicación.
# Ejemplo de Uso
Al ejecutar la aplicación, se te pedirá que ingreses el nombre del libro que deseas buscar.
Ingresa el nombre del libro, por ejemplo, "Don Quijote".
La aplicación buscará y mostrará información detallada sobre el libro, incluyendo estadísticas de descargas.


# Especificaciones

En mi reciente proyecto con Spring Boot, desarrollé una aplicación robusta y eficiente que ejecuta una serie de operaciones desde la línea de comandos. Permítame guiarle a través de los aspectos clave de esta aplicación y cómo he utilizado diversas funcionalidades de Java y Spring Boot para construirla.

# Estructura del Proyecto
## Paquete Principal: com.aluracursos.desafio
### 1.	Integración con Spring Boot:

He utilizado **"SpringApplication.run"** para iniciar la aplicación Spring Boot, lo que garantiza una configuración automática y la gestión del ciclo de vida del contexto de la aplicación. Esto no solo facilita el despliegue sino que también asegura que todos los componentes estén correctamente configurados y listos para usar.

### 2.	Implementación de *CommandLineRunner:*
Implementar **CommandLineRunner** me ha permitido ejecutar código específico inmediatamente después de que el contexto de la aplicación se inicializa. Esto es ideal para aplicaciones de línea de comandos donde necesitamos ejecutar lógica específica al inicio. En mi caso, he creado y ejecutado una instancia de la clase Principal, que contiene la lógica de interacción principal con el usuario.
### 3.	Pruebas Efectivas con JUnit:
Utilicé la anotación @SpringBootTest para cargar un contexto de aplicación completo durante las pruebas. La prueba **contextLoads** verifica que el contexto de la aplicación se carga correctamente, proporcionando una base sólida para asegurar que mi configuración es válida.
## Interacción de Usuario
La aplicación solicita al usuario que ingrese el nombre de un libro para buscar información detallada. Aquí es donde brilla la clase **Principal:**
### •	Método muestraElMenu:
Este método es responsable de la interacción con el usuario, guiándolo a través del proceso de búsqueda y mostrando los resultados de manera clara y estructurada. Implementé una lógica que consume una API externa para obtener datos de libros, autores y publicaciones, y luego los procesa y muestra al usuario.
## Funcionalidades Avanzadas
#### 1.	Consumo de API Externas:
o	La aplicación hace uso de la API de Gutendex para obtener información detallada sobre libros del Proyecto Gutenberg, incluyendo metadatos como autores, fechas de publicación y descripciones. He manejado la integración y el procesamiento de datos JSON, demostrando mi habilidad para trabajar con APIs RESTful y manejar datos en formato JSON.
#### 2.	Manipulación de Colecciones y Streams:
o	Utilicé la API de Streams de Java para procesar y filtrar datos de manera eficiente. Por ejemplo, he convertido listas de datos de libros en flujos, los he filtrado por evaluaciones y los he ordenado para encontrar los libros mejor y peor evaluados.
#### 3.	Estadísticas y Reportes:
o	La aplicación calcula estadísticas como la cantidad media de descargas de los libros y muestra el libro con la mayor y menor cantidad de descargas junto con sus nombres y fechas de publicación. Esto demuestra mi habilidad para realizar análisis de datos y generar reportes significativos.
### Resultados del Proyecto
Por ejemplo, al ingresar el nombre del libro "Don Quijote de la Mancha", la aplicación muestra los** siguientes resultados:**

#### Ingrese el nombre del libro que desea buscar:
Don Quijote
Libro encontrado:
DatosLibros[titulo=Don Quijote de la Mancha, autor=[DatosAutor[nombre=Cervantes Saavedra, Miguel de, fechaDeNacimiento=1547]], idiomas=[hu], numeroDeDescargas=359.0]
*********************
Cantidad Media de descargas: 33604.625
Cantidad Máxima de descargas: 73638.0
Cantidad Mínima de descargas: 15835.0
Cantidad de registros evaluados para calcular las estadísticas: 32
### Mejores Prácticas
#### •	Manejo de Excepciones:
Aunque el método **run** declara **throws Exception**, he diseñado la aplicación para manejar excepciones específicas de manera más granular, mejorando la robustez y la capacidad de recuperación del sistema.
#### •	Documentación y Legibilidad:
He documentado el código extensivamente y mantenido una estructura clara y legible, asegurando que otros desarrolladores puedan entender y mantener la aplicación fácilmente.
# Conclusión
Este proyecto no solo demuestra mi capacidad para utilizar Spring Boot y Java de manera efectiva, sino también mi habilidad para integrar servicios externos, manejar datos complejos y proporcionar una experiencia de usuario intuitiva. Al trabajar con la API de Gutendex, he mostrado mi capacidad para adaptarme y utilizar diversas fuentes de datos para construir aplicaciones ricas en funcionalidades. Estoy entusiasmado por aplicar estas habilidades en un entorno profesional y contribuir al éxito de su equipo de desarrollo.
## Contribución
Si quieres contribuir a este proyecto, ¡no dudes en enviar un pull request! También puedes informar sobre errores o sugerir nuevas funcionalidades abriendo un issue.

## Contacto
Para cualquier pregunta o comentario, no dudes en contactarme a través de mi dirección de correo electrónico.

# Video 


https://github.com/TeodoroMG/ApiBooks/assets/108698165/9d067a34-286f-4c14-895a-a03538cd6d13



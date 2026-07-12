# LlanquihueTourApp

Sistema desarrollado en Java para apoyar la gestión de información de la agencia turística **Llanquihue Tour**.

El proyecto fue creado para la asignatura **Desarrollo Orientado a Objetos I** y presenta una evolución progresiva de distintas funcionalidades, aplicando colecciones, lectura de archivos CSV, herencia, polimorfismo, interfaces, estructuras dinámicas e interfaz gráfica.

## Descripción general

LlanquihueTourApp permite representar y gestionar distintas entidades relacionadas con una agencia de turismo.

A lo largo de las actividades se han incorporado funcionalidades como:

- Carga de personas desde archivos CSV.
- Almacenamiento de datos en colecciones.
- Búsquedas y filtros.
- Modelamiento de servicios turísticos.
- Aplicación de herencia y polimorfismo.
- Uso de interfaces.
- Validación de tipos mediante `instanceof`.
- Registro y visualización de entidades mediante una interfaz gráfica.
- Organización modular del código mediante paquetes.

## Actividades desarrolladas

### Actividad 1: Registros y colecciones

La primera actividad incorpora la carga y gestión de personas vinculadas con la agencia turística.

Principales funcionalidades:

- Lectura de información desde un archivo CSV.
- Almacenamiento de registros en colecciones.
- Filtrado de personas por tipo.
- Filtrado por comuna.
- Búsqueda por nombre.
- Visualización de datos mediante consola.

Ubicación:

```text
actividad1-registros/

Actividad 2: Herencia y polimorfismo

La segunda actividad amplía el sistema mediante una jerarquía de clases para representar distintos servicios turísticos.

Principales funcionalidades:

Clase base para representar servicios turísticos.
Subclases con características específicas.
Sobrescritura de métodos.
Colección polimórfica.
Recorrido y visualización de objetos mediante un comportamiento común.

Ubicación:
actividad2-polimorfismo/
Actividad 3: Interfaces, instanceof e interfaz gráfica

La tercera actividad incorpora distintas entidades gestionables por la agencia, utilizando una interfaz común y una aplicación gráfica desarrollada con JOptionPane.

Principales funcionalidades:

Interfaz Registrable.
Superclase abstracta RecursoAgencia.
Clases GuiaTuristico, Vehiculo y ColaboradorExterno.
Implementación del método mostrarResumen().
Colección genérica ArrayList<Registrable>.
Diferenciación de objetos mediante instanceof.
Registro de entidades desde una interfaz gráfica.
Visualización de los registros almacenados.
Validación básica de datos numéricos.

Ubicación:
actividad3-interfaces-gui/
Estructura del repositorio
LlanquihueTourApp/
├── actividad1-registros/
│   ├── data/
│   │   └── personas.csv
│   └── src/
│       ├── app/
│       ├── model/
│       ├── service/
│       ├── ui/
│       └── util/
│
├── actividad2-polimorfismo/
│   └── src/
│       ├── app/
│       ├── model/
│       └── service/
│
├── actividad3-interfaces-gui/
│   └── src/
│       ├── data/
│       │   └── GestorEntidades.java
│       ├── model/
│       │   ├── Registrable.java
│       │   ├── RecursoAgencia.java
│       │   ├── GuiaTuristico.java
│       │   ├── Vehiculo.java
│       │   └── ColaboradorExterno.java
│       └── ui/
│           └── Main.java
│
├── .gitignore
└── README.md

Diseño orientado a objetos de la actividad 3

La actividad 3 utiliza la siguiente jerarquía:

Registrable
     ↑
RecursoAgencia
     ↑
 ┌────────────────────┬──────────────┬─────────────────────┐
GuiaTuristico       Vehiculo      ColaboradorExterno

La interfaz Registrable define el contrato común:
String mostrarResumen();

Cada subclase implementa este método de acuerdo con sus propias características.

Clases principales de la actividad 3
Registrable

Interfaz que define el comportamiento común de las entidades gestionables.

RecursoAgencia

Superclase abstracta que contiene los atributos comunes:

ID.
Nombre.
GuiaTuristico

Representa a un guía de turismo.

Atributos específicos:

Especialidad.
Idioma.
Vehiculo

Representa a un vehículo utilizado por la agencia.

Atributos específicos:

Patente.
Capacidad de pasajeros.
ColaboradorExterno

Representa a una persona o empresa que presta servicios externos.

Atributos específicos:

Tipo de servicio.
Teléfono.
GestorEntidades

Administra la colección de objetos mediante:

ArrayList<Registrable>

También utiliza instanceof para diferenciar los objetos durante la ejecución y mostrar información específica según su tipo.

Main

Contiene el punto de entrada del programa y la interfaz gráfica creada con JOptionPane.

Funcionalidades del menú gráfico

El sistema permite:

Registrar un guía turístico.
Registrar un vehículo.
Registrar un colaborador externo.
Mostrar todas las entidades.
Mostrar entidades diferenciadas por tipo.
Finalizar el programa.
Requisitos

Para ejecutar el proyecto se necesita:

Java JDK 17 o superior.
IntelliJ IDEA o cualquier IDE compatible con Java.
Git, en caso de querer clonar o actualizar el repositorio.
Ejecución de la actividad 3
Abrir el proyecto en IntelliJ IDEA.
Abrir la carpeta:
actividad3-interfaces-gui
Verificar que la carpeta src esté marcada como Sources Root.
Abrir la clase:
src/ui/Main.java
Ejecutar el método:
public static void main(String[] args)
Interactuar con el menú gráfico mostrado en pantalla.
Ejemplo de uso

El usuario puede registrar un guía turístico ingresando:

ID: 1
Nombre: Camila Soto
Especialidad: Senderismo
Idioma: Inglés

También puede registrar un vehículo:

ID: 2
Nombre: Minibús Mercedes-Benz
Patente: ABCD12
Capacidad: 18

Posteriormente, el sistema permite visualizar todos los registros mediante cuadros de diálogo.

Conceptos aplicados

En este proyecto se aplican los siguientes conceptos:

Programación orientada a objetos.
Encapsulamiento.
Herencia.
Polimorfismo.
Clases abstractas.
Interfaces.
Sobrescritura de métodos.
Colecciones genéricas.
ArrayList.
Operador instanceof.
Manejo básico de excepciones.
Interfaces gráficas con Swing.
Organización mediante paquetes.
Buenas prácticas utilizadas
Nombres descriptivos para clases, atributos y métodos.
Separación de responsabilidades.
Organización modular por paquetes.
Uso de atributos privados.
Uso de constructores y métodos de acceso.
Reutilización de comportamiento mediante herencia.
Programación orientada a interfaces.
Validación de entradas numéricas.
Código ordenado y legible.
Autoría

Proyecto académico desarrollado por:

Javiera Paz Saavedra Pérez

Asignatura:

Desarrollo Orientado a Objetos I

Institución:

Duoc UC

Estado del proyecto

Proyecto académico en desarrollo progresivo.

La versión actual incorpora registros, colecciones, herencia, polimorfismo, interfaces, validación de tipos e interfaz gráfica.



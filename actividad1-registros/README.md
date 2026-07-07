# LlanquihueTourApp

## Descripción del proyecto

LlanquihueTourApp es una aplicación de consola desarrollada en Java para apoyar la gestión de registros de la agencia turística Llanquihue Tour. El sistema permite cargar personas vinculadas a la operación de la agencia, como guías, operadores y proveedores, desde un archivo externo `.csv`.

La aplicación utiliza una estructura modular organizada en paquetes, aplica principios básicos de Programación Orientada a Objetos, usa colecciones dinámicas y permite ejecutar filtros y búsquedas simples por consola.

## Objetivo

Automatizar tareas básicas de registro, visualización, búsqueda y filtrado de personas vinculadas a la operación turística de Llanquihue Tour.

## Estructura del proyecto

```text
actividad1-registros/
├── data/
│   └── personas.csv
├── src/
│   ├── app/
│   │   └── Main.java
│   ├── model/
│   │   ├── Contacto.java
│   │   ├── PersonaTuristica.java
│   │   ├── RutaTuristica.java
│   │   └── AsignacionRuta.java
│   ├── service/
│   │   ├── RegistroService.java
│   │   └── RutaService.java
│   ├── ui/
│   │   └── ConsolaUI.java
│   └── util/
│       └── ValidadorDatos.java
└── README.md
```

## Paquetes utilizados

- `app`: contiene la clase principal `Main`.
- `model`: contiene las clases del dominio del sistema.
- `service`: contiene la lógica de carga, búsqueda, filtrado y manejo de datos.
- `ui`: contiene métodos de apoyo para mostrar información en consola.
- `util`: contiene validaciones y métodos utilitarios.

## Clases implementadas

- `Contacto`: almacena teléfono y correo de una persona.
- `PersonaTuristica`: representa a una persona vinculada a la agencia, como guía, operador o proveedor.
- `RutaTuristica`: representa una ruta turística ofrecida por la agencia.
- `AsignacionRuta`: relaciona una persona con una ruta turística, aplicando composición entre clases.
- `RegistroService`: carga datos desde archivo, almacena objetos en `ArrayList` y permite búsquedas y filtros.
- `RutaService`: gestiona rutas turísticas base.
- `ConsolaUI`: organiza la salida de información en consola.
- `ValidadorDatos`: valida y limpia datos ingresados desde el archivo.
- `Main`: ejecuta el sistema y muestra los resultados.

## Funcionalidades

- Carga de datos desde archivo `personas.csv`.
- Uso de colección dinámica `ArrayList`.
- Visualización de registros por consola.
- Búsqueda por nombre.
- Filtro por tipo de persona.
- Filtro por comuna.
- Ejemplo de composición entre clases.
- Validaciones básicas con `try-catch`.

## Cómo ejecutar el programa

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que la carpeta `data` se encuentre dentro del proyecto.
3. Abrir la clase principal:

```text
src/app/Main.java
```

4. Ejecutar el método `main`.

También se puede ejecutar desde terminal ubicándose en la carpeta `actividad1-registros`:

```bash
javac -d out src/model/*.java src/util/*.java src/service/*.java src/ui/*.java src/app/*.java
java -cp out app.Main
```

## Archivo de datos

El archivo `data/personas.csv` utiliza separador punto y coma `;` y tiene la siguiente estructura:

```text
rut;nombre;tipo;comuna;especialidad;telefono;email
```

## Autoría

Actividad desarrollada para la asignatura Desarrollo Orientado a Objetos I.

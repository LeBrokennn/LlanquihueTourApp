# 🗺️ LlanquihueTourApp

Aplicación desarrollada en **Java** para apoyar la gestión de información de la agencia turística ficticia **Llanquihue Tour**.

Este repositorio reúne las actividades realizadas durante la asignatura **Desarrollo Orientado a Objetos I**, incorporando progresivamente conceptos como colecciones, archivos CSV, herencia, polimorfismo, clases abstractas, interfaces, manejo de excepciones y validación de datos.

---

## 📌 Descripción del proyecto

**LlanquihueTourApp** permite representar y administrar diferentes elementos relacionados con una agencia turística, tales como:

- Clientes.
- Guías turísticos.
- Operadores turísticos.
- Proveedores de alojamiento.
- Servicios turísticos.
- Vehículos.
- Colaboradores externos.

El repositorio se divide en tres actividades prácticas y una evaluación final. Cada etapa incorpora nuevos contenidos de programación orientada a objetos hasta llegar a una aplicación completa ejecutada mediante consola.

---

## 📂 Actividades desarrolladas

| Carpeta | Tema principal | Descripción |
|---|---|---|
| `actividad1-registros` | Colecciones y archivos CSV | Carga registros desde un archivo CSV y permite buscar y filtrar información. |
| `actividad2-polimorfismo` | Herencia y polimorfismo | Implementa una jerarquía de servicios turísticos mediante una colección polimórfica. |
| `actividad3-interfaces-gui` | Interfaces y GUI | Gestiona recursos de la agencia mediante interfaces y ventanas con `JOptionPane`. |
| `evaluacion-final` | Integración de contenidos | Implementa un sistema de consola para registrar, buscar, mostrar y eliminar personas relacionadas con la agencia. |

---

## 🗂️ Estructura del repositorio

```text
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
│       ├── data/
│       ├── model/
│       └── ui/
│
├── actividad3-interfaces-gui/
│   └── src/
│       ├── data/
│       ├── model/
│       └── ui/
│
├── evaluacion-final/
│   └── src/
│       ├── app/
│       │   └── Main.java
│       ├── exception/
│       │   └── RutInvalidoException.java
│       ├── interfaces/
│       │   └── Registrable.java
│       ├── model/
│       │   ├── Cliente.java
│       │   ├── Direccion.java
│       │   ├── GuiaTuristico.java
│       │   ├── OperadorTuristico.java
│       │   ├── PersonaTuristica.java
│       │   └── ProveedorAlojamiento.java
│       ├── service/
│       │   └── GestorPersonas.java
│       └── util/
│           └── ValidadorRut.java
│
├── .gitignore
├── LlanquihueTourApp.iml
└── README.md
```

---

## 1️⃣ Actividad 1: registros y colecciones

Esta actividad permite gestionar personas vinculadas con la agencia turística utilizando colecciones y lectura de archivos.

### Funcionalidades

- Lectura de información desde un archivo CSV.
- Almacenamiento de registros en colecciones.
- Búsqueda de personas por nombre.
- Filtrado por tipo de persona.
- Filtrado por comuna.
- Visualización de resultados mediante consola.

### Conceptos aplicados

- Clases y objetos.
- Colecciones.
- Lectura de archivos CSV.
- Métodos de búsqueda.
- Filtros de información.
- Separación por paquetes.

---

## 2️⃣ Actividad 2: herencia y polimorfismo

Esta actividad amplía el sistema mediante una jerarquía de clases para representar distintos servicios turísticos.

### Conceptos aplicados

- Herencia.
- Polimorfismo.
- Sobrescritura de métodos.
- Colecciones genéricas.
- Clases base y clases derivadas.
- Separación de responsabilidades.
- Organización mediante paquetes.

---

## 3️⃣ Actividad 3: interfaces y GUI

La tercera actividad incorpora nuevas entidades administrables por la agencia y una interfaz gráfica básica.

### Entidades disponibles

- Guía turístico.
- Vehículo.
- Colaborador externo.

### Funcionalidades

- Registrar guías turísticos.
- Registrar vehículos.
- Registrar colaboradores externos.
- Mostrar todas las entidades.
- Diferenciar los tipos de entidades.
- Visualizar información con `JOptionPane`.

### Conceptos aplicados

- Interfaces.
- Polimorfismo.
- Operador `instanceof`.
- Colecciones dinámicas.
- Interfaz gráfica.
- Java Swing.
- `JOptionPane`.

---

## 🎓 Evaluación final

La evaluación final integra los principales contenidos trabajados durante la asignatura en una aplicación ejecutada mediante consola.

El sistema permite administrar distintas personas vinculadas con la agencia turística utilizando una clase abstracta, herencia, interfaces, colecciones y manejo de excepciones.

### Entidades implementadas

- `PersonaTuristica`, como clase abstracta.
- `Cliente`.
- `GuiaTuristico`.
- `OperadorTuristico`.
- `ProveedorAlojamiento`.
- `Direccion`.

### Menú principal

La aplicación permite:

1. Registrar un cliente.
2. Registrar un guía turístico.
3. Registrar un operador turístico.
4. Registrar un proveedor de alojamiento.
5. Mostrar todos los registros.
6. Buscar una persona por RUT.
7. Buscar personas por nombre.
8. Eliminar una persona por RUT.
9. Mostrar la cantidad total de registros.
10. Finalizar el programa.

### Validaciones implementadas

- Validación de RUT chileno mediante dígito verificador.
- Excepción personalizada para RUT inválidos.
- Prevención de registros duplicados por RUT.
- Validación de datos numéricos ingresados por consola.
- Mensajes cuando no existen registros.
- Mensajes cuando una búsqueda no encuentra resultados.

---

## 🧩 Organización de la evaluación final

### `app`

Contiene la clase `Main`, encargada de ejecutar el programa, mostrar el menú y recibir las opciones ingresadas por el usuario.

### `model`

Contiene las clases que representan las entidades principales del sistema.

### `service`

Contiene `GestorPersonas`, encargado de administrar la colección de personas y realizar operaciones de registro, búsqueda y eliminación.

### `interfaces`

Contiene la interfaz `Registrable`, que define las operaciones comunes de registro y visualización.

### `exception`

Contiene la excepción personalizada `RutInvalidoException`.

### `util`

Contiene `ValidadorRut`, encargado de validar el formato y dígito verificador del RUT chileno.

---

## 🛠️ Tecnologías utilizadas

- Java.
- Java Swing.
- `JOptionPane`.
- IntelliJ IDEA.
- Git.
- GitHub.
- Programación orientada a objetos.

---

## 🧠 Conceptos aplicados

- Clases y objetos.
- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Clases abstractas.
- Interfaces.
- Sobrescritura de métodos.
- Colecciones genéricas.
- `ArrayList`.
- Operador `instanceof`.
- Manejo de excepciones.
- Excepciones personalizadas.
- Validación de datos.
- Lectura de archivos CSV.
- Interfaces gráficas.
- Organización modular mediante paquetes.

---

## ▶️ Cómo ejecutar la evaluación final

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Ubicar la carpeta:

```text
evaluacion-final/src
```

4. Marcarla como carpeta de código fuente:

```text
Mark Directory as → Sources Root
```

5. Verificar que el proyecto tenga configurado un JDK, preferentemente Java 17.
6. Abrir el archivo:

```text
evaluacion-final/src/app/Main.java
```

7. Ejecutar el método:

```java
public static void main(String[] args)
```

8. Utilizar las opciones mostradas en la consola.

---

## 🖥️ Ejemplo del menú

```text
==============================
     LLANQUIHUE TOUR APP
==============================
1. Registrar cliente
2. Registrar guía turístico
3. Registrar operador turístico
4. Registrar proveedor de alojamiento
5. Mostrar todos los registros
6. Buscar persona por RUT
7. Buscar persona por nombre
8. Eliminar persona por RUT
9. Mostrar cantidad de registros
0. Salir
==============================
Seleccione una opción:
```

---

## 👥 Autores

- **Javiera Paz Saavedra Pérez**
- **Byron Ignacio Aguilar Vega**

---

## 📚 Asignatura

**Desarrollo Orientado a Objetos I**

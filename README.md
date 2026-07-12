# 🗺️ LlanquihueTourApp

Aplicación desarrollada en **Java** para apoyar la gestión de información de la agencia turística **Llanquihue Tour**.

Este repositorio reúne las actividades realizadas en la asignatura **Desarrollo Orientado a Objetos I**, incorporando progresivamente conceptos como colecciones, lectura de archivos CSV, herencia, polimorfismo, interfaces, estructuras dinámicas e interfaces gráficas.

---

## 📌 Descripción del proyecto

LlanquihueTourApp permite representar y administrar distintos elementos asociados a una agencia de turismo, como personas, servicios turísticos, guías, vehículos y colaboradores externos.

El proyecto se encuentra dividido en actividades independientes, cada una orientada a aplicar nuevos conceptos de programación orientada a objetos.

---

## 📂 Actividades desarrolladas

| Actividad | Tema principal | Descripción |
|---|---|---|
| `actividad1-registros` | Colecciones y archivos CSV | Carga personas desde un archivo CSV, almacena los registros y permite realizar filtros y búsquedas. |
| `actividad2-polimorfismo` | Herencia y polimorfismo | Implementa una jerarquía de servicios turísticos y utiliza una colección polimórfica. |
| `actividad3-interfaces-gui` | Interfaces, `instanceof` y GUI | Gestiona guías, vehículos y colaboradores externos mediante una interfaz gráfica desarrollada con `JOptionPane`. |

---

## 🧱 Estructura del repositorio

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

## 🧩 Actividad 1: registros y colecciones

Esta actividad permite gestionar personas vinculadas con la agencia turística.

### Funcionalidades

- Lectura de información desde un archivo CSV.
- Almacenamiento de registros en colecciones.
- Búsqueda de personas por nombre.
- Filtrado por tipo de persona.
- Filtrado por comuna.
- Visualización de resultados por consola.
Filtrado por comuna.
Visualización de resultados por consola.



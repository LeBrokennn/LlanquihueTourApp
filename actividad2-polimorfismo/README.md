# LlanquihueTourApp

## Descripcion del proyecto

LlanquihueTourApp es una aplicacion Java desarrollada para la agencia de turismo Llanquihue Tour. En esta semana se incorporo el uso de polimorfismo, sobrescritura de metodos y colecciones genericas para gestionar distintos tipos de servicios turisticos desde una misma lista.

El sistema permite almacenar servicios como rutas gastronomicas, paseos lacustres y excursiones culturales en una coleccion de tipo `List<ServicioTuristico>`. Luego, al recorrer la lista, se ejecuta el metodo `mostrarInformacion()` correspondiente a cada subclase, aplicando polimorfismo.

## Objetivo de la semana

Aplicar los conceptos de programacion orientada a objetos mediante:

- Superclase `ServicioTuristico`.
- Subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.
- Sobrescritura del metodo `mostrarInformacion()` con `@Override`.
- Uso de una coleccion generica `List<ServicioTuristico>`.
- Recorrido de objetos mediante un ciclo `for-each`.
- Organizacion del codigo en paquetes `model`, `data` y `ui`.

## Estructura del proyecto

```text
actividad2-polimorfismo/
├── README.md
└── src/
    ├── model/
    │   ├── ServicioTuristico.java
    │   ├── RutaGastronomica.java
    │   ├── PaseoLacustre.java
    │   └── ExcursionCultural.java
    ├── data/
    │   └── GestorServicios.java
    └── ui/
        └── Main.java
```

## Clases principales

### ServicioTuristico

Superclase abstracta que contiene los atributos comunes de todos los servicios turisticos:

- codigo
- nombre
- ubicacion
- duracionHoras
- precio

Tambien define el metodo abstracto `mostrarInformacion()`, el cual debe ser implementado por cada subclase.

### RutaGastronomica

Subclase que representa servicios relacionados con experiencias culinarias. Agrega los atributos `especialidad` y `cantidadDegustaciones`.

### PaseoLacustre

Subclase que representa paseos realizados en lago. Agrega los atributos `nombreLago` e `incluyeChalecoSalvavidas`.

### ExcursionCultural

Subclase que representa recorridos culturales. Agrega los atributos `lugarHistorico` y `guiaAsignado`.

### GestorServicios

Clase ubicada en el paquete `data`. Contiene una coleccion `List<ServicioTuristico>` donde se cargan cinco objetos de diferentes subclases. Tambien incluye el metodo `mostrarServicios()`, que recorre la lista y ejecuta el metodo sobrescrito de cada objeto.

### Main

Clase principal ubicada en el paquete `ui`. Permite ejecutar el programa y mostrar por consola la informacion de los servicios turisticos.

## Instrucciones para compilar y ejecutar

Desde la carpeta `actividad2-polimorfismo`, abrir una terminal y ejecutar:

```bash
javac -d out src/model/*.java src/data/*.java src/ui/*.java
java -cp out ui.Main
```

## Salida esperada

Al ejecutar el programa, se muestra por consola la informacion de los cinco servicios registrados. Aunque todos se almacenan como `ServicioTuristico`, cada objeto ejecuta su propia version de `mostrarInformacion()`, demostrando el uso de polimorfismo.

## Conceptos aplicados

- Programacion orientada a objetos.
- Herencia.
- Superclase y subclases.
- Sobrescritura de metodos.
- Polimorfismo.
- Colecciones genericas.
- Ciclo `for-each`.
- Organizacion por paquetes.

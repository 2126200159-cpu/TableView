# Tablas: registro de productos con JavaFX

Práctica de Programación Orientada a Objetos desarrollada en **NetBeans** con **JavaFX** y **Maven**. La aplicación registra y maneja información de productos en una tabla (`TableView`), siguiendo el procedimiento de la clase modelo, con un cuarto campo adicional asignado de forma individual.

## Datos del alumno

- **Nombre:** _(escribe aquí tu nombre completo)_
- **Grupo:** _(escribe aquí tu grupo)_
- **Materia:** Programación Orientada a Objetos
- **Campo adicional asignado:** Proveedor

## Estructura del producto

| Campo | Tipo | Descripción |
|---|---|---|
| `nombre` | `String` | Nombre del producto (campo base) |
| `precio` | `double` | Precio del producto (campo base) |
| `cantidad` | `int` | Cantidad disponible (campo base) |
| `proveedor` | `String` | Proveedor del producto (**campo adicional**) |

Los tres campos base de la clase modelo se conservaron sin eliminarse ni sustituirse. El campo `proveedor` se agregó a la clase, a la tabla, al formulario y a los métodos de Agregar y Reiniciar.

## Funcionalidades

- Mostrar los productos en una tabla con cuatro columnas: Nombre, Precio, Cantidad y Proveedor.
- Cargar productos iniciales al abrir la aplicación.
- **Agregar** un producto nuevo desde el formulario (con validación de precio y cantidad).
- **Reiniciar** los campos de texto del formulario.
- **Editar el nombre** de un producto directamente en la tabla (doble clic).
- **Eliminar** una o varias filas seleccionadas (selección múltiple con `Ctrl`).

## Estructura del proyecto

```
Tablas/
├── pom.xml
└── src/main/
    ├── java/
    │   ├── module-info.java
    │   └── edu/utj/evnd/poo/tablas/
    │       ├── App.java
    │       ├── Producto.java
    │       └── PrimaryController.java
    └── resources/
        └── edu/utj/evnd/poo/tablas/
            └── primary.fxml
```

## Requisitos

- JDK compatible con la versión de JavaFX configurada en el `pom.xml`
- Apache NetBeans
- Maven (incluido en NetBeans)
- Conexión a internet la primera vez, para descargar las dependencias de JavaFX

## Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone <URL-DEL-REPOSITORIO>
   ```
2. Abre la carpeta del proyecto en NetBeans (**File → Open Project**).
3. Haz clic derecho en el proyecto y elige **Clean and Build**.
4. Haz clic derecho en el proyecto y elige **Run**.

También puedes ejecutarlo desde la terminal, dentro de la carpeta del proyecto:

```bash
mvn clean javafx:run
```

## Uso

1. Al abrir la aplicación se muestra la tabla con los productos iniciales.
2. Escribe nombre, precio, cantidad y proveedor, y pulsa **Agregar**.
3. Pulsa **Reiniciar** para limpiar los campos del formulario.
4. Haz doble clic en un nombre de la tabla para editarlo y confirma con `Enter`.
5. Selecciona una o varias filas (`Ctrl` + clic) y pulsa **Eliminar** para borrarlas.

## Datos de ejemplo

| Nombre | Precio | Cantidad | Proveedor |
|---|---|---|---|
| Manzana | 1.99 | 100 | Frutas del Valle |
| Pera | 2.99 | 200 | Agricola San Jose |
| Naranja | 3.99 | 300 | Citricos de Jalisco |
| Piña | 3.99 | 500 | Distribuidora La Huerta |

## Tecnologías

- Java
- JavaFX (`TableView`, `TableColumn`, FXML)
- Maven
- NetBeans

## Notas

- El campo `proveedor` debe coincidir con su getter (`getProveedor()`), ya que `PropertyValueFactory` lo usa para mostrar el dato en la columna.
- El archivo `module-info.java` abre el paquete a `javafx.fxml` y `javafx.base` para que la tabla pueda leer los datos.
- El FXML usa `TableView`, que es el mismo componente del ejemplo de la clase modelo.

## Autor

_(Tu nombre)_ — Universidad Tecnológica de Jalisco (UTJ)

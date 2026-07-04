# JFo 3-1 - Actividad 15

## Reescribe un programa sin valores repetidos

Sustituye los literales repetidos por variables reutilizables.

## Objetivo

- Leer el codigo base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorreccion.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Nombre: Marta
Edad: 19
Producto: Cuaderno
Precio: 3.5
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/modulo3_1_actividad15/Actividad15.java`.
3. Corrige o completa el codigo.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta los tests desde `src/test/java/modulo3_1_actividad15/Actividad15Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- El workflow `Java CI` se ejecuta automaticamente en cada `push`.
- Si pasa, el repositorio esta aprobado.
- Si falla, revisa los errores de compilacion o los tests.

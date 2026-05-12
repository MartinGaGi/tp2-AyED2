# 📘 Trabajo Práctico 2 - Algoritmos y Estructura de Datos II

## 👨‍💻 Alumno
MartinGaGi

---

# 📚 Descripción

Este proyecto fue desarrollado en Java como parte del Trabajo Práctico 2 de la materia **Algoritmos y Estructura de Datos II**.

El objetivo principal del trabajo fue ampliar un sistema educativo previamente desarrollado, incorporando conceptos fundamentales de la Programación Orientada a Objetos (POO), especialmente:

- Herencia
- Polimorfismo
- Encapsulamiento
- Relaciones entre clases
- Sobreescritura de métodos
- Organización modular del código

Además, se trabajó con estructuras dinámicas y lógica de gestión mediante menús interactivos por consola.

---

# 🧩 Clases implementadas

## 👤 Persona
Clase base del sistema educativo.

### Atributos:
- nombre
- apellido
- edad
- documento

### Funcionalidades:
- Constructor completo
- Getters y setters
- Método `toString()`
- Métodos `equals()` y `hashCode()`

---

## 🎓 Estudiante
Clase derivada de `Persona`.

### Atributos:
- carrera
- promedio
- materias

### Funcionalidades:
- Gestión de materias
- Cálculo de promedio
- Herencia mediante `extends`
- Uso de `super`

---

## 👨‍🏫 Profesor
Clase derivada de `Persona`.

### Atributos:
- especialidad
- añosExperiencia
- materiasAsignadas

### Funcionalidades:
- Asignación de materias
- Gestión académica
- Uso de herencia y polimorfismo

---

## 🏢 Personal
Clase derivada de `Persona`.

### Atributos:
- departamento
- puesto
- fechaIngreso

### Funcionalidades:
- Gestión del personal institucional
- Encapsulamiento completo

---

## 📖 Materia

### Atributos:
- nombre
- código
- créditos
- calificación
- profesor

### Funcionalidades:
- Asociación con profesores
- Gestión académica
- Validaciones de datos

---

## 🎯 Carrera
Clase encargada de administrar estudiantes.

### Funcionalidades:
- Agregar estudiantes
- Buscar estudiantes
- Listar estudiantes
- Gestión mediante `ArrayList`

---

## 🏫 Universidad
Clase principal de organización del sistema.

---

## ▶️ App
Clase principal encargada de ejecutar el sistema mediante un menú interactivo por consola.

---

# ⚙️ Funcionalidades implementadas

- ✔ Gestión de estudiantes
- ✔ Gestión de profesores
- ✔ Gestión de materias
- ✔ Asociación entre profesores y materias
- ✔ Cálculo de promedios
- ✔ Menú interactivo
- ✔ Validaciones de datos
- ✔ Uso de herencia
- ✔ Sobreescritura de métodos
- ✔ Uso de listas dinámicas (`ArrayList`)

---

# 🧠 Conceptos aplicados

- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Encapsulamiento
- Modularización
- Relaciones entre clases
- Sobreescritura de métodos
- Métodos `toString()`
- Métodos `equals()` y `hashCode()`
- Uso de `ArrayList`
- Menús interactivos

---

# 📁 Estructura del proyecto

```text
src/
 ├── App.java
 ├── Persona.java
 ├── Estudiante.java
 ├── Profesor.java
 ├── Personal.java
 ├── Materia.java
 ├── Carrera.java
 └── Universidad.java

README.md

# 🪪 Generador de Credenciales de Evento

**Estudiantes:**  
- Oscar Zúñiga, Francisco Zamorano – Patrones de Diseño (Sección 1)  

---

## 🎯 Objetivo del Proyecto

El objetivo de este proyecto es implementar un sistema en Java que permita emitir credenciales personalizadas para un evento, a partir de una plantilla base clonable. El sistema utiliza los patrones de diseño **Prototype** (para clonar credenciales) y **Singleton** (para aplicar una configuración global del evento como el logo y la fuente).

---

## 🚀 Cómo ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/usuario/repositorio.git
cd repositorio
```

2. Compilar y ejecutar:

```bash
javac src/DemoEvento.java
java src.DemoEvento
```

---

## 🧬 Patrón Prototype – Aplicación

La clase `CredencialEvento` donde esta Prototype implementa la interfaz `Cloneable` y permite clonar una plantilla base mediante deep copy
este se accede mediante :

```java
CredencialEvento clon = plantilla.clone();
clon.setNombre("Nombre");
clon.setCargo("Cargo");
clon.setRut("RUT");
```

Esto permite generar credenciales completamente independientes entre sí.

---

## 🔒 Patrón Singleton – Aplicación

La clase `ConfiguracionGlobal` donde contiene el Singleton:
     -Logo del Evento
     -Fuente
y se accede mediante :
```java
ConfiguracionGlobal.getInstancia().setLogo("Logo del Evento");
ConfiguracionGlobal.getInstancia().setFuente("Fuente");
```

---

## 🖥️ Menú por consola

```text
--- MENÚ ---
1. Agregar nueva credencial
2. Ver credenciales generadas
3. Salir
```

---

## 📊 Diagrama de Clases (UML)

![image](https://github.com/user-attachments/assets/f5f87ed0-1673-48db-b9d5-fcca268464f6)

---

## 📸 Capturas del sistema funcionando

### Menú principal y creación de credencial

![image](https://github.com/user-attachments/assets/ff031915-0046-4f7e-bf14-9595084725c0)

### Visualización de credenciales generadas

![image](https://github.com/user-attachments/assets/7701010c-98cc-4a2d-b865-3771d65b891d)


### Salida del programa

![image](https://github.com/user-attachments/assets/40554686-a4c8-495d-a306-7c1826a19813)

----------------------------------------------------------------------------------------------------

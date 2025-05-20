# 💱 Conversor de Divisas en Java

Crear un programa interactivo en Java que permita al usuario convertir una cantidad de dinero de una moneda a otra utilizando tasas reales obtenidas desde una API de tipo de cambio.

## ⚙️ Instalación

1. Clona el repositorio:

```bash
git clone https://github.com/yorley-v/ConversorDeMoneda.git
```

2. Abre el proyecto con **IntelliJ IDEA** (recomendado).

3. Asegúrate de tener configurado:
   - JDK 17 o superior
   - La dependencia **Gson**
  
## 🚀 Cómo ejecutar

Desde IntelliJ:

- Ejecuta la clase `Main.java` como una aplicación Java.

## 📌 Requisitos

- Java 17+
- Conexión a Internet (para usar la API)

## 🚀 Funcionalidades

- Conversión de monedas en tiempo real
- Menú interactivo con monedas populares
- El usuario selecciona la moneda de origen, destino y la cantidad a convertir
- Lectura de tasas desde una API externa
- Uso de `HttpClient` y `Gson` para análisis JSON

## 🧱 Tecnologías

- Java 17
- IntelliJ IDEA
- Gson (para parsear JSON)
- ExchangeRate-API

## 📦 Estructura del proyecto
```
├── Main.java                 → Interfaz principal con el usuario
conversor/
├── ApiService.java          → Lógica de conexión con la API
├── Conversor.java           → Realiza los cálculos de conversión
├── MenuMonedas.java         → Muestra y gestiona las monedas disponibles
└── Moneda.java              → Clase modelo para representar monedas
```

## 🛠 Requisitos
- Contar con un programa de desarrollo, ya sea Intellij IDEA o Visual Studio Code.
- Tener Java instalado (versión 17 o superior)
- Biblioteca Gson agregada al proyecto
- Una API key de ExchangeRate-API válida

## 🔑 Cómo obtener tu API Key

1. Ve a [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
2. Regístrate gratis
3. Copia tu API Key
4. Sustitúyela en el código donde aparece `TU_API_KEY`

## 🧪 Ejemplo de uso
```
=== CONVERSOR DE DIVISAS ===
    1. Dólar Estadounidense (USD)
    2. Euro (EUR)
    3. Real Brasileño (BRL)
    ...

Selecciona el número de la moneda de ORIGEN: 1
Selecciona el número de la moneda de DESTINO: 2
Introduce la cantidad a convertir: 100

Resultado: 100.00 USD = 91.30 EUR
```

## 🖼️ Capturas del proyecto

### Pantalla de inicio y menú
![Inicio y menu](https://github.com/user-attachments/assets/9fc68c7d-b8eb-42fc-a711-66d96c377919)

### Ejecucuión del programa
![Ejecucion del programa](https://github.com/user-attachments/assets/faf53847-0820-4c34-bb0d-17effbca9e72)

### Resultado de conversión
![Resultado conversion](https://github.com/user-attachments/assets/0ea69161-f448-4a06-84f3-d53d191420fe)

### Finalización del programa
![Finalizacion programa](https://github.com/user-attachments/assets/3163d5fd-c53f-4a2a-a565-1d0f76cfb43a)

## 📌 Notas
Puedes personalizar el menú para incluir solo las monedas que quieras.

El programa es fácilmente ampliable y se puede convertir en una aplicación web en el futuro.

## 🛠 Autor
Este proyecto fue creado como práctica en Java usando API y JSON.
🎓 Ideal para quienes están aprendiendo sobre consumo de servicios web y manejo de datos en consola.

Yorley Vera (yorley-v)

## 📜 Licencia
Este proyecto es de uso educativo y sin fines de lucro. Si lo mejoras, ¡comparte!


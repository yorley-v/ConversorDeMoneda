# 💱 Conversor de Divisas en Java

Un programa de línea de comandos en Java que permite convertir dinero entre diferentes monedas usando tasas de cambio reales proporcionadas por [ExchangeRate-API](https://www.exchangerate-api.com/).

## 🚀 Funcionalidades

- Conversión de monedas en tiempo real
- Menú interactivo con monedas populares
- Lectura de tasas desde una API externa
- Uso de `HttpClient` y `Gson` para análisis JSON

## 🧱 Tecnologías

- Java 17
- IntelliJ IDEA
- Gson (para parsear JSON)
- ExchangeRate-API

## 📦 Estructura del proyecto
├── Main.java → Interfaz principal con el usuario
conversor/
├── ApiService.java → Lógica de conexión con la API
├── Conversor.java → Realiza los cálculos de conversión
├── MenuMonedas.java → Muestra y gestiona las monedas disponibles
└── Moneda.java → Clase modelo para representar monedas


## 🛠 Requisitos
-Contar con un programa 
- Tener Java instalado (versión 11 o superior)
- Biblioteca Gson agregada al proyecto
- Una API key de ExchangeRate-API válida

## 🔑 Cómo obtener tu API Key

1. Ve a [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
2. Regístrate gratis
3. Copia tu API Key
4. Sustitúyela en el código donde aparece `TU_API_KEY`

## 🧪 Ejemplo de uso![image](https://github.com/user-attachments/assets/30472837-b850-43ce-b733-a13a82a992ce)

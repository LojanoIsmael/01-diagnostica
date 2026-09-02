# 🐛 Reporte de Bugs Encontrados y Corregidos (Bloque D)
**Estudiante:** [Ismael Lojano]  
**Paralelo:** [E1 ] | **Fecha:** [2/9/2026]  

---

## 1. 🔍 Bug de HTML Encontrado (D1)
- **¿Qué fallaba?:** <!-- El elemento <header> no estaba cerrado correctamente. Además, el segundo input no tenía el id="nota2" y el botón no tenía un ID -->
- **Causa Raíz:** <!-- La estructura HTML estaba incompleta y JavaScript no podía encontrar correctamente algunos elementos -->
- **Solución Aplicada:** <!-- Se cerró correctamente el <header>, se agregó id="nota2" al segundo input y id="btn-calcular" al botón -->

---

## 2. 🔍 Bug de CSS Encontrado (D2)
- **¿Qué fallaba?:** <!-- Las propiedades display: flexer, align-item y cursor: pointing-hand eran incorrectas -->
- **Causa Raíz:** <!-- Los valores utilizados no existían o estaban mal escritos, por lo que el navegador no los usaba -->
- **Solución Aplicada:** <!-- Se cambiaron por display: flex, align-items: center y cursor: pointer. -->

---

## 3. 🔍 Bug de JavaScript Encontrado (D3)
- **¿Qué fallaba?:** <!-- El cálculo del promedio era incorrecto, el selector de la segunda nota no encontraba el elemento y los valores no se convertían a números -->
- **Causa Raíz:** <!-- Se utilizó una fórmula incorrecta, un ID inexistente (#nota_inexistente) y los valores de los inputs se obtenían como texto -->
- **Solución Aplicada:** <!-- Se corrigió la fórmula a (a + b) / 2, se cambió el selector por #nota2, se utilizó Number() para convertir los valores y se corrigió textContnt por textContent. También se cambió el selector del botón por #btn-calcular -->

---

## 4. ✅ Verificación en Consola del Navegador (D5)
- [ ] Presioné F12 en el navegador.
- [ ] Fui a la pestaña **Console**.
- [ ] Verifiqué que **NO aparezca ningún error en rojo**.

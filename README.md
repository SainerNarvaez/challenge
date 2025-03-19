# Desafío Integrador Final

## ✏️ Etapa 1: Automatización de la página de inicio y navegación por el sitio web  
1. Crea un nuevo proyecto Maven llamado `challenge` con los módulos necesarios.  
2. Investiga el sitio **Sauce Demo** y analiza sus vistas.  
3. Define un modelo para la página de inicio que contenga:  
   - El cuadro de texto para **username** y **password**.  
   - Cuadro de texto.  
   - El botón de **login**.  
   - La lista de usuarios disponibles en la aplicación.  
   - Las contraseñas de los usuarios.  
   - Un método para cargar el usuario y la contraseña, y luego iniciar sesión.  

4. Implementa el modelo para definir y ejecutar las siguientes pruebas:  
   - Intenta iniciar sesión sin ingresar el usuario ni la contraseña.  
     - Evalúa si es necesario agregar una espera.  
     - Verifica el mensaje de error en la vista.  
   - Ingresa un usuario válido de la lista, pero con una contraseña incorrecta e intenta iniciar sesión.  
     - Evalúa si es necesario agregar una espera.  
     - Verifica el mensaje de error en la vista.  
   - Ingresa un usuario válido de la lista junto con la contraseña correcta e inicia sesión.  
     - Evalúa si es necesario agregar una espera.  
     - Verifica la redirección de la vista.  
   - Navega por las diferentes vistas del sitio.  

---

## ✏️ Etapa 2: Automatización login/logout  
En esta etapa, deberás definir las siguientes pruebas:  

1. Iniciar sesión con el primer usuario.  
2. Verificar que el inicio de sesión sea exitoso.  
3. Acceder al menú desplegable y cerrar sesión.  
4. Verificar que el cierre de sesión haya sido exitoso.  
5. Repetir la secuencia para todos los usuarios.  

---

## ✏️ Etapa 3: Automatización de la compra  
En esta etapa, deberás definir las siguientes pruebas:  

1. Iniciar sesión con el primer usuario.  
2. Verificar que el inicio de sesión sea exitoso.  
3. Añadir el primer producto al carrito.  
4. Verificar que el botón haya cambiado de clase.  
5. Modificar el orden de los productos en el carrito.  
6. Añadir los primeros dos productos al carrito.  
7. Navegar a la página del carrito.  
8. Eliminar un producto del carrito.  
9. Verificar que el carrito contenga dos productos.  
10. Realizar la compra.  
11. Cerrar sesión.  
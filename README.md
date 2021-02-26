# Proyecto de Estructura de Datos: Sudoku

### Requerimientos del programa
Para correr el programa se necesita un Entorno de Desarrollo Integrado para Java, como [Neatbeans](https://netbeans.org/images_www/v6/download/community/8.2/) o [Eclipse](https://www.eclipse.org/downloads/).

### Acerca del proyecto
Este programa permite resolver sudokus en el formato 9 x 9.
Sudoku es un juego matemático japonés. Consiste en un recuadro de 81 casillas, estás están divididas en 9 cuadrantes de 3 x 3 casillas cada uno.
#### Reglas del juego
El objetivo del juego es rellenar todas las casillas a partir de las pistas iniciales, teniendo en cuenta las siguientes reglas:
* Las casillas solo se pueden rellenar con numeros del 1 al 9.
* Un número no se puede repetir en la misma columna, en un mismo renglón o en el mismo cuadrante de 3 x 3 casillas.


### Instrucciones 
1. Descargar el programa contenido en este repositorio, puede clonarlo mediante [Git bash](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) 
o bien con descargalo de la página principal del repositorio. Para la última opción debe presionar el botón verde **Code** y descargarlo como ZIP.
2. Abrir el Enterno de Desarrollo Integrado de su preferencia.
3. Seleccionar la opción **Abrir proyecto** y seleccionar el archivo que acaba de descargar, si lo descargó como ZIP debe descomprimirlo primero.
 Al abrir el proyecto se despliegan los siguientes archivos.
  
   ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/Directorio.PNG)

 4. El arcivo que contiene al ejecutable es el último: SudokuI.java. Para correr el programa basta hacer click derecho en el archivo y seleccionar la opción **Run File**.
 
    ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/RunFile.png)
 5. A continuación se desplegará la siguiente interfaz
 
    ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/Interfaz.png)
    
 6. Ingresar en las casillas los números del sudoku a resolver.
 
    Por ejemplo:
 
    ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/SudokuSinResolver.png)
    
7. Al oprimir el botón **Resolver** el programa muestra la primera solución que encontró. 
   Es importante destacar que el programa muestra la primera solución que encontró, esto no quiere decir que sea la única respuesta posible.

   Los números que usted ingresó se muestran en casillas blancas y los de la solución en casillas verdes.
 
    ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/SudokuResuelto.png)
8. El botón **Limpiar** deja listo el programa para resolver un nuevo problema.

 **¡Listo! Como puede ver es muy fácil de utilizar.**
 
 ## Preguntas Frecuentes
 1.  ¿Cómo puedo saber si el sudoku que ingresé tiene algún error?
     El programa indica con un mensaje cuando encuentre un casilla en la que no se cumpla alguna de las reglas.
     Algunos de los errores más comunes se muestran en las siguientes imágenes:
     
     ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/ErrorColumna.png)
     ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/ErrorCuadrante.png)
     ![alt text](https://github.com/IvanaLuBE/Sudoku/blob/master/images/ErrorCaracterInvalido.png)
 2.Al resolver el sudoku por mí mismo encontré otra solución, ¿por qué no es la misma que muestra el programa?
    Nuestro programa muestra la primera respuesta que encontró, pero esto no significa que sea la única ni hay una solución mejor que otra. 
 3. ¿Se guardan los sudokus que resuelva?
    No, lamentablemente no se guarda el historial de juegos resueltos.
 4. ¿Hay algún sudoku que no pueda resolver?
    ¡No! Nuestro programa es muy rápido y eficiente no hay sudoku que pueda ganarle.
 5. ¿Que tanto espacio de memoria necesita el programa para ejecutarse?
    El programa es muy liviano, necesita solo 792 KB.
 6. ¿Hay un número límite de juegos que puedo resolver?
    ¡No! Puedes utilizarlo todas las veces que quieras
 7. ¿Puedo utilizar otro formato de sudoku?
     No, sabemos que existen distintos formatos como Supersudoku de 16×16 casillas o Juuni sudoku de 12 x 12 casillas, pero este programa solo sirve para el formato clásico.
 
    
    

    

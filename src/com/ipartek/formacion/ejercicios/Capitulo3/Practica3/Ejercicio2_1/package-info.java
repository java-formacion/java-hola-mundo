/**
 * En este ejercicio se va a implementar un juego en el que el usuario tenga que adivinar un número
que conoce el programa. El código correspondiente a cada clase que se implemente deberá estar en
un fichero java separado y que tenga el mismo nombre que la clase.
• Clase Juego
◦ Añadirle un método abstracto Juega que no tome parámetros y que tendrán que
implementar las clases derivadas.
◦ La clase Juego ahora pasa a ser una clase abstracta por lo que ya no se podrán crear
instancias de la misma.
◦ La función main ya no estará dentro de esta clase.
• Clase JuegoAdivinaNumero
◦ Deriva de la clase Juego.
◦ Tiene un constructor que toma dos parámetros de tipo entero. El primero es el
número de vidas que, a su vez, se lo pasará al constructor de la clase base. El
segundo parámetro es un número a adivinar entre 0 y 10.
◦ Implementa el método Juega de la clase base:
▪ Llama al método ReiniciaPartida que ha heredado.
▪ Muestra un mensaje al usuario pidiendo que adivine un número entre el 0 y el 10.
▪ Lee un entero del teclado y lo compara con el valor predefinido por el
programador:
• Si es igual, muestra un mensaje Acertaste!! y, tras llamar a
ActualizaRecord, sale del método.
• Si es diferente, llama al método QuitaVida heredado.
• Si el método QuitaVida devuelve true, significa que aún le quedan más
vidas al jugador por lo que se muestra un mensaje indicando si el número a
Curso de Java - Práctica de repaso- 3

adivinar es mayor o menor y se le pide que lo intente de nuevo.
• Si el método QuitaVida devuelve false significa que ya no le quedan más
vidas al jugador, con lo que sale del método Juega.

• Clase Aplicacion
◦ Contiene un método main que, tras crear una instancia de la nueva clase
JuegoAdivinaNumero que se ha creado, llama al método Juega.
 */
/**
 * @author java
 *
 */
package com.ipartek.formacion.ejercicios.Capitulo3.Practica3.Ejercicio2_1;
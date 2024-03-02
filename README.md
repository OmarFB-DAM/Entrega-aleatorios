
# Aleatorios

Un repositorio que contiene la clase Aleatorios.java. Un programa creado para imprimir tantos números aleatorios por pantalla como le inserte el usuario. Por ejemplo, si el usuario introdujese 10, el resultado esperado serían 10 números aleatorios con valores del 0-100. Originalmente la clase contenía un error que no permitía obtener la salida esperada.
Por lo tanto el ejercicio consistía en encontrar dicho error con la herramienta debugger de Eclipse IDE.


## Requisitos para la tarea

- Eclipse IDE.
- Java JDK.
- Eclipse Java Debugger.
- Conocimientos de programación y debugging.


## Capturas del proceso de la tarea

* Ejecutamos el código una vez y observamos el error de ejecución del programa. Como se aprecia en la demo podemos hacer esta ejecución desde el entorno de depuración.

![Ejecución de ejemplo](https://github.com/OmarFB-DAM/Entrega-aleatorios/blob/main/capturasPruebasDebugging/CapturaEjecución.gif)

* Capturando el posible error ejecutando un caso de prueba con pocos números aleatorios, por ejemplo 5. Con un punto de ruptura en la línea ````num_aleat[i] = (int)Math.random()*100;```` dentro del bucle for, en la cuál, se hace una asignación a la variable que mostramos con un contenido erróneo. 

![Captura Debugging](https://github.com/OmarFB-DAM/Entrega-aleatorios/blob/main/capturasPruebasDebugging/CapturaEntornoDebugging.gif)

* Nos fijaremos en la pestaña de variables para detectar el problema de ejecución en esa variable. 

![Captura pestaña variables](https://github.com/OmarFB-DAM/Entrega-aleatorios/blob/main/capturasPruebasDebugging/CapturaPestañaVariables.png)

* Proceso de captura del punto de ruptura siguiendo los pasos de depuración 

![Capturando proceso de depuración](https://github.com/OmarFB-DAM/Entrega-aleatorios/blob/main/capturasPruebasDebugging/CapturandoPasos.gif)

* Hemos visto en el proceso de captura como la variable ````num_aleat```` obtiene valores decimales siempre menores que 1, que al estar precedido por (int) se trunca al número entero 0 y al multiplicar por 100 después se guardará el 0 siempre en cada paso de ejecución. Por lo tanto podemos deducir que la multiplicación no se está realizando correctamente en tiempo de ejecución.   

La corrección sobre esa línea de código sería de la siguiente forma:
````num_aleat[i] = (int)(Math.random()*100);````

* Aquí una depuración con el codigo ya corregido en la que se aprecia correctamente el resultado esperado debido a que se asigna correctamente el valor de la variable.

![Capturando código corregido](https://github.com/OmarFB-DAM/Entrega-aleatorios/blob/main/capturasPruebasDebugging/CapturandoEjercicioCorregido.gif)
## Código arreglado

`````
package aleatorios;

import javax.swing.JOptionPane;


public class Aleatorios {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero + de uno=>"));

        int num_aleat[]=new int[elementos];

        for (int i = 0; i < num_aleat.length; i ++) {

            num_aleat[i] = (int)(Math.random()*100); //el paréntesis es necesario para que primero se multiplique el número aleatorio y luego se guarde como entero

        }

        for (int elem: num_aleat) {

            System.out.println(elem);

        }

    }

}

`````
## Compilación y ejecución

Para ejecutar el código necesitas tener la máquina virtual de java instalada en tu sistema.
Asegúrate de tener Java Development Kit (JDK) en la última versión disponible para no sufrir problemas de compatibilidad. 

### Primero compilación
Utilizando el compilador de java:
```bash
  javac Aleatorios.java
```
Se generarán los archivos .class que permiten la ejecucion del programa Aleatorios.

### Ejecución
Una vez compilado y habiendose generado los .class simplemente introduciendo esta línea de comando se ejecuta.
```bash
  java Aleatorios
```

* #### Para esta tarea sin embargo, utilizamos el entorno Eclipse tanto para desarrollo como para depuración del código y para la compilación y ejecución del mismo, como se ha mostrado en este mismo documento con anterioridad. Puedes hacer lo mismo importando este proyecto a tu IDE de preferencia. En nuestro caso Eclipse IDE.
## Autor

- [@OmarFB-DAM](https://github.com/OmarFB-DAM)


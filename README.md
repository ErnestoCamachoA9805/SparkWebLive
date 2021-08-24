># SparkWebLive
>
>> Autor: Ernesto Camacho Arroyave
>>
>> Fecha: 24/08/2021
>>
> ## Diseño 
>> El proyecto tiene 2 funciones, la primera es solicitar informacion al framework solicitado, mostrando informacion en un grafico. La segunda funcion es actuar como un cache para la informacion ya solicitada por multiples usuarios.
>>
>> El desarrollo del servicio principal de Spark fue con interfaces, por lo que en caso de que se quiera dar una solucion nueva, o trabajar un nuevo framework para solicitar informacion solo tiene que implementar la interfaz.
>>
>> Link en Heroku: https://sparkliveone.herokuapp.com/
>>
>> ![](https://github.com/ErnestoCamachoA9805/SparkWebLive/blob/main/Recursos/images/React-Taller1.png)
>>
> ## Instrucciones de uso
>> El proyecto tiene un comboBox con las opciones de informacion que soporta, y un cuadro de texto para que el usuario ponga el acronimo de la empresa que le interesa, para mas informacion en el acronimo de la empresa leer Documentacion.
>> 
>> En la grafica se muestran 4 valores, el usuario puede seleccionar que valores ver.
> ## Documentacion
>> Existen 2 documentos importantes, el javadoc del proyecto y un archivo con las opciones de busqueda de empresa, ambos estan en la carpeta de recursos 
>>
> ## Descargar el proyecto
>> Para Correr el proyecto de manera local, clone el repositorio y en la carpeta principal utilice el comando:
>>> - mvn exec:java -D"exec.mainClass"="edu.escuelaing.SparkWebLive.SparkWebApp" 
>>
> ## Ideas Para Extender
>> - Mejorar el GUI
>> - Implementar otra clase con las interfaces (hay  2 interfaces)
>> - Dar mas Opciones de Cache 
>>
> ## Bibliografia 
>> - busqueda en el Api de jav 8
>> - https://www.npmjs.com/package/react-chartjs-2
>> - Trabajo en equipo con Sebastian Herrera 

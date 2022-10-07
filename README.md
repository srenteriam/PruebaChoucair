# pruebaTecnicaChoucair
Prueba tecnica automatizador para Choucair.

Proyecto con utilizacion de patron de diseño screenplay con cucumber y maven, para probar la página web "https://serenity.is/demo/"

La automatización fue construida con las siguientes herramientas:
* Java 17
* Maven 3.8.6

Para clonar el repositorio:
git clone https://github.com/srenteriam/PruebaChoucair.git

Compilar desde consola:
Punto 1.

gradle clean test -Dcucumber.filter.tags="@Prueba1" aggregate

Punto 2. 

gradle clean test -Dcucumber.filter.tags="@Prueba2" aggregate

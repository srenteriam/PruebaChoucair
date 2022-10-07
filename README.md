# pruebaTecnicaChoucair
Prueba tecnica automatizador para Choucair.

Proyecto con utilizacion de patron de diseño screenplay con cucumber y gradle, para probar la página web "https://serenity.is/demo/"

La automatización fue construida con las siguientes herramientas:
* Java 17
* gradle 7.5.1

Para clonar el repositorio:
git clone https://github.com/srenteriam/PruebaChoucair.git

La compilación fue dividida por tags de la siguiente manera,
Punto 1.

gradle clean test -Dcucumber.filter.tags="@Prueba1" aggregate

Punto 2. 

gradle clean test -Dcucumber.filter.tags="@Prueba2" aggregate

Compilacion completa:

gradle clean test aggregate

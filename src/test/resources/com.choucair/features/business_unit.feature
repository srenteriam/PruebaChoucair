#Autor: srenteriamontoya@gmail.com
@Prueba1
Feature: Añadir nueva unidad de negocio
  Yo como automatizador de pruebas
  Necesito añadir una nueva unidad de negocio
  Para validar el funcionamiento del sistema


  Scenario: Agregar nueva unidad de negocio
    Given "Actor" Desea navegar a la pagina "https://serenity.is/demo/"
    And Se logea con usuario "admin" y password "serenity"
    When Crea una unidad de negocio con el nombre "Empleados"
    Then Valida que la unidad "Empleados" exista en la lista
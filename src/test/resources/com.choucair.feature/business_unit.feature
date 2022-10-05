#Autor: srenteriamontoya@gmail.com
Feature: Añadir nueva unidad de negocio
  Yo como automatizador de pruebas
  Necesito añadir una nueva unidad de negocio
  Para validar el funcionamiento del sistema

  @PruebaA
  Scenario: Agregar nueva unidad de negocio
    Given "Actor" Desea navegar a la pagina "https://serenity.is/demo/"
    And Se logea con usuario "admin" y password "serenity"
#Autor: srenteriamontoya@gmail.com
@Prueba2
Feature: Añadir nueva reunion
  Yo como automatizador de pruebas
  Necesito añadir una nueva reunion
  Para validar el funcionamiento del sistema

  Background: Iniciar Sesion
    Given "Actor" Desea navegar a la pagina "https://serenity.is/demo/"
    And Se logea con usuario "admin" y password "serenity"

  Scenario: Crear una nueva reunion
      When Crea una reunion con los datos
        | meeting_name   | Reunion Daily             |
        | meeting_type   | General                   |
        | meeting_number | 6754                      |
        | start_date     | 10/20/2022                |
        | time_start     | 09:00                     |
        | end_date       | 10/20/2022                |
        | time_end       | 09:30                     |
        | location       | On Site                   |
        | unit           | Empleados                 |
        | organized by   | Jason Green               |
        | reporter       | Nicole Coleman            |
      Then Valida que la reunión "Reunion Daily TAE" se haya creado correctamente

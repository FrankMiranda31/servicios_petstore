
  Feature: Gestión de ordenes de la tienda




    @creacion_orden
    Scenario Outline: Crear una nueva orden
      Given dado que estoy en la pagina
      When creo una orden con id<id>, petId<petId>, quantity<quantity>
      Then el código de estado de la respuesta debe ser <codigo>
      And la respuesta debe contener el id<id>, petId<petId>, quantity<quantity>
      Examples:
        | id  | petId | quantity | codigo |
        | 201 | 2     | 3        | 200    |
        | 202 | 3     | 1        | 200    |
        | 203 | 3     | 1        | 200    |
        | 204 | 3     | 1        | 200    |

    @consulta_order
    Scenario Outline: consulta la nueva orden
      Given dado que ingreso en la pagina
      When consulto la orden con ID <id>
      Then valido que el codigo de respuesta sea <codigo>
      And la respuesta debe contener el id<id>
      Examples:
        | id  | codigo |
        | 201 | 200    |
        | 202 | 200    |
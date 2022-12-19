Feature: Plan de prueba para sitio web
  Background:
    Given me encuentro en sitio web
    @google
    Scenario: Verificar funcionamiento de sección "ver todas"
      When al llegar a seccion casas y departamentos en venta
      And clickear opcion ver todas
      Then aparece listado de propiedades en venta
      And puedo ver todas las propiedades seleccionadas
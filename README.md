# Rocium-Framework
##### Framework de automatización basado en JVM
### Tecnologías:
* [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/)
* [Healenium](https://healenium.io/)
* [Cucumber](https://cucumber.io/)
* [JUnit 5](https://junit.org/junit5/)
* [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)
* [Docker](https://www.docker.com/)
* [Extent Report](https://www.extentreports.com/)
* [Gradle](https://gradle.org/)

  
### Pre-requisitos:
* JDK 11 
* Docker
* Gradle

### Primeros Pasos:
Alojar repositorio en carpeta deseada:  
`git clone https://github.com/dbustamanter/Rocium-Framework.git`  
  
Inicializar contenedores docker desde carpeta /Rocium_Framework/infra/  
`docker-compose up -d`

### Quick-Start:
Desde carpeta /Rocium_Framework ejecutar:  
`gradle test`

### Estructura de Proyecto:
#### Patron de diseño POM:  
:file_folder: pages&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:arrow_forward: Carpeta que contiene clases asociadas a páginas.  
:file_folder: stepDefinitions&nbsp;&nbsp;:arrow_forward: Carpeta que contiene clases relativas a steps de documento Gherkin.  
:open_file_folder: configFramework:  
* :file_folder: driverConfig&nbsp;:arrow_forward: Configuración de instancia driver para levantar navegador.
* :file_folder: testRunner&nbsp;&nbsp;&nbsp;:arrow_forward: Configuración de arranque para plan de pruebas.
* :file_folder: util&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:arrow_forward: Carpeta que contiene clase con métodos de utilidad, modificable a voluntad.

#### Utilidades de proyecto:
:page_facing_up: cucumber.properties: Permite modificar propiedades de plugin cucumber para ejecución de pruebas.  
:page_facing_up: extent.properties: Permite configuración de parámetros relacionados  a reportería.  
:page_facing_up: healenium.properties: Configuración relativa a servicio Healenium.  

#### Reportes: 
:bar_chart: results: Carpeta relativa a resultados asociados a ejecución de casos de prueba.



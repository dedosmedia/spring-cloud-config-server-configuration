# spring-cloud-config-server-configuration
Repositorio con configuración para los microservicios clientes del Config Server


Prácticas con el patrón de diseño ConfigServer.


**CONFIG SERVER:  SERVER**

**1.** Agregar dependencias:  
- Spring Web  (spring-boot-starter-web)  
- Config Server (spring-cloud-config-server)

**2.** Anotar la clase principal con **@EnableConfigServer**

**3.** Configurar el servidor para tomar los valores de Git.  
- **spring.cloud.config.server.git.uri**=file:// o https://

----

**CONFIG SERVER: CLIENT**

**1.** Agregar dependencias:  
- Spring Web  (spring-boot-starter-web)  
- Config Client (spring-cloud-starter-config)

**2.** Configurar el cliente para importar la configuración:  
**spring.config.import**= FILE or HTTP  (Config Server)
**spring.application.name**= Nombre como se llama la configuración en git

**3.** Leer los valores con la anotación de variable  
**@Value(${nombre_variable:default})**

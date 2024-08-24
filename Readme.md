# Laboratorio 2

## Diego Cardenas

## Sebastian Cardona

## 1 ¿Cual es su mayor utilidad?

Aparte de ser una herramienta de gestion de proyectos en Java, la mayor utilidad en Maven radica en la capacidad de gestionar dependencias del proyecto y la creación de código

## 2 Fases de Maven

1. <strong>Validate:</strong> Verifica que el proyecto esté bien y completo, es decir, que toda la información necesaria esté disponible

2. <strong>Compile:</strong> Compila el código fuente del proyecto

3. <strong>Test:</strong> Ejecuta las pruebas unitarias del código compilado

4. <strong>Package:</strong> Empaqueta el código compilado en un ejecutable como JAR

5. <strong>Verify:</strong> Realiza verificaciones adicionales para verificar que todo funciona como debe y que se cumplan con los criterios de calidad

6. <strong>Install:</strong> Instala el paquete en el repositorio local para que pueda ser utilizado como dependencia por otros proyectos.

7. <strong>Deploy:</strong> Copia el paquete final al repositorio local para compartirlo con otros desarrolladores

## 3 Ciclos de vida la construcción

Son una secuencia de fases que define el proceso completo de construcción del proyecto

1. <strong>Default:</strong> Gestional la construcción del proyecto y las fases asociadas como: <strong>compile</strong>, <strong>test</strong>, <strong>package</strong>, <strong>install</strong>, <strong>deploy</strong>

2. <strong>Clean:</strong> Gestional la limpieza del directorio y los archivos generados anteriormente, sus fases son: <strong>pre-clean</strong>, <strong>clean</strong>, <strong>post-clean</strong>

3. <strong>Site:</strong> Genera la documentación del código, sus fases son: <strong>pre-site</strong>, <strong>site</strong>, <strong>post-site</strong>

## 4 Plugins en Maven

Los plugins en Maven son componentes que realizan tareas específicas durante el proceso de construcción. Algunos ejemplos incluyen:

1. <strong>maven-compiler-plugin:</strong> Compila el código

2. <strong>maven-jar-plugin:</strong> Crea el archivo JAR

3. <strong>maven-site-plugin:</strong> Genera documentación del proyecto

4. <strong>maven-surefire-plugin:</strong> Ejecuta pruebas unitarias

## 5 Repositorio Central de Maven

Repositorio de bibliotecas que Maven usa para descargar dependencias

Permite a los desarrolladores declarar las dependencias en el archivo pom.xml, y Maven se encarga de descargar automáticamente estos artefactos y sus dependencias transitivas desde el repositorio central


## 6 Objetivo del parametro Package

El comando mvn package es para compilar y empaquetar un proyecto Maven.
Es un objetivo del ciclo de vida de construcción y cuando lo ejecutas, automáticamente ejecuta todas las fases del ciclo anterior

## 7 Ejecutar un maven desde la linea de comandos

Se usa el plugin Maven Exec Plugin. Este plugin permite ejecutar clases Java desde Maven, lo que es útil para ejecutar aplicaciones o pruebas específicas.


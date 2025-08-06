Proyecto ZEG: Registro de Tiempo Efectivo de Trabajo

1. Resumen Ejecutivo

**Descripción del Proyecto:**  
El presente proyecto tiene como objetivo el desarrollo de un sistema ligero y funcional para registrar el tiempo efectivo de trabajo en la planta de Protectores Auditivos ZEG, empresa dedicada a la fabricación artesanal de tapones auditivos.

**Problema Identificado:**  
Actualmente, no existe un sistema confiable que registre las actividades diarias de los trabajadores. Esto genera estimaciones poco precisas para la cotización, planeación de producción y falta de indicadores reales sobre la productividad.

**Solución Propuesta:**  
Se desarrolla un sistema web con una interfaz tipo kiosko para que los trabajadores registren sus actividades (inicio, pausa, fin). Los datos se almacenan en una base de datos y se procesan para generar reportes e indicadores automáticos.

**Arquitectura del Sistema:**  
- Frontend en JSP  
- Base de datos MySQL  
- Servidor Apache Tomcat 9  
- GitHub para control de versiones  


## 2. Requerimientos

- **Servidores:** Apache Tomcat 9, MySQL o MariaDB.  
- **Paquetes adicionales:** GSON, JDBC Connector MySQL, JSTL.  
- **Versiones necesarias:** Java JDK 8, NetBeans 12.2 o superior, Git.  


## 3. Instalación

**Instalación del ambiente de desarrollo:**  
1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/ZATOMARCO/TALLER_BASADO_HERRAMIENTAS_TECNOLOGICAS.git
   ```
2. Importar el proyecto en NetBeans.  
3. Configurar el servidor Apache Tomcat.  
4. Importar la base de datos desde la carpeta `/sql`.

**Pruebas manuales:**  
- Iniciar Tomcat desde NetBeans.  
- Probar login y flujo del kiosko.  
- Verificar reportes generados.  

**Implementación en producción:**  
- Configurar archivo `context.xml`.  
- Desplegar `.war` en Tomcat local


## 4. Configuración

- **Archivos del producto:** `web.xml`, `context.xml`, `config.properties` (opcional).  
- **Configuración de requerimientos:**  
  - Base de datos activa  
  - Crear usuarios y tareas  
  - Validaciones en formularios  


## 5. Uso del Sistema

**Usuario Final:**  
- Ingresar desde pantalla kiosko  
- Seleccionar tarea y presionar Iniciar/Pausa/Fin  

**Administrador:**  
- Ingresar al panel  
- Agregar/editar usuarios y tareas  
- Consultar y exportar reportes


## 6. Contribución

**Guía de contribución:**  
1. Clonar repositorio  
2. Crear rama:  
   ```bash
   git checkout -b mejora-mi-funcion
   ```
3. Hacer commit y push:  
   ```bash
   git commit -m "Mejora funcionalidad kiosko"
   git push origin mejora-mi-funcion
   ```
4. Crear Pull Request

**Estándares de desarrollo:**  
- Usar arquitectura MVC  
- Validar entradas  
- Comentar funciones nuevas  

## 7. Roadmap (Futuras Mejoras)

- Registro por pedido  
- Exportación CSV/PDF  
- Reportes gráficos semanales/mensuales  
- Control de inventario  
- Panel administrativo en tiempo real  
- Integración con APIs de cotización  

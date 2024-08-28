# zeus_api_empleado
API en JAVA que permite realizar operaciones CRUD sobre una entidad "Empleado" en MySQL

# Herramientas
Java 17
Spring Boot
JPA
Spring Web
MySQL

# Ejemplo de Request Body para Endpoints

# Endpoint CREAR: /api/zeus-demo/empleado/create
{
    "nombre": "NOMBRE EMPLEADO",
    "puesto": "BACKEND DEVELOPER",
    "salario": 100.15,
    "fechaContratacion": "01/08/2024"
}

# Endpoint MODIFICAR: /api/zeus-demo/empleado/update
{
    "id": 6,
    "nombre": "NOMBRE EMPLEADO",
    "puesto": "BACKEND DEVELOPER",
    "salario": 100.15,
    "fechaContratacion": "01/08/2024"
}

# Endpoint ELIMINAR: /api/zeus-demo/empleado/delete/{id}
Ejemplo: /api/zeus-demo/empleado/delete/12

# Endpoint BUSCAR EMPLEADO: /api/zeus-demo/empleado/{id}
Ejemplo: /api/zeus-demo/empleado/12

# Endpoint BUSCAR LISTA EMPLEADOS: /api/zeus-demo/empleado/list


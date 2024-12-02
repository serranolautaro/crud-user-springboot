<h1>CRUD de Usuarios - RESTful API con Spring Boot</h1>
    <p>Este proyecto es un ejemplo de una <strong>API RESTful</strong> para la gestión de usuarios. La API permite realizar operaciones básicas de CRUD (Crear, Leer, Actualizar, Eliminar) utilizando <strong>Spring Boot</strong>, <strong>JPA</strong> y una base de datos relacional.</p>

<h2>Características</h2>
    <ul>
        <li><strong>Tecnologías utilizadas:</strong>
            <ul>
                <li>Spring Boot</li>
                <li>Spring Data JPA</li>
                <li>Base de datos relacional (ejemplo: MySQL)</li>
            </ul>
        </li>
        <li><strong>Funcionalidades:</strong>
            <ul>
                <li>Crear un usuario</li>
                <li>Obtener todos los usuarios</li>
                <li>Consultar un usuario por su ID</li>
                <li>Actualizar un usuario por su ID</li>
                <li>Eliminar un usuario por su ID</li>
            </ul>
        </li>
    </ul>

<h2>Endpoints de la API</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Método</th>
                <th>Endpoint</th>
                <th>Descripción</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>GET</td>
                <td><code>/crudusuario</code></td>
                <td>Obtiene todos los usuarios.</td>
            </tr>
            <tr>
                <td>POST</td>
                <td><code>/crudusuario</code></td>
                <td>Crea un nuevo usuario.</td>
            </tr>
            <tr>
                <td>GET</td>
                <td><code>/crudusuario/{id}</code></td>
                <td>Obtiene un usuario por su ID.</td>
            </tr>
            <tr>
                <td>PUT</td>
                <td><code>/crudusuario/{id}</code></td>
                <td>Actualiza un usuario por su ID.</td>
            </tr>
            <tr>
                <td>DELETE</td>
                <td><code>/crudusuario/{id}</code></td>
                <td>Elimina un usuario por su ID.</td>
            </tr>
        </tbody>
    </table>

<h2>Requisitos</h2>
    <ul>
        <li>Java 17 o superior</li>
        <li>IDE como IntelliJ IDEA o Eclipse</li>
        <li>Maven para gestionar las dependencias</li>
        <li>Base de datos relacional configurada (ejemplo: MySQL)</li>
    </ul>

<h2>Instrucciones de Uso</h2>
    <ol>
        <li>Clona este repositorio: <code>git clone https://github.com/tuusuario/nombre-repositorio.git</code></li>
        <li>Importa el proyecto en tu IDE.</li>
        <li>Configura la conexión a la base de datos en el archivo <code>application.properties</code>.</li>
        <li>Ejecuta la aplicación con el comando <code>mvn spring-boot:run</code> o desde tu IDE.</li>
        <li>Prueba los endpoints con herramientas como <strong>Postman</strong>.</li>
    </ol>

<h2>Ejemplo de Solicitud</h2>
    <h3>POST: Crear un usuario</h3>
    <pre>
        URL: http://localhost:8080/crudusuario
        Body (JSON):
        {
            "nombre": "Lionel",
            "apellido": "Messi",
            "email": "messi@gmail.com"
        }
    </pre>

</body>
</html>

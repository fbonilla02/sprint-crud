

## Ejecutar el docker compose

Esto lo hacemos para crear la db en un contenedor



```
docker compose up --build 
```

ya con esto ejecutamos la aplicacion en eclipse o intellij idea 

una vez ejecutado el proyecto java puedes ir a: http://localhost:8080/clients y aqui puedes crear/eliminar/editar/leer clientes 

si quieres añadir datos te conectas a cualquier gestos de base de datos mysql (dataflare, dbaver)

```
INSERT INTO client (
    id, first_name, last_name, email, phone, address, status, created_at
) VALUES
(1, 'Laura', 'Gómez', 'laura.gomez@example.com', '3101234567', 'Calle 10 #12-34', 'ACTIVE', '2024-11-10'),
(2, 'Carlos', 'Martínez', 'carlos.martinez@example.com', '3159876543', 'Carrera 7 #45-67', 'ACTIVE', '2024-11-11'),
(3, 'Ana', 'Ruiz', 'ana.ruiz@example.com', '3201239876', 'Calle 20 #30-12', 'INACTIVE', '2024-11-12'),
(4, 'David', 'López', 'david.lopez@example.com', '3004567890', 'Carrera 15 #18-90', 'ACTIVE', '2024-11-13'),
(5, 'Marta', 'Torres', 'marta.torres@example.com', '3112233445', 'Calle 5 #6-78', 'ACTIVE', '2024-11-14'),
(6, 'Jorge', 'Castro', 'jorge.castro@example.com', '3167788990', 'Carrera 40 #20-30', 'SUSPENDED', '2024-11-15'),
(7, 'Paula', 'Moreno', 'paula.moreno@example.com', '3123344556', 'Calle 25 #9-10', 'ACTIVE', '2024-11-16'),
(8, 'Luis', 'Ramírez', 'luis.ramirez@example.com', '3199988776', 'Carrera 33 #70-90', 'INACTIVE', '2024-11-17'),
(9, 'Camila', 'Vega', 'camila.vega@example.com', '3001122334', 'Calle 8 #13-22', 'ACTIVE', '2024-11-18'),
(10, 'Andrés', 'Córdoba', 'andres.cordoba@example.com', '3175566778', 'Carrera 10 #50-60', 'SUSPENDED', '2024-11-19');

```

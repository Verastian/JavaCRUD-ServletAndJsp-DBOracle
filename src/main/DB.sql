--TABLA CATEGOR?A 
DROP TABLE categoria;
CREATE TABLE categoria(
id_categoria int primary key,
nombre_categoria varchar(50)
);
CREATE SEQUENCE SQ_CATEGORY
 START WITH     1
 INCREMENT BY   1;
-- TABLA PRODUCTO
DROP TABLE producto;
CREATE TABLE producto( 
id_producto int primary key,
nombre_producto varchar(75),
precio_producto int,
descripcion_producto varchar(200),
id_categoria int,
foreign key (id_categoria) references categoria(id_categoria)
);
CREATE SEQUENCE SQ_PRODUCT
 START WITH     1
 INCREMENT BY   1;

INSERT INTO categorias(id_categoria, nombre_categoria)
VALUES (SQ_CATEGORY.NEXTVAL, 'DETERGENTE LIQUIDO');

select * from categorias;

INSERT INTO categorias(id_categoria, nombre_categoria)
VALUES (SQ_CATEGORY.NEXTVAL, 'DETERGENTE POLVO');


select * from productos;

INSERT INTO productos(id_producto,nombre_producto, precio, descripcion, id_categoria)
VALUES (SQ_PRODUCT.NEXTVAL,'Omo', 3500, 'Quita manchas', 22);

INSERT INTO productos(id_producto,nombre_producto, precio, descripcion, id_categoria)
VALUES (SQ_PRODUCT.NEXTVAL,'Ariel', 4400, 'Quita manchas', 21);


CREATE TABLE login( 
id_usuario int primary key,
usuario VARCHAR2(75),
password VARCHAR2(100)
);
CREATE SEQUENCE SQ_USER
 START WITH     1
 INCREMENT BY   1;

INSERT INTO login(id_usuario, usuario,password)
VALUES (SQ_USER.NEXTVAL, 'correo1@correo.cl','123123');
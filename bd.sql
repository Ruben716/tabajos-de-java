create sequence SQ_documento_identidad 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_documento_identidad
BEFORE INSERT ON documento_identidad 
FOR EACH ROW
BEGIN
    SELECT SQ_documento_identidad.NEXTVAL INTO :NEW.ID_documento_identidad FROM DUAL ;
END ;



----------------------creando un triger 


create sequence SQ_datos_tarjeta 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_datos_tarjeta
BEFORE INSERT ON datos_tarjeta 
FOR EACH ROW
BEGIN
    SELECT SQ_datos_tarjeta.NEXTVAL INTO :NEW.ID_datos_tarjeta FROM DUAL ;
END ;


----------------------creando un triger 


create sequence SQ_genero 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_genero
BEFORE INSERT ON genero 
FOR EACH ROW
BEGIN
    SELECT SQ_genero.NEXTVAL INTO :NEW.ID_genero FROM DUAL ;
END ;


----------------------creando un triger 


create sequence SQ_datos_documento 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_datos_documento
BEFORE INSERT ON datos_documento 
FOR EACH ROW
BEGIN
    SELECT SQ_datos_documento.NEXTVAL INTO :NEW.ID_datos_documento FROM DUAL ;
END ;







----------------------creando un triger 




create sequence SQ_estado_civil 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_estado_civil
BEFORE INSERT ON estado_civil 
FOR EACH ROW
BEGIN
    SELECT SQ_estado_civil.NEXTVAL INTO :NEW.ID_estado_civil FROM DUAL ;
END ;



----------------------creando un triger 




create sequence SQ_reservacion 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_reservacion
BEFORE INSERT ON reservacion 
FOR EACH ROW
BEGIN
    SELECT SQ_reservacion.NEXTVAL INTO :NEW.ID_reservacion FROM DUAL ;
END ;




----------------------creando un triger 




create sequence SQ_pago 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_pago
BEFORE INSERT ON pago 
FOR EACH ROW
BEGIN
    SELECT SQ_pago.NEXTVAL INTO :NEW.ID_pago FROM DUAL ;
END ;




----------------------creando un triger 




create sequence SQ_metodo_pago 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_metodo_pago
BEFORE INSERT ON metodo_pago 
FOR EACH ROW
BEGIN
    SELECT SQ_metodo_pago.NEXTVAL INTO :NEW.ID_metodo_pago FROM DUAL ;
END ;





----------------------creando un triger 




create sequence SQ_reservacion_detalle 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_reservacion_detalle
BEFORE INSERT ON reservacion_detalle 
FOR EACH ROW
BEGIN
    SELECT SQ_reservacion_detalle.NEXTVAL INTO :NEW.ID_reservacion_detalle FROM DUAL ;
END ;




----------------------creando un triger 




create sequence SQ_descuento 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_descuento
BEFORE INSERT ON descuento 
FOR EACH ROW
BEGIN
    SELECT SQ_descuento.NEXTVAL INTO :NEW.ID_descuento FROM DUAL ;
END ;





----------------------creando un triger 




create sequence SQ_reservacion_detalle_servicio
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_reservacion_detalle_servicio
BEFORE INSERT ON reservacion_detalle_servicio 
FOR EACH ROW
BEGIN
    SELECT SQ_reservacion_detalle_servicio.NEXTVAL INTO :NEW.ID_reservacion_detalle_servicio FROM DUAL ;
END ;



----------------------creando un triger 




create sequence SQ_servicio 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_servicio
BEFORE INSERT ON servicio 
FOR EACH ROW
BEGIN
    SELECT SQ_servicio.NEXTVAL INTO :NEW.ID_servicio FROM DUAL ;
END ;



----------------------creando un triger 




create sequence SQ_habitacion 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_habitacion
BEFORE INSERT ON habitacion 
FOR EACH ROW
BEGIN
    SELECT SQ_habitacion.NEXTVAL INTO :NEW.ID_habitacion FROM DUAL ;
END ;




----------------------creando un triger 

---------------------------------

create sequence SQ_tipo_habitacion 
MINVALUE 1
START WITH 1
INCREMENT BY 1; 


CREATE TRIGGER TRG_tipo_habitacion
BEFORE INSERT ON tipo_habitacion 
FOR EACH ROW
BEGIN
    SELECT SQ_tipo_habitacion.NEXTVAL INTO :NEW.ID_tipo_habitacion FROM DUAL ;
END ;
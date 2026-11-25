-- SALMON DEL SUR - Caso académico ficticio.
-- Ejecutar en phpMyAdmin, HeidiSQL o cliente MySQL con Laragon/XAMPP.
CREATE DATABASE IF NOT EXISTS salmon_del_sur CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE salmon_del_sur;

CREATE TABLE IF NOT EXISTS lotes_salmon (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(20) NOT NULL UNIQUE,
    centro VARCHAR(100) NOT NULL,
    kilos INT NOT NULL,
    tipo ENUM('FRESCO','CONGELADO') NOT NULL,
    CHECK (kilos > 0)
);

-- La tabla inicia sin registros: crear lotes desde la aplicación.
SELECT * FROM lotes_salmon;

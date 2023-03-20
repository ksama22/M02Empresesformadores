-- Agregar algunas empresas de prueba
INSERT INTO empresa (cif, nom, adreca) VALUES
  ('A12345678', 'Empresa 1', 'C/ Avinguda, 123'),
  ('B87654321', 'Empresa 2', 'C/ Gran Via, 456'),
  ('C24681012', 'Empresa 3', 'C/ Diagonal, 789');

-- Agregar algunos alumnos de prueba
INSERT INTO alumne (nom, cognoms, cicle, modalitat, estat, empresa_cif) VALUES
  ('Alumne 1', 'Cognoms 1', 'DAM', 'FCT', 'ENPROCES', 'A12345678'),
  ('Alumne 2', 'Cognoms 2', 'DAW', 'DUAL', 'ACABADES', 'B87654321'),
  ('Alumne 3', 'Cognoms 3', 'ASIX', 'FCT', 'ACABADES', 'C24681012');
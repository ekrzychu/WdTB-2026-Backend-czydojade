-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: konta dwuosobowego zespołu CzyDojade.
insert into user_account (email, display_name, role, created_at) values
    ('s710786@student.wroclaw.merito.pl', 'Krzysztof Jaroch', 'USER', current_timestamp),
    ('wrx75984@student.wroclaw.merito.pl', 'Karol Kuźniak', 'USER', current_timestamp),
    ('trzecia_osoba@student.wroclaw.merito.pl', 'Trzecia Osoba', 'USER', current_timestamp);


-- ===== LAB 02 · vehicle =====

INSERT INTO vehicle (fleet_number, transport_mode, capacity, active)
VALUES
    ('2201', 'TRAM', 200, true),
    ('2202', 'TRAM', 180, true),
    ('8101', 'BUS', 100, true);


-- ===== LAB 02 · line =====

INSERT INTO line (number, description, transport_mode, active)
VALUES
    ('7', 'Linia tramwajowa 7', 'TRAM', true),
    ('10', 'Linia tramwajowa 10', 'TRAM', true),
    ('145', 'Linia autobusowa 145', 'BUS', true);


-- ===== LAB 02 · stop =====

INSERT INTO stop (code, name, accessible, latitude, longitude)
VALUES
    ('ST001', 'Rynek', true, 51.110000, 17.030000),
    ('ST002', 'Plac Grunwaldzki', true, 51.111000, 17.062000),
    ('ST003', 'Dworzec Główny', true, 51.098000, 17.037000);

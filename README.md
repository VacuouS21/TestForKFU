# TestForKFU
Сервер на Java с 5-ю таблицами и CRUD запросами
Технологии Java, PostgreSQL, Hibirnate , Spring, maven
Запросы:
Для таблицы Airport_info:
http://localhost:8083/api/airport                (GET,POST)
http://localhost:8083/api/airport/{id}           (GET,DELETE,PUT)

Для таблицы Airplane:
http://localhost:8083/api/airplane                (GET,POST)
http://localhost:8083/api/airplane/{id}           (GET,DELETE,PUT)
Для таблицы tickets_information:
http://localhost:8083/api/tickets                (GET,POST)
http://localhost:8083/api/tickets/{id}           (GET,DELETE,PUT)
для таблицы users:
http://localhost:8083/api/user              (GET,POST)
http://localhost:8083/api/user/{id}           (GET,DELETE,PUT)
Для таблицы privilege:
http://localhost:8083/api/privilege                (GET,POST)
http://localhost:8083/api/privilege/{id}           (GET,DELETE,PUT)

Схема базы данных:![image](https://user-images.githubusercontent.com/93660848/202805447-e4e64ae1-3a2a-4ded-a55a-967d9f7b192a.png)
Инструкция по запуску. 
Запустить сначала контейнер с postgresql в docker-compose.yml
Запустить сервер.

# TestForKFU
Сервер на Java с 5-ю таблицами и CRUD запросами  <br />
Технологии Java, PostgreSQL, Hibirnate , Spring, maven  <br />
Запросы: <br />
Для таблицы Airport_info: <br />
http://localhost:8083/api/airport                (GET,POST) <br />
http://localhost:8083/api/airport/{id}           (GET,DELETE,PUT) <br />

Для таблицы Airplane: <br />
http://localhost:8083/api/airplane                (GET,POST) <br />
http://localhost:8083/api/airplane/{id}           (GET,DELETE,PUT) <br />
Для таблицы tickets_information: <br />
http://localhost:8083/api/tickets                (GET,POST) <br />
http://localhost:8083/api/tickets/{id}           (GET,DELETE,PUT) <br />
для таблицы users: <br />
http://localhost:8083/api/user              (GET,POST) <br />
http://localhost:8083/api/user/{id}           (GET,DELETE,PUT) <br />
Для таблицы privilege: <br />
http://localhost:8083/api/privilege                (GET,POST) <br />
http://localhost:8083/api/privilege/{id}           (GET,DELETE,PUT) <br />

Схема базы данных:![image](https://user-images.githubusercontent.com/93660848/202805447-e4e64ae1-3a2a-4ded-a55a-967d9f7b192a.png)
Инструкция по запуску.  <br />
Запустить сначала контейнер с postgresql в docker-compose.yml <br />
Запустить сервер. <br />

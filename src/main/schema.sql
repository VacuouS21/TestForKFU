CREATE TABLE "airplane_info"(
                                "id" INTEGER NOT NULL,
                                "name" VARCHAR(255) NOT NULL,
                                "seats_count" INTEGER NOT NULL
);
ALTER TABLE
    "airplane_info" ADD PRIMARY KEY("id");
CREATE TABLE "tickets_information"(
                                      "id" INTEGER NOT NULL,
                                      "airplane" INTEGER NOT NULL,
                                      "data_flight" DATE NOT NULL,
                                      "seat_number" INTEGER NOT NULL,
                                      "from_air" INTEGER NOT NULL,
                                      "where_air" INTEGER NOT NULL,
                                      "price" INTEGER NOT NULL,
                                      "user" INTEGER NOT NULL
);
ALTER TABLE
    "tickets_information" ADD PRIMARY KEY("id");
CREATE TABLE "user"(
                       "id" INTEGER NOT NULL,
                       "fio" VARCHAR(255) NOT NULL,
                       "user_login" VARCHAR(255) NOT NULL,
                       "user_password" VARCHAR(255) NOT NULL,
                       "privilege_id" INTEGER NOT NULL
);
ALTER TABLE
    "user" ADD PRIMARY KEY("id");
CREATE TABLE "airport"(
                          "id" INTEGER NOT NULL,
                          "city" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "airport" ADD PRIMARY KEY("id");
CREATE TABLE "privilege"(
                            "id" INTEGER NOT NULL,
                            "name" VARCHAR(255) NOT NULL,
                            "discont" INTEGER NOT NULL
);
ALTER TABLE
    "privilege" ADD PRIMARY KEY("id");
ALTER TABLE
    "tickets_information" ADD CONSTRAINT "tickets_information_airplane_foreign" FOREIGN KEY("airplane") REFERENCES "airplane_info"("id");
ALTER TABLE
    "tickets_information" ADD CONSTRAINT "tickets_information_user_foreign" FOREIGN KEY("user") REFERENCES "user"("id");
ALTER TABLE
    "user" ADD CONSTRAINT "user_privilege_id_foreign" FOREIGN KEY("privilege_id") REFERENCES "privilege"("id");
ALTER TABLE
    "tickets_information" ADD CONSTRAINT "tickets_information_where_air_foreign" FOREIGN KEY("where_air") REFERENCES "airport"("id");
ALTER TABLE
    "tickets_information" ADD CONSTRAINT "tickets_information_from_air_foreign" FOREIGN KEY("from_air") REFERENCES "airport"("id");
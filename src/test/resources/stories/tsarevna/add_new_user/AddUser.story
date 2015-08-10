Добавление нового пользователя

Как Администратор
Я хочу добавить нового пользователя

Scenario: Добавление нового пользователя. Позитивное

Meta:
@categories user0
@role root
@root_login admin
@root_password admin

Given авторизоваться с правами root
When добавить пользователя с парамтерами: ФИО <fio>, Псевдоним <nickName>
Then в списке пользователей появился новый пользователь <fio>

Examples:
fio                      |nickName
Плотва Серьга Семёновна  |Плотва Серьга Семёновна


Scenario: Добавление нового пользователя. Негативное

Meta:
@categories user1
@role root
@root_login admin
@root_password admin

Given авторизоваться с правами root
When добавить пользователя с парамтерами: ФИО <fio>, Псевдоним <nickName>
Then отобразилась ошибка <error>

Examples:
fio                      |nickName                |error
ABCD                     |ABCDE                   |Ошибка: Минимальная длина ФИО 5 символов
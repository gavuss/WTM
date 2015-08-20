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
Комар Энесса Аганезовна  |Комар Энесса Аганезовна


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
null                     |null                    |Ошибка: Надо обязательно указать ФИО, Ошибка: Минимальная длина ФИО 5 символов, Ошибка: Надо обязательно указать псевдоним, Ошибка: Минимальная длина псевдонима 5 символов
ABCD                     |ABCD                    |Ошибка: Минимальная длина ФИО 5 символов, Ошибка: Минимальная длина псевдонима 5 символов
Плотва Серьга Семёновна  |Плотва Серьга Семёновна |Ошибка: ФИО должно быть уникальным, Ошибка: Псевдоним должен быть уникальным
Sdz8VPiUPDnQyXowdvvKOT5kW4rlBWr7rbzZJ7ohrQNl4lShKtu7dI9uNQbdRGm7DwW8UGFZy5TPPlb1tYVBpCRCvTxgEvqSouVJR |Sdz8VPiUPDnQyXowdvvKOT5kW4rlBWr7rbzZJ7ohrQNl4lShKtu7dI9uNQbdRGm7DwW8UGFZy5TPPlb1tYVBpCRCvTxgEvqSouVJR |Ошибка: Максимальная длина ФИО 100 символов, Ошибка: Максимальная длина псевдонима 100 символов
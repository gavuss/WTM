Добавление новго пользователя

Как Администратор
Я хочу добавить новго пользователя

Scenario: Добавление пользователя. Позитивное

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
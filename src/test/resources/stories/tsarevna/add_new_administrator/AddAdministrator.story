Добавление новго администратора

Как Администратор
Я хочу добавить новго администратора

Scenario: Добавление администратора. Позитивное

Meta:
@categories admin0
@role root
@root_login admin
@root_password admin

Given авторизоваться с правами root
When добавить администратора с параметрами: Имя <adminName>, Роль <role>, Пароль <password>, Повторение пароля <passwordCheck>
Then в списке администраторов появился новый пользователь <name>

Examples:
name              |role                             |password |passwordCheck
admin_test_1      |root(Полные права)               |123      |123
operator_test_1   |operator(Оператор/Менеджер)      |123      |123
admin_test_1      |admin(Технический администратор) |123      |123
accountant_test_1 |accountant(Бухгалтер)            |123      |123
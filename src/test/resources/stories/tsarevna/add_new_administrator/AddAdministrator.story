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
When добавить администратора с параметрами: Имя <name>, Пароль <password>, Роль <role>
Then в списке администраторов появился новый пользователь <name>

Examples:
name            |password |role
admin_test_1    |123      |root(Полные права)
operator_test_1 |123      |operator(Оператор/Менеджер)
admin_test_1    |123      |admin(Технический администратор)
ru text
## Коллекции: листы и сеты

Какие задачи нужно выполнить:

1. Перенести из курсовой работу с коллекцией сотрудников в сервис на базе веб-приложения на Spring. 
2. Заменить сообщения об ошибках выбросом исключений.  
3. Заменить массивы в коде на любую подходящую коллекцию.

### Шаг 1

Создать Spring Boot проект.

### Шаг 2

Подключить модуль Spring Web.

### Шаг 3

Перенести из курсовой класс Employee, оставив в нем только поля firstName и lastName, конструктор, геттеры и методы hashCode, equals, toString.

### Шаг 4

Создать сервис EmployeeService, который хранит внутри поле с коллекцией сотрудников и константу хранящее максимальное возможное количество сотрудников в фирме.

### Шаг 5

Реализовать в сервисе три метода, которые принимают в качестве параметров firstName и lastName:

1. Добавить сотрудника.
2. Удалить сотрудника.
3. Найти сотрудника.

### Шаг 6

Написать собственное непроверяемое исключение EmployeeNotFoundException, которое выбрасывается, если сотрудник не найден. 

### Шаг 7

Написать собственное непроверяемое исключение EmployeeStorageIsFullException, которое выбрасывается, если превышен лимит количества сотрудников в фирме.

### Шаг 8

Написать собственное непроверяемое исключение EmployeeAlreadyAddedException, которое выбрасывается, когда нового сотрудника пытаются добавить в коллекцию, а в коллекции уже есть такой сотрудник.  **

### Шаг 9

Добавить в методы из шага 5 новые исключения.

1. В метод с добавлением сотрудника нужно добавить выброс исключения из шага 7 в ситуации, когда коллекция переполнена.
2. В метод с добавлением сотрудника нужно добавить выброс исключения из шага 8 в ситуации, когда добавляемый сотрудник уже имеется в коллекции.
3. В метод с удалением сотрудника нужно добавить выброс исключения из шага 6 в ситуации, когда удаляемый сотрудник не найден.
4. В метод с поиском сотрудника нужно добавить выброс исключения из шага 6 в ситуации, когда сотрудник не найден.

### Шаг 10

Реализовать EmployeeController, который имеет поле EmployeeService. 

Объявить конструктор с этим параметром, чтобы заинджектить EmployeeService в EmployeeController.

### Шаг 11

Объявить в контроллере 3 метода:

1. По адресу /employee/add?firstName=Ivan&lastName=Ivanov должен вернуться объект Employee в формате JSON, т. е. { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение ArrayIsFull в случае переполнения коллекции или EmployeeAlreadyAdded в случае, когда сотрудник уже существует.
2. По адресу /employee/remove?firstName=Ivan&lastName=Ivanov должен вернуться объект Employee в формате JSON, т. е. { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение со статусом EmployeeNotFound, если сотрудник отсутствует.
3. По адресу /employee/find?firstName=Ivan&lastName=Ivanov должен вернуться объект Employee в формате JSON, т. е. { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение со статусом EmployeeNotFound, если такой сотрудник отсутствует.

### Шаг 12

Написать метод, который выводит в браузер список всех сотрудников в формате JSON (необходимо вернуть объект списка).

eng text

## Collections: list and sets

What tasks need to be completed:

1. Transfer the coursework with the employee collection from the course to a web application-based service on Spring. 
2. Replace error messages with throwing exceptions.
3. Replace arrays in the code with any suitable collection.

### Step 1

Create a Spring Boot project.

### Step 2

Connect the Spring Web module.

### Step 3

Move the Employee class from the course, leaving only the firstName and lastName fields, the constructor, getters and methods hashCode, equals, toString in it.

### Step 4

Create an EmployeeService service that stores a field with a collection of employees inside and a constant that stores the maximum possible number of employees in the company.

### Step 5

Implement three methods in the service that take firstName and lastName as parameters:

1. Add an employee.
2. Delete the employee.
3. Find an employee.

### Step 6

Write your own unchecked EmployeeNotFoundException exception, which is thrown if the employee is not found. 

### Step 7

Write your own unchecked exception EmployeeStorageIsFullException, which is thrown if the limit on the number of employees in the company is exceeded.

### Step 8

Write your own unchecked exception EmployeeAlreadyAddedException, which is thrown when a new employee is tried to be added to the collection, but there is already such an employee in the collection.  **

### Step 9

Add new exceptions to the methods from step 5.

1. In the method with the addition of an employee, you need to add an exception throw from step 7 in a situation when the collection is full.
2. In the method with the addition of an employee, you need to add an exception throw from step 8 in a situation where the employee being added is already in the collection.
3. In the method with deleting an employee, you need to add an exception from step 6 in a situation where the deleted employee is not found.
4. In the employee search method, you need to add an exception throw from step 6 in a situation where the employee is not found.

### Step 10

Implement an EmployeeController that has the EmployeeService field. 

Declare a constructor with this parameter to inject EmployeeService into EmployeeController.

### Step 11

Declare 3 methods in the controller:

1. At /employee/add?firstName=Ivan&lastName=Ivanov should return the Employee object in JSON format, i.e. { "firstName": "Ivan", "lastName": "Ivanov" }, or an ArrayIsFull exception in case of collection overflow, or EmployeeAlreadyAdded in case the employee already exists.
2. At /employee/remove?firstName=Ivan&lastName=Ivanov should return the Employee object in JSON format, i.e. { "firstName": "Ivan", "lastName": "Ivanov" }, or an exception with the EmployeeNotFound status if the employee is absent.
3. At /employee/find?firstName=Ivan&lastName=Ivanov should return the Employee object in JSON format, i.e. { "firstName": "Ivan", "lastName": "Ivanov" }, or an exception with the EmployeeNotFound status if there is no such employee.

### Step 12

Write a method that outputs a list of all employees in JSON format to the browser (you need to return the list object).

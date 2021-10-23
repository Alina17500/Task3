# Task3

№65

Условный оператор + функции + классы + перечисления + декомпозиция задачи (разбиение на подзадачи) + формальный подход.
На изображниях ниже (для каждого варианта свое) приводится часть координатной плоскости (−10 ≤ x ≤ 10, −10 ≤ y ≤ 10) с графиками функций (парабола, линия) и фигурами (круг, прямоугольник). Размер одной клетки сетки – 1 (единица). Таким образом параметры функций и фигур можно однозначно определить из рисунка.
Области, на которые разбивается плоскость графиками и контурами фигур, закрашены разными цветами (белый, серый, желтый, оранжевый, голубой, зеленый). Необходимо реализовать программу, которая для точки (x, y) определяет цвет области, в которую данная точка попадает. Будем считать, что если точка (x, y) попадает на линию графика функции или контура фигуры, то правильным ответом будет цвет любой соседней области. Также стоит заметить, что некоторые комбинации линий предполагают их пересечение за пределами изображенного на рисунке фрагмента плоскости, поэтому, чтобы исключить неопределенность ответа, допустимыми значениями (x, y) являются только такие, которые попадают в приведенное изображение.

![65](https://user-images.githubusercontent.com/90615042/138553616-274c8f99-af8e-44a5-82d2-800ab486a729.png)

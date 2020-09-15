package com.company;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(6, "Blue", false); // Данные переданы по конструктору Circle в объект типа Shape
        System.out.println(s1); // Метод перегружен в Circle вызывается из Circle
        System.out.println(s1.getArea()); // Аналогично получаем площадь : есть подобный абстрактный метод в классе Shape , однако считаем по формуле из класса Circle
        System.out.println(s1.getPerimeter()); // Аналогично комментарию сверху
        System.out.println(s1.getColor()); // Метод из Shape
        System.out.println(s1.isFilled()); // Аналогично комменту сверху
        //System.out.println(s1.getRadius()); // Невозможно вызвыть так как нету такого метода в Shape

        Circle c1 = (Circle) s1; // Объект класса Circle
        System.out.println(c1); // Метод Circle
        System.out.println(c1.getArea()); // Метод Circle
        System.out.println(c1.getPerimeter()); // Метод Circle
        System.out.println(c1.getColor()); // Метод Circle
        System.out.println(c1.isFilled()); // Метод Circle
        System.out.println(c1.getRadius()); // Метод Circle

        //Shape s2 = new Shape(); // Абтрактный класс не может существовать

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Создаём объект типа Rectangle с доступными методами из Shape
        System.out.println(s3); // Метод из Rectangle , переполненный
        System.out.println(s3.getArea()); // Метод переполненный в Rectangle
        System.out.println(s3.getPerimeter()); // Аналогично комменту выше
        System.out.println(s3.getColor()); // Метод из Shape
        //System.out.println(s3.getLength()); // Недостуаный метод , так как в Shape нету getLength

        Rectangle r1 = (Rectangle)s3; // Создаём объект непосредственно типа rectangle
        System.out.println(r1); // Метод Rectangle
        System.out.println(r1.getArea()); // Аналогично выше
        System.out.println(r1.getColor()); // Также
        System.out.println(r1.getLength()); // Также

        Shape s4 = new Square(6.6); // Объект типа Square но с доступными методами из Shape
        System.out.println(s4); // Метод из Square
        System.out.println(s4.getArea()); // Метод поиска площади из Rectable , но доступен потому что есть в Shape
        System.out.println(s4.getColor()); // Метод из Shape
        //System.out.println(s4.getSide()); // Нельзя так как такого метода нету в Shape

        Rectangle r2 = (Rectangle)s4; // Создаём объект непосредственно типа Rectangle
        System.out.println(r2); // Метод Rectangle
        System.out.println(r2.getArea()); // Метод поиска площади из Rectangle
        System.out.println(r2.getColor()); // Метод унаследованный из Shape
        //System.out.println(r2.getSide()); // Нельзя так как нельзя достать методы из наследников
        System.out.println(r2.getLength()); // Метод из Rectangle

        Square sq1 = (Square)r2; // Оздаём объект типа Square на основе данных из родительского объекта Rectangle
        System.out.println(sq1); // Метод Square
        System.out.println(sq1.getArea()); // Метод из Rectangle наследованный
        System.out.println(sq1.getColor()); // Метод наследованный из Shape
        System.out.println(sq1.getSide()); // Метод Square
        System.out.println(sq1.getLength()); // Метод из Rectangle унаследованный
    }
}


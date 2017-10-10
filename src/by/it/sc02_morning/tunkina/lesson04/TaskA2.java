package by.it.sc02_morning.tunkina.lesson04;

/*
Lesson 04. Task A2. Стихотворение

В созданном вами методе main напишите следующий код:
Запишите свое любимое стихотворение в переменных a b c d и т.д. (типа String)
Выведите одну строку «Мое любимое стихотворение:».
Напишите еще одну строку вывода, но так, чтобы в результате выполнения программы
было выведено ваше любимое стихотворение.
В стихотворении должно быть не меньше, чем 4 строки.

Требования:
1.Программа должна выводить текст.
2.Перед стихом должна быть выведена строка "Мое любимое стихотворение:".
3.Выводимый текст должен состоять не меньше, чем из пяти строк (пустые строки - это тоже строки).
4.В выводимом тексте должно быть не менее, чем 50 символов.
5.Команд System.out.println в коде должно быть максимум две.

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/
class TaskA2 {
    public static void main(String[] args) {
        String a = "Имей я Солнца яркую звезду,";
        String b = "Луны свеченья безупречный месяц,";
        String c = "Твою - в Его синянии звезду,";
        String d = "И твой - в Её тумане синий месяц...";
        String e = "Я расстелил бы их у ног твоих.";
        String f = "Но я - бедняк, и у меня лишь грезы,";
        String g = "Я простираю грёзы под ноги тебе,";
        String h = "Ступай легко, мои ты топчешь грёзы...";
        System.out.println("Мое любимое стихотворение:");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);
    }

}

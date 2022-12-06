public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(
                EnumColor.BLACK,
                new Shelter("Маяковский", "Маяковского 128"),
                "Шарик",
                "Овчарка"
        );
        System.out.println(dog.getInfo());

        dog.makeVoice();
        dog.makeVoice("Гав");
        dog.makeVoice("Ауууууу", 5);

        Dog dog1 = new Dog(
                EnumColor.WHITE,
                new Shelter(" Добрые руки", "Токтогула 156"),
                "Граф",
                "Лабродор");
        System.out.println(dog1.getInfo());


        dog1.makeVoice();
        dog1.makeVoice("PPPPP");
        dog1.makeVoice("Эээээй", 3);



        Dog dog2 = new Dog(
                EnumColor.BROWN,
                new Shelter("KaynarHelp", "Тургенева 49"),
                "Хати",
                "Акита-ину"
        );
        System.out.println(dog2.getInfo());

        dog2.makeVoice();
        dog2.makeVoice("УУУУ");
        dog2.makeVoice("Йййййй", 2);


        Dog dog3 = new Dog(
                EnumColor.GRAY,
                new Shelter("Барс", "Анкара 126"),
                "Оскар",
                "Хаски"
        );
        System.out.println(dog3.getInfo());



        dog3.makeVoice();
        dog3.makeVoice("Ауууууу");
        dog3.makeVoice("Ooooooo", 4);
    }}
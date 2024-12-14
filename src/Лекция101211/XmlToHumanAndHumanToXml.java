package Лекция101211;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.nio.file.Path;

public class XmlToHumanAndHumanToXml {

    public static void main(String[] args) throws JAXBException {

        Path filesPath = Path.of("human.xml");// Для начала говорим путь, где будет храниться наш файл.
                                                   // Далее будем работать с human
        JAXBContext context = JAXBContext.newInstance(Human.class);// Говорим, будем работать с классом Human

        // РАСПАКОВЫВАЕМ XML в ОБЪЕКТ

        Unmarshaller unmarshaller = context.createUnmarshaller();//Далее необходим объект context, из которого
                                                                // создадим createUnmarshaller. Который читает
                                                                // значения и является аналогом objectMapper в json

        // Ниже говорим, хотим нашего Олега достать из файла
         //Human oleg = unmarshaller.unmarshal(filesPath.toFile());// Ругается на данный код так как думает, что
                                                                    // наш Human это объект, а не класс поэтому
                                                                    // мы просто преобразуем сами и получается
                                                                    // рабочий код, представленный ниже. За счёт
                                                                    // добавления (Human)

        Human oleg = (Human) unmarshaller.unmarshal(filesPath.toFile());
        // Мы говорим доверься мне это будет хьюман, поверь мне. Он говорит хорошо, тогда ладно,
        // этот объект unmarshaller.unmarshal(filesPath.toFile()) буду преобразовывать в Human. Ну а дальше
        // на нашей совести программа сломается или нет.
        // Берем объект, unmarshaller его и превращаем в oleg
        System.out.println(oleg);

        // Запустив данный код, опять вышла ошибка. Чтобы её обойти нужно в классе Human в самом верху
        // над объявлением класса "public class Human" написать аннотацию "@XmlRootElement" - и будет песня

        // УПАКОВЫВАЕМ XML в ОБЪЕКТ

        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(new Human("Алекс", 1000), filesPath.toFile());//Создаём объект и упаковываем в файл

        //Unmarshaller - распаковщик (если мы хотим получить данные из файла),
        // Marshaller - упаковщик (если мы хотим записать объект в XML файл)
    }
}

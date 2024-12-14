package Лекция101211;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement//Мы говорим, что это будет главный корневой элемент
public class People {

        private String name; // Имя
        private int age; // Возраст

        @JsonProperty("Pablic") //Здесь мы аннотации jackson говорим, вот это поле "Pablic" найди в json файле
                                // и считай что это слово "phone"
        private String phone; // Телефон

        public People () {//Создали пустой (дефолтный) конструктор
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getPhone() { return phone; }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
package CW.Lesson_2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
public class Candy {
    private String id;
    private String title;
    private String Manufacturer;

    public Candy() {
    }

    public Candy(String id, String title, String manufacturer) {
        this.id = id;
        this.title = title;
        Manufacturer = manufacturer;
    }
}

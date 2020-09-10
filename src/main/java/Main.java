import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Olga Fedorenkova (WorkNetBook)
 * 10.09.2020
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Cat cat1 = new Cat("hegfjgq", "dgfja", "hgda");
        Cat cat = new Cat("djshf", "dhgfash", "ahjgdiau");

        Gson gson = new Gson();
        gson.toJson(cat);
        gson.toJson(cat1);
        System.out.println(gson.toString());
        List<Cat> list = new ArrayList<>();
        list.add(cat);
        list.add(cat1);

        FileWriter file = new FileWriter("C:\\example.json", false);
        file.write(gson.toJson(list));
        file.flush();
    }
}

package CW.Lesson_2.entity;

import java.util.ArrayList;
import java.util.List;

public class CandyUtill {
    List<Candy> candyList = new ArrayList<>();

    public void addCandy(Candy candy){
        candyList.add(candy);
    }

    public List<Candy>getAllCandy(){
        return candyList;
    }
}

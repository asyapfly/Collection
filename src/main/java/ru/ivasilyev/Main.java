package ru.ivasilyev;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Integer> getRandomList(){
        List<Integer> list = new ArrayList<>();
        int size = new Random().nextInt(15);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(10));
        }
        return list;
    }

    public static void main(String[] args){
        List<Integer> randomList = getRandomList();
        System.out.println(randomList);

        randomList.sort(Integer::compareTo);
        System.out.println(randomList);

        //оставить все числа больше 3
        //вычесть из каждого 2
        //удалить все дубликаты

        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < randomList.size() ; i++) {
            if(randomList.get(i) > 3 && !newList.contains(randomList.get(i) - 2)){
                newList.add(randomList.get(i) - 2);
            }
        }

        System.out.println(newList);
    }
}

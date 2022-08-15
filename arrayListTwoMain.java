import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p1= new Person(20,"Sarah");
        Person p2= new Person(30,"Tomer");
        Person p3= new Person(18,"Moshe");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println(p3.goTo());

//        ArrayList<String> myArrayList= new ArrayList<>();
//        ArrayList<Float> myIntegersList= new ArrayList<>();

//        ArrayList<Person> myPersonList = new ArrayList<>();
//        myPersonList.add(new Person(24,"Beni"));
//        myPersonList.add(new Person(33,"Dani"));
//        myPersonList.add(new Person(18,"Sarah"));
//
//        for (int i = 0; i < myPersonList.size(); i++) {
////            Person p= myPersonList.get(i);
////            System.out.println(p);
////            System.out.println(p.getName());
//            myPersonList.get(i).play();
//        }



    }
}

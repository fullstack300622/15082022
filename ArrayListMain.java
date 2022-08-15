import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



//        String[] myArray = new String[3];
//        myArray[0]="blblabla";
        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("Brrrr");
        myStringList.add("Hello");
        myStringList.add("World");
        myStringList.add("Bla bla");

        boolean isRemoved=  myStringList.remove("Hello");
        System.out.println("if mystring item removed? "+isRemoved);


        for (int i = 0; i <myStringList.size(); i++) {
            System.out.println(myStringList.get(i));
        }


//        System.out.println(myArray[0]);
//        System.out.println(myStringList.get(0));


//        myStringList.set(2,"Bobi");
//        myStringList.add();
//        myStringList.set(3,"Bobi");


//        for (int i = 0; i < myStringList.size(); i++) {
//            //get
//            System.out.println(myStringList.get(i));
//                  System.out.println(myArray[i]);
//        }
//        if(myStringList.indexOf("sdvfsdf")>=0){
//
//        }
        //indexOf
        //lastIndexOf
//        System.out.println(myStringList.indexOf("Hello"));
//        System.out.println(myStringList.lastIndexOf("Hello"));


//        "Brrrr"    0
//        "Hello"    1
//        "World"    2
//        "Bla bla"  3
//        myStringList.remove("Hello");
        //        "Brrrr"    0
        //        "World"    1
        //        "Bla bla"  2

        //myStringList.remove(0);

//        System.out.println(myStringList.contains("Brrrrasdasd"));

        if(myStringList.contains("Brrrrasdasd")){
            myStringList.remove("Brrrrasdasd");
        }


//        for (int i = 0; i < myStringList.size(); i++) {
//            System.out.println(myStringList.get(i));
//        }




    }


}

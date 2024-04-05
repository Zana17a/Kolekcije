import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kolekcije");
        int a = 10;
        String s = String.valueOf(a); // int prebacimo u String
        String s3 = a + "";
        System.out.println(s3);
// -----------------------------------------------------------------------------------------------------
        String s1 = "10";    //skinemo sa weba
        String s2 = "20";   //skinemo sa weba
//        nama treba int za operacije dalje pa pretvaramo String u int: (isto i double)
        int b = Integer.parseInt(s1);  //Wraper klasa.ugradjene staticke metode => posto ih pozivamo preko klase (italic)
        int c = Integer.parseInt(s2);
        int zbir = b + c;

        double d = Double.parseDouble(s1);  //Wraper klasa.ugradjene staticke metode => posto ih pozivamo preko klase (italic)
        double e = Double.parseDouble(s2);
        double zbir2 = d + e;
        System.out.println(zbir2);
//-------------------------------------------------------------------------------------------------------------------
        System.out.println("Liste");

//        Object o = 1.5;//mogu ovo uvek da koristim, Object je nadklasa svim klasam u Javi (mama klsa, prva klsa u Javi), is nje nam dolaze razne ugradjene metode
//        Object o2 = 2.5;
//        System.out.println(o.equals(o2));

        List myList = new ArrayList(); // List je Interface, najvise se ovo koristi,
        myList.add("Pera");
        myList.add(88);
        myList.add(true);
        myList.add("A");
        System.out.println("size my List-e" + myList.size());
        System.out.println(myList);  //lista nam dozvoljava ovako da je printamo

        for (Object i : myList) {    //foreach petlja   // ovde za brojac mora Object, zato sto su nam elementi razlicitog tipa unutra
            System.out.println("FOREACH petlja, brojac object: " + i);
        }
        ;

        ArrayList<Integer> list = new ArrayList<>(); //ArrayList sa leve strane je Klasa
        list.add(99);
        list.add(81);
        list.add(9);
        list.add(17);
        list.add(4);
        list.add(700);
        list.add(700);
        list.add(81);
        list.remove(0);  // uklonimo element sa 0 indexa tj. ovaj 99 element

        for (int i : list) {    //foreach petlja
            System.out.println("FOREACH petlja: " + i);
        };

        list.size();
        System.out.println(list.size());
        System.out.println(list);  //lista nam dozvoljava ovako da je printamo

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));  //getujemo elemente liste

//        list.clear(); // prazna lista
        if (!list.isEmpty())
            {System.out.println("lista nije prazna: " + list);}
            else {System.out.println("lista je prazna");}

        Collections.sort(list);
        System.out.println("lista sortirana: " + list);
        Collections.reverse(list);
        System.out.println("lista sortirana pa reverse: " + list);

        List list1 = new LinkedList(Arrays.asList("Toma", 12 , true));  //ponasa se kao Array lista, ali se ne upisuje isto u mem,
        System.out.println("Linked lista:" + list1);
        System.out.println("Linked lista, element sa indexa 1 :" + list1.get (1));
        list1.add(25);
        System.out.println("Linked lista:" + list1);
        list1.addAll(list);     // dodam listu u listu
        System.out.println("Linked lista plus list:" + list1);


        Set<Integer> integerSet = new HashSet<>(list);  //ukloni duplikate, kad su unikatni podaci (svi integer)
        System.out.println("Set: " + integerSet);

        Collections.emptyList();
        Collections.max(list);
        Collections.min(list);
        System.out.println(Collections.emptyList());
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        };
    }
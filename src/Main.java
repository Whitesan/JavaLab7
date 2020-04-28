import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
       Osoba O1 = new Osoba("piotr","Misztal","Pukinin 42",48,663496930);
       Osoba O2 = new Osoba("Michal","Kowalski","Kaleń 22",48,520304054);
       Osoba O3 = new Osoba("Maciej","marciniak","Rawa Mazowiecka",48,667150234);
       Firma F1 = new Firma("Tabo","Rawa Mazowiecka 4",48,434323123);
       Firma F2 = new Firma("DHL","Rawa Mazowiecka 43",48,123412323);
       TreeMap<NrTelefoniczny,Wpis> map = new TreeMap<NrTelefoniczny,Wpis>();
       map.put(O1.getNumber(),O1);
       map.put(O2.getNumber(),O2);
       map.put(O3.getNumber(),O3);
       map.put(F1.getNumber(),F1);
       map.put(F2.getNumber(),F2);

       Set set = map.entrySet();
       Iterator i = set.iterator();
       while(i.hasNext())
       {
           Map.Entry m = (Map.Entry)i.next();
           System.out.print("Key is: "+m.getKey() + " & ");
           System.out.println("Value is: "+m.getValue());
       }

    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }

        System.out.println("before sorting Array " + Arrays.toString(array));;
        sortInt(array);
        System.out.println("after sorting Array: " + Arrays.toString(array));
        System.out.println("before sorting ArrayList " + arrayList);
        sortArrayList(arrayList);
        System.out.println("after sorting ArrayList" + arrayList);
        System.out.println("before sorting LinkedList " + linkedList);
        sortLinkedList(linkedList);
        System.out.println("after sorting LinkedList " + linkedList);

    } public static void sortInt (int [] array){
        Arrays.sort(array);
    }
    public static void sortArrayList (List<Integer> arrayList){
        Collections.sort(arrayList);

    }
    public static void sortLinkedList (List <Integer> linkedList){
        Collections.sort(linkedList);
    }
}

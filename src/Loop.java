import java.util.ArrayList;

public class Loop {

    ArrayList<Integer> ar = new ArrayList<>();
    ArrayList<Integer> ar2 = new ArrayList<>();

    public void addArrayValue(){
        for(int i = 0; i < 11; i++){
            ar.add(i,4);
        }
        for(int i = 0; i < 10; i++){
            ar2.add(i,4);
        }
    }
    public void firstLoop(){
        int cacti = 1000;
        int count = 0;
        for(int i = 0; i < cacti; i++){
            count += 2;

        }
        System.out.print(count);
    }

    public void secondLoop(){
        addArrayValue();
        int count = 0;
        for(int i =0; i < ar.size(); i++) {
            for (int j = ar.size(); j < ar2.size(); j++) {
               count++;

            }

        }
        System.out.print(count);
    }

    public void thirdLoop(){
        addArrayValue();
        int i =0;
        int j =0;
        while(i<ar2.size()){
            j = 0;
            System.out.println("| ");
            i++;
            while(j<ar.size()){
                j++;

                System.out.print("| ");
            }
        }
    }
}

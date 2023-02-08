import java.util.ArrayList;

public class Loop {

    ArrayList<Integer> ar = new ArrayList<>();
    ArrayList<Integer> ar2 = new ArrayList<>();
    public void firstLoop(){
        int cacti = 1000;
        int count = 0;
        for(int i = 0; i < cacti; i++){
            count += 2;

        }
        System.out.print(count);
    }

    public void secondLoop(){
        for(int i = 0; i < 11; i++){
            ar.add(i,4);
        }
        for(int i = 0; i < 10; i++){
            ar2.add(i,4);
        }
        int count = 0;
        for(int i =0; i < ar.size(); i++) {
            for (int j = ar.size(); j < ar2.size(); j++) {
               count++;

            }

        }
        System.out.print(count);
    }

    public void thirdLoop(){

    }
}

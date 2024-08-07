public class _08_Loop_Break_Continue {
    public static void main(String[] args) {
        // 1. WHILE
        int countDown = 3;
        while (countDown > 0)
        {
            System.out.println(countDown);
            countDown--;

            if(countDown == 0){
                System.out.println("Happy New Year!");
            }
        }

        // 2. DO WHILE
        int load = 1;
        do
        {
            System.out.println("Loading..."+ load);
            load++;

            if(load == 6){
                System.out.println("Load Complete.");
            }
        } while (load < 6);

        // 3. FOR
        for (int i = 1; i<=10; i++)
        {
            if(i==4) continue;  // Skips & Continues with next Iteration
            System.out.println(i);
            if (i==7) break;    // Exits or Jumps out of the Loop
        }

        // 4. FOR EACH
        String[] cars = { "BMW", "Toyota", "Mustang", "Tesla", "Ford" };
        for (String i: cars)
        {
            System.out.println(i);
        }
    }
}

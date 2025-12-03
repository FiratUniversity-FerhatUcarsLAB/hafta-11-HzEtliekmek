public class Exercise4_2 {

    public static void main(String[] args) {
        zippo("rattle", 13);               // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);         // 4
        zippo("ping", -5);                 // 5
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                    // 2, 6
            System.out.println(quince + " zoop"); // 7
        } else {
            System.out.println("ik");      // 3
            baffle(quince);                // 4 (Buradan baffle çağrılır)
            System.out.println("boo-wa-ha-ha"); // 8
        }
    }
}
/*
 * ÇIKTI:
 * ik
 * rattle
 * ping zoop
 * boo-wa-ha-ha
 */

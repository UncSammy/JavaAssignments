
public class TelevisionViewer {

    public static void main(String[] args) {

        Television television = new Television();

        for (int day = 1; day <= 10; day++) {

            System.out.println("Woke up, day " + day);

            int watchingTime;

            if (day % 2 == 1) {
                watchingTime = 3;
            } else {
                watchingTime = 4;
            }
            for (int i = 0; i < watchingTime; i++) {
                television.watch();
            }

            System.out.println("Falling asleep");
        }
    }
}

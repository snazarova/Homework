public class Main {
    public static void main(String[] args) {
        var workTime = 640;
        var timeFor1Worker = 8;
        var workersNumber = workTime / timeFor1Worker;
        System.out.println("Всего работников в компании " + workersNumber + " человек ");

        var allWorkers = workersNumber + 94;
        var timeForWork = workTime / allWorkers;
        System.out.println("Если в компании работает  " + allWorkers + " человек, то всего " + timeForWork + "часов работы может быть поделено между сотрудниками ");

    }
}
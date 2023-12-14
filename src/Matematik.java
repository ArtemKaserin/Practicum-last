public class Matematik {
    String name;
    int speed;
    int educationLevel;
    String surname;


    public Matematik(int speed, int educationLevel) {
        if (speed < 1 || speed > 100){
            throw new RuntimeException("Скорость должна быть 1-100");
        }else {
            this.speed = speed;
        }
        if (educationLevel < 0 || educationLevel > 10){
            throw new RuntimeException("Уровень образования должен быть 0-10");
        }else {
            this.educationLevel = educationLevel;
        }
    }

    public double calculateSquareSurface(double side) throws Exception{
        if (educationLevel>=2) {
            System.out.println("Я начал работать");
            if (side <= 0) {
                System.out.println("Сторона квадата не может быть отрицательной");
                return -1;
            }
            Thread.sleep(10000/speed);
            return side * side;
        }else if (educationLevel == 1){
            System.out.println("Я могу ошибиться");
            if (Math.random() > 0.5) {
                Thread.sleep(20000/speed);
                return side * side;
            }else {
                return side * side/ 2;
            }
        }else{
            System.out.println("Ничего не могу сделать");
            return -999999999;
        }
    }
}

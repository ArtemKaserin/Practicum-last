public class Test {
    public static void main(String[] args) throws Exception{
        Matematik schoolmatematik = new Matematik(10,2);
        schoolmatematik.name = "Иван";
        schoolmatematik.surname = "?";

        System.out.println(schoolmatematik.calculateSquareSurface(5));
    }
}

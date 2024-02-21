public class Stg2 {
    
    public static void main(String[] args) {
        String name = "shrey";
        name.concat("mehta");
        System.out.println(name); //String is immutable

        StringBuffer names=new StringBuffer("shrey");
        names.append("mehta");
        System.out.println(names);
    }
}

package Day10.Interface;
public class collaboration {
    public static void main(String[] args) {

//        Student s=new Student("Mayuresh" ,10,20);
//        Student s1=new Student("Rohit" ,2,2);

        Student s=new Student();
        Student s1=new Student();


        int comparisonResult = s.compareTo(s1);
        if(comparisonResult>0){
            System.out.println("High");
        }
        else if(comparisonResult<0){
            System.out.println("Low");
        }
        else{
            System.out.println("Equal");
        }


    }

}

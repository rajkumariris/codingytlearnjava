package pojo;

public class Client {
    public static void main(String[] args) {
//        for(enumclass sample: enumclass.values()){
//
//            //System.out.println(sample.ordinals) gives values 0,1,2,3,...
//            System.out.println(sample);// gives monday tuesday ,we....
//        }
       enumclass enumvalue =  enumclass.valueOf("friday");
        System.out.println(enumvalue.name());

        enumcustom samplevar = enumcustom.getEnumFromvalue(103);
        System.out.print(samplevar.getVal());
    }
}

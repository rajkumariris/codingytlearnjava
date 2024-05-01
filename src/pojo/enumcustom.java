package pojo;

public enum enumcustom {

    monday(101,"1st day of week"),
    tuesday(102,"2st day of week"),
    wednesday(103,"3st day of week"),
    thursday(104,"4st day of week"),
    Friday(105,"5st day of week");

    private int val;
    private String comment;

    enumcustom(int val, String comment){
        this.val = val;
        this.comment = comment;
    }
    public int getVal(){
        return val;
    }
    public String getComment(){
        return comment;
    }

   public static  enumcustom getEnumFromvalue(int value){
        for(enumcustom eNUMM: enumcustom.values()){
            if(eNUMM.getVal()  == value){
                return eNUMM;
            }
        }
        return null;
   }
}



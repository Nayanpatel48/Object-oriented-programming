public class One_Var {
    public static void main(String[] args)
    {
        //----------------------var type identifier--------------------------
        //let compiler decide which type of variable you declare
        //once created it's type can not be changed means int remains int ,string remains string
        //to check data type in java use inside print ->((Object)intData).getClass().getSimpleName()
        var name = "Nayan";
        System.out.println(((Object)name).getClass().getSimpleName());
        //String
        String[] names = {"Nayan", "Harshil", "Akhil"};
        for (var n : names)
            System.out.print(n+" ");
        //Nayan Harshil Akhil
        //in above code we used var to make our code more easy to read
    }
}
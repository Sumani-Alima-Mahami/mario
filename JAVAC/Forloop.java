public class  Forloop {
    public static void main(String[] args) {
        int i;
        for (i=0;i<20;i++)
        {
            if(i==0)continue;
            {
                System.out.println(i+1);
                if (i==10)break;
            }
        }
    }
}

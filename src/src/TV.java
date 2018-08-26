public class TV {
    public static void main(String[] args){
        TV haiertv =new TV();
        System.out.println(haiertv.open(5));//先调用bark方法，再在控制台输出

//        for (int i=0;i<5;i++){
//            System.out.println(i);
//        }
    }

    public int open(int x){
        System.out.println(x);
        return x+5;
    }

}

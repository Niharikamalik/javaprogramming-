class Swapping {
    public static void main (String[] args) {
        int a=3,b=5;
        System.out.println("Before swapping\n"+"a : "+a+"\nb : "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping \n"+"a : "+ a +"\nb : "+b);
    }
}

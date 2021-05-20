public class BatteryTest {
    public static int  globalNum;

    public static void outPrint(){
        System.out.println(globalNum);
    }

    public static void sleepTime() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void addNum(){
        globalNum = globalNum+1;
    }

    public static void main(String[] args) throws InterruptedException {
        //奇数时输出，偶数时睡眠
        while(true){
            if(globalNum%2==1){
                //全局变量为奇数，输出
                outPrint();
                addNum();
            }else{
                //全局变量为偶数，睡眠
                sleepTime();
                addNum();
            }
        }
    }


}

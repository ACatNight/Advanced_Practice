package OOP.day13.test1;

public class Computer {
    public void start(){
        System.out.println("电脑启动中");
        CPU cpu = new CPU();
        GPU gpu = new GPU();
        cpu.run();
        gpu.work();



    }

    public class CPU{
        public void run(){
            System.out.println("CPU正在运行");
        }
    }
    public  class GPU{
        public void work(){
            System.out.println("GPU正在绘图");
        }
    }

}

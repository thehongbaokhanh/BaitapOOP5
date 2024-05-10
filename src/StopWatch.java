public class StopWatch {
    private double startTime = 0;
    private double endTime = 0;
    boolean action = false;
    public void start(){
        double startTime = System.nanoTime();
        this.action = true;
    }
    public void end(){
        double endTime = System.nanoTime();
        this.action = false;
    }
    public double getEclapseTime(){
        double result = 0;
        if (action){
            result = System.nanoTime() - startTime;
        }
        return result;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        double timing = stopWatch.getEclapseTime();
        stopWatch.end();
        System.out.println(timing);

    }
}

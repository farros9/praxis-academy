import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter1 implements Runnable
{
    private final MainApp mainApp;
    private final int loopLimit;
    private final String task;

    public Counter
        (MainApp mainApp, int loopLimit, String task)
    {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
        this.task = task;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < loopLimit; i++)
        {
            System.out.println("Thread: " +
            Thread.currentThread().getName() + " Counter: "
                            + (1 + 1) + " Task: " + task);
            mainApp.pause(Math.random());
        }
    }
}
class MainApp
{
    public void startThread()
    public void startThread()
    {
        ExecutorService taskList =
                        Executor.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++)
        {
            taskList.execute(new Counter(this, i + 1,
                                    "task " + (i+ 1)));                     
        }
        taskList.shutdown();
    }
    public void pause(double second)
    {
        try
        {
            Thread.sleep(Math.round(1000.0 * second));
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new MainApp().startThread();
    }
}
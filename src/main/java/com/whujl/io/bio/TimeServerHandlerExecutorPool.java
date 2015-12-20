package com.whujl.io.bio;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by whujl on 15/12/9.
 */
public class TimeServerHandlerExecutorPool {

    private ExecutorService executor;

    public TimeServerHandlerExecutorPool(int maxPoolSize, int queueSize){
        executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), maxPoolSize, 120L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(queueSize));
    }

    public void execute(Runnable task){
        executor.execute(task);
    }

}

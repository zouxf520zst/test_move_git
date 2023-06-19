package com.bjpowernode.nacosdiscoveryconsumer.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author:zouxf
 * @date 2023/1/30 9:39
 */
public class ThreadPoolUtil {
   public static final ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 1000,
            TimeUnit.MINUTES, new ArrayBlockingQueue<>(10));

}

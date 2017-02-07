package practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorsSumOfNumbers {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorsSumOfNumbers numbers  = new ExecutorsSumOfNumbers();
		numbers.performSummationWithArrayBlockingQueue();
	}

	private void performSummationWithLinkedBlockingQueue() throws InterruptedException, ExecutionException {
		long N  = 1000000000;
		long sum = 0;
		List<Future<Long>> results = new ArrayList<>();
		
		//throws OOM as it internally uses LinkedBlockingQueue.
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for(long i = 1 ; i < N ; i = i + 100){
			NumbersSummation task = new NumbersSummation(i, i+99);
			results.add(threadPool.submit(task));
		}
		threadPool.shutdown();
		
		for (Future<Long> future : results) {
			sum = sum + future.get();
		}
		
		System.out.println("Total sum is " + sum);
		
	}
	
	private void performSummationWithArrayBlockingQueue() throws InterruptedException, ExecutionException {
		long N  = 10000000;
		long sum = 0;
		List<Future<Long>> results = new ArrayList<>();
		
		//doesn't throw OOM because ArrayBlockingQueue has a size of 20.
		ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(20);
		ExecutorService threadPool = new ThreadPoolExecutor(2, 2,0L, TimeUnit.MILLISECONDS,workQueue);
		
		for(long i = 1 ; i < N ; i = i + 100){
			NumbersSummation task = new NumbersSummation(i, i+99);
			
			while(workQueue.size() >= 20){
				
				//wait even before RejectedExecutionException occurs 
			}
			results.add(threadPool.submit(task));
				
		}
		threadPool.shutdown();
		
		for (Future<Long> future : results) {
			sum = sum + future.get();
		}
		
		System.out.println("Total sum is " + sum);
	}

	class NumbersSummation implements Callable<Long>{

		private long start;
		private long end;
		
		public NumbersSummation(long start , long end) {
			this.start  = start;
			this.end  = end;
		}
		
		@Override
		public Long call() throws Exception {
			long sum = 0;
			long temp  = start;
			while(temp <= end){
				sum = sum + temp;
				temp++;
			}
			return sum;
		}

}


	
}

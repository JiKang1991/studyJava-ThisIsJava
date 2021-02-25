package studyThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * execute() �޼ҵ� Ȱ�� ���� ( execute() �޼ҵ�� �۾� ó�� ��û�� ��� )
 * @author jikang
 *
 */
public class ExecuteExample {
	public static void main(String[] args) throws InterruptedException {
		// �ִ� ������ ������ 2�� ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 10; i++) {
			// �۾� ����
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// ������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[ �� ������ ���� : " + poolSize + " ] �۾������� �̸� : " + threadName);
					
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};
			
			// �۾� ó�� ��û
			//executorService.execute(runnable);
			executorService.submit(runnable);
			
			// �ֿܼ� ��� �ð��� �ֱ����� 0.01�� �Ͻ� ���� ��Ŵ
			Thread.sleep(10);
		}
		
		// ������Ǯ ����
		executorService.shutdown();
	}
}

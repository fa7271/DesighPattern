package this_is_java.Thread.RunnalbevsCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String[] args) throws Exception {
        // 최대 스레드 개수가 2인 스레드풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    // 스레드 총 개수 및 작업 스레드 이름 출력
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);

//                     예외 발생 시킴
                    int value = Integer.parseInt("삼");
                }
            };
            // 작업 처리요청. 리턴값이 존재하지 않음
            executorService.execute(runnable);
//            executorService.submit(runnable);
            // 콘솔에 출력 시간을 주기 위해 0.01초 일시 정지 시킴
            Thread.sleep(10);
        }
        executorService.shutdown();
    }
    Callable<Integer> task = new Callable<Integer>(){
        @Override
        public Integer call() throws Exception {
            return null;
        }
    };
}


public class TesteSingleton {

    public static void main(String[] args) {
        Runnable tarefa = () -> {
            Singleton instancia = Singleton.getInstancia();
            System.out.println(Thread.currentThread().getName() + " recebeu a instância: " + instancia);
        };

        // Criando várias threads que tentarão acessar o Singleton ao mesmo tempo
        Thread t1 = new Thread(tarefa, "Thread-1");
        Thread t2 = new Thread(tarefa, "Thread-2");
        Thread t3 = new Thread(tarefa, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

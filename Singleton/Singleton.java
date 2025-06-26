public class Singleton {

    private static volatile Singleton instancia;

    private Singleton() {
        System.out.println("🔨 Criando a instância do Singleton...");
        try {
            Thread.sleep(1000); // Simula tempo de construção
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstancia() {
        System.out.println(Thread.currentThread().getName() + " entrou no getInstancia()");
        
        if (instancia == null) {
            System.out.println(Thread.currentThread().getName() + " encontrou instancia == null");

            synchronized (Singleton.class) {
                System.out.println(Thread.currentThread().getName() + " entrou no synchronized");

                if (instancia == null) {
                    System.out.println(Thread.currentThread().getName() + " vai criar a instância");
                    instancia = new Singleton();
                } else {
                    System.out.println(Thread.currentThread().getName() + " viu que a instância já foi criada");
                }
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " encontrou instancia já criada");
        }

        return instancia;
    }
}

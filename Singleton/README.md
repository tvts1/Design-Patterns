🚀 Singleton Pattern in Java: Ensuring a Single Instance
🧠 Design Pattern: Singleton
<hr>
🇺🇸 About the Singleton Pattern
The Singleton Pattern is a creational design pattern that ensures a class has only one instance throughout the entire lifecycle of an application. It also provides a global point of access to that instance.

This pattern is commonly used for managing shared resources like database connections, logging, configuration settings, or thread pools where multiple instances would lead to conflicts or resource waste.
<hr>
✅ Benefits of the Singleton Pattern:
Ensures a single instance of a class exists.

Provides a global access point to that instance.

Helps to control access to shared resources.

Promotes lazy initialization (creation only when needed).

Supports thread-safe instance creation in concurrent environments.
<hr>
🛠️ Example in this project:
We implemented a thread-safe Singleton class in Java using the Double-Checked Locking mechanism. This ensures:

The Singleton instance is created only once, even when accessed by multiple threads simultaneously.

The method to get the instance (getInstancia()) minimizes synchronization overhead by locking only when the instance is not yet created.

The use of volatile guarantees visibility of changes across threads.
<hr>
How it works in getInstancia():
First check outside the synchronized block checks if the instance already exists to avoid unnecessary synchronization.

If instancia is null, it enters a synchronized block to ensure only one thread creates the instance.

Inside the synchronized block, second check confirms that the instance was not created while waiting for the lock.

The instance is created once and only once.

Subsequent calls simply return the already created instance without locking.
<hr>
🇧🇷 Sobre o Padrão Singleton
O Padrão Singleton é um padrão de projeto criacional que garante que uma classe tenha apenas uma instância durante todo o ciclo de vida da aplicação. Ele também fornece um ponto de acesso global para essa instância.

Esse padrão é muito usado para gerenciar recursos compartilhados, como conexões de banco de dados, logs, configurações ou pools de threads, onde múltiplas instâncias poderiam causar conflitos ou desperdício de recursos.
<hr>
✅ Benefícios do Padrão Singleton:
Garante uma única instância da classe.

Fornece um ponto global de acesso a essa instância.

Ajuda a controlar o acesso a recursos compartilhados.

Permite inicialização preguiçosa (criação somente quando necessária).

Suporta a criação thread-safe em ambientes concorrentes.
<hr>
🛠️ Exemplo neste projeto:
Implementamos uma classe Singleton em Java que é thread-safe utilizando o mecanismo de Double-Checked Locking. Isso garante que:

A instância Singleton é criada apenas uma vez, mesmo que múltiplas threads acessem ao mesmo tempo.

O método getInstancia() minimiza a sincronização, travando o bloco somente quando necessário.

A palavra-chave volatile garante que as mudanças na instância sejam visíveis entre threads.
<hr>
Como funciona o método getInstancia():
A primeira checagem fora do bloco sincronizado verifica se a instância já existe para evitar sincronização desnecessária.

Se instancia for null, entra no bloco synchronized para garantir que só uma thread crie a instância.

Dentro do bloco sincronizado, a segunda checagem confirma que a instância não foi criada enquanto a thread aguardava o lock.

A instância é criada uma única vez.

Chamadas subsequentes retornam a instância já criada sem travar.


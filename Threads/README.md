# Threads em Java
> Anotações sobre **threads** na linguagemde programação Java.

## Implementação Threads
### 📔 `extends Thread`
* Sobrepor método *`run`*
* Instanciar um ou mais **objetos thread**
* Uma thread é iniciada pelo método *`start`*

### 📔 `implements Runnable` 
Em breve.

### 🤔 Classe Thread ou Interface Runnable?
Em breve.

## Encderrando Threads
* Threads não podem ser reinicializadas
* O método `isAlive()` verifica se uma Thread foi finalizada

## Prioridades
* Expressar a importância ou urgência de uma ou várias Threads
* Varia entre `Thread.MIN_PRIORITY(1)` e `Thread.MAX_PRIORITY(10)`
* Por padrão, cada novo thread tem a prioridade do Thread Pai
    * Thread principal associado com o método main tem a prioridade `Thread.NORM_PRIORITY(5)`
* Utiliza-se `getPriority` e `setPriority` para identificar e definir ou modificar a prioridade de uma thread 

## Gerenciamento
* Métodos estáticos que proveem informações sobre a thread e alteram seu estado
* Outros métodos podem ser invocados por outros threads
* `public static Thread currentThread()` retorna uma referência ao thread atual em execução

### Interrupções

### Tratatamento de interrupções

### Pausando a execução

### Aguardando o término

## Ciclo de vida

# Exercício
(Em breve)
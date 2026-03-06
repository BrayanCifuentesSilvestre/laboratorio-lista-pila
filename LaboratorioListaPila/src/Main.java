
void main() {
    //casos de Prueba

    //lista simple
    System.out.println("----------------");
    System.out.println("Lista Simple");
    ListaSimple<Integer> ls = new ListaSimple<>();
    ls.agregarInicio(10); ls.agregarInicio(5);

    System.out.println(ls.imprimir() + " - Tamaño:" + ls.size());
    ls.agregarFinal(20);
    System.out.println(ls.imprimir());

    System.out.println("Buscar Valor 10: " + ls.buscarValor(10));
    System.out.println("Remover Inicio: " + ls.removerInicio());
    System.out.println(ls.imprimir());
    System.out.println("----------------");

    //lista doble
    System.out.println("lista doble");

    DobleLista<String> ld = new DobleLista<>();
    ld.agregarFinal("A"); ld.agregarFinal("B"); ld.agregarInicio("Z");

    System.out.println(ld.imprimir());
    System.out.println("Remover: " + ld.removerFinal());
    System.out.println(ld.imprimir());
    System.out.println("----------------");

    //pila
    System.out.println("pila");
    Pila<Integer> pila = new Pila<>();
    pila.push(1); pila.push(2); pila.push(3);

    System.out.println("Peek:" + pila.peek());
    System.out.println("Pop:" + pila.pop());
    System.out.println("IsEmpty:" + pila.isEmpty());
    System.out.println("----------------");
}

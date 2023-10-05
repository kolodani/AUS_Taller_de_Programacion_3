import java.util.*;
import java.lang.*;

class Pila<T>{
	public ArrayList<T> pila;
    int tope = 10;
	Pila(){
		pila = new ArrayList<>();
	}

	public void push(T elemento){
		if(pila.size() < tope){
			pila.add(elemento);
		}
		throw new RuntimeException("La pila esta llena");
	}

	public T pop(){
		if(pila.size() > 0){
			return pila.get(pila.size() -1);
		}
		throw new RuntimeException("La pila esta vacia");
	}

    public void mostrar(){
        for (T elemento : pila) {
            System.out.print(elemento + " ");
        }
    }
}

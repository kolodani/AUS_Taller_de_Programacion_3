package Ejemplos;

public class MeCortaronElCable {

    public static void main(String[] args){
        boolean cortaronElCable = false;
        if (cortaronElCable) {
            MeCortaronElCableException mcece = new MeCortaronElCableException();
            throw mcece;
            // no pide el try catch porque esta implicito el throws en el main
        }
    }
}

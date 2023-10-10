interface Instrument {
    // Constante de tiempo de compilacion:
    int VALUE = 5; // static & final
    // No puede tener definiciones de metodos:
    void play(Note n);// Automaticamente publico
    void adjust();
}

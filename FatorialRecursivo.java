class FatorialRecursiva{
    public static int calcularFatorialRecursividade(int n) throws IllegalAccessException{

        if (n == 0)
        return 1;
        return n * calcularFatorialRecursividade(n-1);
    }
    public static void main(String[] args) {
        
        System.out.println(calcularFatorialRecursividade(5));
    }
}
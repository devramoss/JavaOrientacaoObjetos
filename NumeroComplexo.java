public class NumeroComplexo {
    private double pReal;
    private double pImaginaria;

    void inicializar(float a, float b){
        this.pReal = a;
        this.pImaginaria = b;
    }

    void imprimir(){
        if(this.pImaginaria >= 0)
            System.out.println(this.pReal + " + " + this.pImaginaria + "i");
        else
            System.out.println(this.pReal + " " + this.pImaginaria + "i");
    }

    boolean comprovarIgualdade(NumeroComplexo c){
        if(this.pReal == c.pReal && this.pImaginaria == c.pImaginaria)
            return true;
        else    
            return false;
    }

    void somar(NumeroComplexo c){
        this.pReal = this.pReal + c.pReal;
        this.pImaginaria = this.pImaginaria + c.pImaginaria;
    }

    void subtrair(NumeroComplexo c){
        this.pReal = this.pReal - c.pReal;
        this.pImaginaria = this.pImaginaria - c.pImaginaria;
    }

    void multiplicar(NumeroComplexo c){
        double aux_a = this.pReal * c.pReal - this.pImaginaria * c.pImaginaria;
        double aux_b = this.pReal * c.pImaginaria + this.pImaginaria * c.pReal;

        this.pReal = aux_a;
        this.pImaginaria = aux_b;
    }

    void dividir(NumeroComplexo c){
        double aux_a = (this.pReal*c.pReal + this.pImaginaria*c.pImaginaria)/(Math.pow(c.pReal, 2) + Math.pow(c.pImaginaria, 2));
        double aux_b = this.pImaginaria*c.pReal - this.pReal*c.pImaginaria/(Math.pow(c.pReal, 2) + Math.pow(c.pImaginaria, 2));

        this.pReal = aux_a;
        this.pImaginaria = aux_b;
    }
}

class ContaEspecial extends ContaCorrente{
    private float limite;

    private ContaEspecial(float val, int num, int pwd, float lim) {
        super(val, num, pwd);
        this.limite = lim;
    }

    //Não entendi se era pra fazer assim???????????
    public static ContaCorrente criarConta(float val, int num, int pwd, float lim) {
        if (lim == 0) {
            return new ContaComum(val, num, pwd);
        } else {
            return new ContaEspecial(val, num, pwd, lim);
        }
    }

    // Uma conta especial, que tenha um limite de crédito
    //maior que zero, pode ter o seu saldo igualado a zero sem que a
    //conta se torne inativa

    public boolean debitaValor(float val, int pwd){
        if (!isSenha(pwd))
            return  (false); //senha deve ser válida
        if(getEstado(pwd) != 1)
            return (false); //conta deve ser ativa
        if(val<=0)
            return (false); //val > 0
        if (val > getSaldo(pwd) + limite)
            return (false);

        debitaValor(val);
        if (getSaldo(pwd) + limite == 0)
            setEstado(pwd, 2);   //conta inativa (saldo + limite = 0)
        return (true);
    }

}

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }
    static void analisarCandidato (double salarioPretendido){
    
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }
        else if (salarioBase==salarioPretendido)
        System.out.println("FAZER UMA CONTRA PROPOSTA");
    else {
        System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
}
    }
    }

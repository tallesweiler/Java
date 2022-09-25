public class App {
    public static void imprimeInformacoesDaEmpresa(Empresa empresa) {
        System.out.println("\nEmpresa: " + empresa.getNome() + "\n");
        for (Departamento d : empresa.getDepartamentos()) {
            System.out.println("Departamento: " + d.getNome());
            for (Funcionarios f : d.getFuncionarios()) {
                System.out.printf("Funcionario %03d: %s (R$%.2f)\n", f.getId(), f.getNome(), f.getSalario());
            }
            System.out.println();
        }
    }

    public static void imprimeSalarioMedioETotal(Empresa empresa) {
        System.out.printf("O salario total da empresa eh de R$%.2f\n", empresa.getSalarioTotalDaEmpresa());
        System.out.printf("A media salarial da empresa eh de R$%.2f\n\n", empresa.getMediaSalarialDaEmpresa());
    }

    public static void main(String[] args) {

    Empresa positivo = new Empresa("Positivo");

    Departamento rh       = new Departamento("Recursos humanos");
    Departamento vendas   = new Departamento("Vendas");
    Departamento ti       = new Departamento("Tecnologia da Informação");
    Departamento diretor  = new Departamento("Diretoria");

    Funcionarios joão     = new Funcionarios("João Victor", 1212.53f, 1);
    Funcionarios talles   = new Funcionarios("Talles Cavalleiro", 5000f, 2);
    Funcionarios celso    = new Funcionarios("Celso Nantes", 400f, 3);
    Funcionarios bruno    = new Funcionarios("Bruno Santos", 15003f, 4);
    Funcionarios thiago   = new Funcionarios("Thiago Lahass", 400f, 5);
    Funcionarios gatti    = new Funcionarios("Gabriel Gatti", 400f, 6);

    rh.insereFuncionario(celso);
    ti.insereFuncionario(joão);
    ti.insereFuncionario(bruno);
    vendas.insereFuncionario(thiago);
    vendas.insereFuncionario(gatti);
    diretor.insereFuncionario(talles);

    positivo.insereDepartamento(rh);
    positivo.insereDepartamento(vendas);
    positivo.insereDepartamento(ti);
    positivo.insereDepartamento(diretor);

    imprimeInformacoesDaEmpresa(positivo);

    imprimeSalarioMedioETotal(positivo);
    
    positivo.aumentaSalárioFuncionários(10);
    diretor.removeFuncionario(talles);

    imprimeSalarioMedioETotal(positivo);
    }
}
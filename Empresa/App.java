public class App {
    public static void main(String[] args) {
        Empresa positivo = new Empresa("Positivo");

        Departamento rh = new Departamento("Recursos humanos");
        Departamento vendas = new Departamento("Vendas");
        Departamento ti = new Departamento("Tecnologia da Informação");
        Departamento diretor = new Departamento("Diretoria");

        Funcionários joão = new Funcionários("João Victor", 1212.53f, 1);
        Funcionários talles = new Funcionários("Talles Cavalleiro", 5000f, 2);
        Funcionários celso = new Funcionários("Celso Nantes", 400f, 3);
        Funcionários bruno = new Funcionários("Bruno Santos", 15003f, 4);
        Funcionários thiago = new Funcionários("Thiago Lahass", 400f, 5);
        Funcionários gatti = new Funcionários("Gabriel Gatti", 400f, 7);
        
        rh.insereFuncionario(celso);

        vendas.insereFuncionario(thiago);
        vendas.insereFuncionario(gatti);

        ti.insereFuncionario(joão);
        ti.insereFuncionario(bruno);

        diretor.insereFuncionario(talles);

        positivo.insereDepartamento(rh);
        positivo.insereDepartamento(vendas);
        positivo.insereDepartamento(ti);
        positivo.insereDepartamento(diretor);

        System.out.println("\nEmpresa: " + positivo.getNome() + "\n");
        for (Departamento d : positivo.getDepartamentos()) {
            System.out.println("Departamento: " + d.getNome());
            for (Funcionários f : d.getFuncionários()) {
                System.out.printf("Funcionário %03d: %s (R$%.2f)\n", f.getId(), f.getNome(), f.getSalário());
            }
            System.out.println();
        }





        
    }
}

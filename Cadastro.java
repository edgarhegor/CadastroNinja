import java.util.Scanner;

public class Cadastro {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Criação de Array
        int NUMERO_MAX = 10;
        String[] nome = new String[NUMERO_MAX];

        //Criação dos controladores
        int ninjasCadastrados = 0;
        int opcao = 0;

        // Criação do menu

        while (opcao != 5){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Editar Ninja");
            System.out.println("4. Remover Ninja");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao){

                    case 1:
                    if(ninjasCadastrados < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja: ");
                        scanner.nextLine(); //limpar buffer
                        String nomeDoNinja = scanner.nextLine();
                        nome[ninjasCadastrados] = nomeDoNinja;
                        ninjasCadastrados++;

                    }else{
                        System.out.println("Lista Cheia, não é possivel cadastrar mais nenhum Ninja.");
                    }
                    break;
                    case 2:
                        if(ninjasCadastrados == 0){
                            System.out.println("Não foi encontrado nenhum Ninja cadastrado");
                        }else{
                            System.out.println("=== Ninjas Cadastrados ===");
                            for (int i = 0; i < ninjasCadastrados; i++) {

                                System.out.println((i+1)+ "." + nome[i]);

                            }}
                            break;
                    case 3:
                        //editar
                        System.out.println("Editando Ninja: \n Digite o numero do Ninja: ");
                        int nomeEdit = scanner.nextInt();
                        int result = nomeEdit - 1;
                        scanner.nextLine();
                        System.out.println("Digite o nome do Ninja: ");
                        String novoNome = scanner.nextLine();
                        if (nome[result] != null ){
                            nome[result] = novoNome;
                            System.out.println("Ninja editado com sucesso!");
                        }else{
                            System.out.println("ERRO! Não foi possivel editar esse ninja.");
                        }
                        break;


                    case 4:
                        System.out.println("Removendo Ninja.");
                        System.out.println("Digite o número que deseja remover:");

                        int nomeRemove = scanner.nextInt();

                        int resultRemove = nomeRemove - 1;

                        if(resultRemove >= 0 && resultRemove < ninjasCadastrados){

                            for (int i = resultRemove; i < ninjasCadastrados - 1; i++) {

                                nome[i] = nome[i + 1];

                            }

                            ninjasCadastrados--;

                            System.out.println("Ninja removido com sucesso!");

                        } else {

                            System.out.println("Ninja inválido!");

                        }

                        break;





                    case 5:
                        //sair
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Numero inválido");
                        break;
            }

                }




            }
        }


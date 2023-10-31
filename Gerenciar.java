import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("Minha Biblioteca");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar autor");
            System.out.println("2 - Criar livro");
            System.out.println("3 - Criar biblioteca");
            System.out.println("4 - Adicionar livro/midia");
            System.out.println("5 - Emprestar livro/midia");
            System.out.println("6 - Devolver livro/midia");

            try {
                op = sc.nextInt();
            } catch (Exception e) {
                op = 99;
            }

            switch (op) {
                case 0: {
                    System.out.println("Sair....");
                    break;
                }
                case 1: {
                    System.out.println("Digite o nome do autor");
                    String nome = sc.next();
                    System.out.println("Digite o nacionalidade do autor");
                    String nacionalidade = sc.next();
                    new Autor(nome, nacionalidade);
                    break;
                }
                case 2: {
                    int midia = 0;
                    int posicaoAutor = -1;
                    String titulo;
                    String album;
                    do {
                        System.out.println("Qual tipo de midia você deseja criar?");
                        System.out.println("1 - Fisica");
                        System.out.println("2 - Digital");
                        System.out.println("3 - Voltar");
                        try {
                            midia = sc.nextInt();
                        } catch (Exception e) {
                            midia = 99;
                        }

                        switch (midia) {
                            case 1:
                                if (Autor.getAutores().size() <= 0) {
                                    System.out.println("Nenhum autor cadastrado");
                                    break;
                                }
                                do {
                                    Autor.listarAutores();
                                    try {
                                        posicaoAutor = sc.nextInt();
                                        if (posicaoAutor >= Autor.getAutores().size()) {
                                            throw new Exception("Autor inválido");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Autor inválido");
                                        posicaoAutor = -1;
                                    }
                                } while (posicaoAutor < 0);

                                Autor autor = Autor.getAutores().get(posicaoAutor);

                                System.out.println("Digite o titulo");
                                titulo = sc.next();
                                new Livro(titulo, autor, true);
                                break;
                            case 2:
                                System.out.println("Digite o titulo");
                                titulo = sc.next();
                                System.out.println("Digite o album");
                                album = sc.next();
                                new MidiaDigital(titulo, album, true);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }

                    } while (midia != 3);
                    break;
                }
                case 3: {
                    System.out.println("Digite o nome da biblioteca");
                    String nomeBiblioteca = sc.next();
                    new Biblioteca(nomeBiblioteca);
                    break;
                }
                case 4: {
                    int posicaoBiblioteca = -1;
                    do {
                        Biblioteca.listarBibliotecas();
                        try {
                            posicaoBiblioteca = sc.nextInt();
                            if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                    int opcaoAdiconar = 0;
                    do {
                        System.out.println("1 - Adicionar livro");
                        System.out.println("2 - Adicionar midia");
                        System.out.println("3 - Voltar");
                        opcaoAdiconar = sc.nextInt();

                        switch (opcaoAdiconar) {
                            case 1:
                                int posicaoLivro = -1;
                                do {
                                    Livro.listarLivros();
                                    try {
                                        posicaoLivro = sc.nextInt();
                                        if (posicaoLivro >= Livro.getLivros().size()) {
                                            throw new Exception("Livro inválido");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Livro inválido");
                                        posicaoLivro = -1;
                                    }
                                } while (posicaoLivro < 0);

                                Livro livro = Livro.getLivros().get(posicaoLivro);

                                biblioteca.adicionarLivro(livro);
                                break;
                            case 2:
                                int posicaoMidia = -1;
                                do {
                                    MidiaDigital.listarMidiasDigitais();
                                    try {
                                        posicaoMidia = sc.nextInt();
                                        if (posicaoMidia >= MidiaDigital.getMidiasDigitais().size()) {
                                            throw new Exception("Midia inválida");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Midia inválida");
                                        posicaoMidia = -1;
                                    }
                                } while (posicaoMidia < 0);

                                Midia midia = MidiaDigital.getMidiasDigitais().get(posicaoMidia);

                                biblioteca.adicionarMidia(midia);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }

                    } while (opcaoAdiconar != 3);
                    break;
                }
                case 5: {
                    int posicaoBiblioteca = -1;
                    do {
                        Biblioteca.listarBibliotecas();
                        try {
                            posicaoBiblioteca = sc.nextInt();
                            if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);
                    do {
                        System.out.println("O que você deseja emprestar?");
                        System.out.println("1 - Livro");
                        System.out.println("2 - Midia");
                        System.out.println("3 - Voltar");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                int posicaoLivro = -1;
                                do {
                                    biblioteca.listarLivros();
                                    try {
                                        posicaoLivro = sc.nextInt();
                                        if (posicaoLivro >= Livro.getLivros().size()) {
                                            throw new Exception("Livro inválido");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Livro inválido");
                                        posicaoLivro = -1;
                                    }
                                } while (posicaoLivro < 0);

                                Livro livro = biblioteca.getLivros().get(posicaoLivro);
                                try {
                                    livro.emprestar();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 2:
                                int posicaoMidia = -1;
                                do {
                                    biblioteca.listarMidias();
                                    try {
                                        posicaoMidia = sc.nextInt();
                                        if (posicaoMidia >= MidiaDigital.getMidiasDigitais().size()) {
                                            throw new Exception("Midia inválida");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Midia inválida");
                                        posicaoMidia = -1;
                                    }
                                } while (posicaoMidia < 0);

                                Midia midia = biblioteca.getMidia().get(posicaoMidia);
                                try {
                                    midia.emprestar();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                    } while (op != 3);
                    break;
                }
                case 6: {
                    int posicaoBiblioteca = -1;
                    do {
                        Biblioteca.listarBibliotecas();
                        try {
                            posicaoBiblioteca = sc.nextInt();
                            if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);
                    do {
                        System.out.println("O que você deseja devolver?");
                        System.out.println("1 - Livro");
                        System.out.println("2 - Midia");
                        System.out.println("3 - Voltar");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                int posicaoLivro = -1;
                                do {
                                    biblioteca.listarLivros();
                                    try {
                                        posicaoLivro = sc.nextInt();
                                        if (posicaoLivro >= Livro.getLivros().size()) {
                                            throw new Exception("Livro inválido");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Livro inválido");
                                        posicaoLivro = -1;
                                    }
                                } while (posicaoLivro < 0);

                                Livro livro = biblioteca.getLivros().get(posicaoLivro);
                                try {
                                    livro.devolver();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 2:
                                int posicaoMidia = -1;
                                do {
                                    biblioteca.listarMidias();
                                    try {
                                        posicaoMidia = sc.nextInt();
                                        if (posicaoMidia >= biblioteca.getMidia().size()) {
                                            throw new Exception("Midia inválida");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Midia inválida");
                                        posicaoMidia = -1;
                                    }
                                } while (posicaoMidia < 0);

                                Midia midia = biblioteca.getMidia().get(posicaoMidia);
                                try {
                                    midia.devolver();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                    } while (op != 3);
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}

package brComArvoreDanielKondlatsch;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AvaliacaoArvoreBinaria {

    public class Node {
        int data;
        Node esquerda, direita;
        int altura = 0;

        Node(int item) {
            data = item;
            esquerda = direita = null;
        }
    }

    Node no;

    public AvaliacaoArvoreBinaria() {
        no = null;
    }

    public void insert(int valor) {
        no = insertRec(no, valor);
    }

    public Node insertRec(Node no, int valor) {
        if (no == null) {
            no = new Node(valor);
            return no;
        }
        if (valor < no.data)
            no.esquerda = insertRec(no.esquerda, valor);
        else if (valor > no.data)
            no.direita = insertRec(no.direita, valor);
        return no;
    }

    public boolean procura(int valor) {
        return procuraRec(no, valor);
    }

    public boolean procuraRec(Node no, int valor) {
        if (no == null)
            return false;
        if (no.data == valor)
            return true;
        else if (valor < no.data)
            return procuraRec(no.esquerda, valor);
        else
            return procuraRec(no.direita, valor);
    }

    public void printarArvore() {
        if (no == null)
            JOptionPane.showMessageDialog(null, "Arvore vazia.");
        else
            printTreeRec(no);
    }

    public void printTreeRec(Node no) {
        if (no != null) {
            printTreeRec(no.esquerda);
            System.out.println(no.data);
            printTreeRec(no.direita);
        }
    }

    // print com java swing (nao consegui implementar
    public void printTreeRec2(Node no) {
        if (no != null) {
            printTreeRec2(no.esquerda);
            JOptionPane.showMessageDialog(null, no.data);
            printTreeRec2(no.direita);
        }
    }

    public void deletar(int valor) {
        no = deletaRec(no, valor);
    }

    public Node deletaRec(Node no, int valor) {
        if (no == null)
            return no;
        if (valor < no.data)
            no.esquerda = deletaRec(no.esquerda, valor);
        else if (valor > no.data)
            no.direita = deletaRec(no.direita, valor);
        else {
            if (no.esquerda == null)
                return no.direita;
            else if (no.direita == null)
                return no.esquerda;
            no.data = valorMin(no.direita);
        }
        return no;
    }

    public int valorMin(Node no) {
        int minv = no.data;
        while (no.esquerda != null) {
            minv = no.esquerda.data;
            no = no.esquerda;
        }
        return minv;
    }

    public void balancear() {
        no = balancearRec(no);
    }

    public Node balancearRec(Node no) {
        if (no == null)
            return no;
        no.esquerda = balancearRec(no.esquerda);
        no.direita = balancearRec(no.direita);
        int balance = getBalanceamento(no);
        if (balance > 1) {
            if (getBalanceamento(no.esquerda) >= 0)
                no = rotaDireita(no);
            else
                no = leftrotaDireita(no);
        } else if (balance < -1) {
            if (getBalanceamento(no.direita) <= 0)
                no = rotaEsquerda(no);
            else
                no = rotaEsqDireit(no);
        }
        return no;
    }

    public int getBalanceamento(Node no) {
        if (no == null)
            return 0;
        return getAltura(no.esquerda) - getAltura(no.direita);
    }

    public int getAltura(Node no) {
        if (no == null)
            return 0;
        return no.altura;
    }

    public Node rotaDireita(Node no) {
        Node temporario = no.esquerda;
        no.esquerda = temporario.direita;
        temporario.direita = no;
        no.altura = Math.max(getAltura(no.esquerda), getAltura(no.direita)) + 1;
        temporario.altura = Math.max(getAltura(temporario.esquerda), getAltura(temporario.direita)) + 1;
        return temporario;
    }

    public Node rotaEsquerda(Node no) {
        Node temporario = no.direita;
        no.direita = temporario.esquerda;
        temporario.esquerda = no;
        no.altura = Math.max(getAltura(no.esquerda), getAltura(no.direita)) + 1;
        temporario.altura = Math.max(getAltura(temporario.esquerda), getAltura(temporario.direita)) + 1;
        return temporario;
    }

    public Node leftrotaDireita(Node no) {
        no.esquerda = rotaEsquerda(no.esquerda);
        return rotaDireita(no);
    }

    public Node rotaEsqDireit(Node no) {
        no.direita = rotaDireita(no.direita);
        return rotaEsquerda(no);
    }

    // primeira forma que pensei em fazer balanceamento da arvore
    public int balancearArv(Node no) {
        if (no == null) {
            return 0;
        }

        int alturaArvoreSubEsquerda = balancearArv(no.esquerda);
        if (alturaArvoreSubEsquerda == -1) {
            return -1;
        }

        int alturaArvoreSubDireita = balancearArv(no.direita);
        if (alturaArvoreSubDireita == -1) {
            return -1;
        }

        if (Math.abs(alturaArvoreSubEsquerda - alturaArvoreSubDireita) > 1) {
            return -1;
        }
        return (Math.max(alturaArvoreSubEsquerda, alturaArvoreSubDireita) + 1);
    }

    public void preOrdem(AvaliacaoArvoreBinaria.Node no) {
        if (no != null) {
            System.out.print(no.data + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public void preOrdem() {

        preOrdem(no);
    }

    public void emOrdem(AvaliacaoArvoreBinaria.Node no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.data + " ");
            emOrdem(no.direita);
        }
    }

    public void emOrdem() {
        emOrdem(no);
    }

    public void posOrdem() {
        posOrdem(no);
    }

    public void posOrdem(AvaliacaoArvoreBinaria.Node no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.print(no.data + " ");
        }
    }

    public static void main(String[] args) {
        // coloquei em try porque acusava do codigo vazar
        try (Scanner sc = new Scanner(System.in)) {
            AvaliacaoArvoreBinaria arvore = new AvaliacaoArvoreBinaria();
            int escolha, valor;
            while (true) {
                escolha = Integer
                        .parseInt(JOptionPane.showInputDialog(null,
                                "1. Inserir\n2. Procurar\n3. Exibir arvore\n4. Excluir valor\n5. Sair: "));
                switch (escolha) {
                    case 1:

                        valor = Integer
                                .parseInt(JOptionPane.showInputDialog(null,
                                        "Digite o valor que deseja inserir: "));
                        arvore.insert(valor);
                        break;
                    case 2:
                        valor = Integer
                                .parseInt(JOptionPane.showInputDialog(null,
                                        "Digite o valor que deseja procurar: "));
                        if (arvore.procura(valor))
                            JOptionPane.showMessageDialog(null, valor + " está na arvore");
                        else
                            JOptionPane.showMessageDialog(null, valor + " não está na arvore");
                        break;
                    case 3:
                        arvore.balancear();
                        arvore.printarArvore();
                        System.out.println("\n");
                        arvore.balancearArv(arvore.no);
                        arvore.preOrdem();
                        System.out.println("\n");
                        arvore.emOrdem();
                        System.out.println("\n");
                        arvore.posOrdem();
                        break;
                    case 4:
                        valor = Integer
                                .parseInt(JOptionPane.showInputDialog(null,
                                        "Digite o valor que deseja deletar: "));
                        arvore.deletar(valor);
                        break;
                    case 5:
                        System.exit(0);
                }
            }

        }

    }

}

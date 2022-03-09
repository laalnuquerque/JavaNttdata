package br.com.padraopacote.mentoriajava;


public class Arrays {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //char '\u0000' ' '
        //boolean false
        //reference null

        int[] idade = new int[3];
        idade[0] =20;
        idade[2] =30;
        idade[1] =40;

        System.out.println("Idade 1: " + idade[0]);

        for(int i = 0; i < 3; i++) {
            System.out.println(idade[i]);
        };

        int [] numeros = new int[5];
        int [] numeros2 = {1, 2, 3, 4, 5};
        int [] numeros3 = new int[]{1, 2, 3, 4, 5};

        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);

        }

        for(int aux : numeros2){
            System.out.println(aux);
        }

        String [] nomes = {"Juju", "Luka", "Mari"};

        for(String aux1 : nomes){
            System.out.println(aux1);
        }

        int[] [] dias = new int[2] [2];
        dias [0] [0] = 30;
        dias [0] [1] = 31;
        dias [1] [0] = 29;
        dias [1] [1] = 28;

        for( int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
            for(int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for(int [] ref : dias ){
            for(int dia : ref){
                System.out.println("For it " + dia);
            }
        }

        int [] [] data = new int[3][];
        data[0] = new int[2];
        data[1] = new int[]{1, 2, 3};
        data[2] = new int[4];

        for(int [] arr : data){
            for(int num : arr){
                System.out.println("Data " + num);
            }
        }



    }
}



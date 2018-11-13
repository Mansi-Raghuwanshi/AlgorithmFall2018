package edu.neu.coe.info6205.symbolTable;



import java.util.Random;

public class Main {



        public static void main(String[] args){


            System.out.println("--------------------------- Tree with 100 nodes----------------------");

            BSTSimple<Integer, Integer> bst = new BSTSimple<Integer, Integer>();

            Random random = new Random();


            for(int i=0; i<100; i++){
                int key = random.nextInt();
                int value = random.nextInt();
                bst.put(key,value);
            }


            int size = bst.size();
            System.out.println("-------------------Below are the parameter measures for 100 node tree------------------");
            System.out.println("Size --> "+size);
            int depthOfTree = bst.depth();
            System.out.println("Depth--> : "+depthOfTree);
            System.out.println("log N -->"+size+" O(ln N) = "+Math.log(size));
            System.out.println(" O(SquareRoot(N)) = "+Math.sqrt(size));



            int N= 100;
            for (int i=0;i<30;i++){
                N = N+ 10000;


                //-----------------------------------------------
                Random r2 = new Random();

                System.out.println("----------------- Tree metrics "+N+" after randomized input -----------------");

                for (int i1=0; i1<N; i1++){

                    int choose = random.nextInt(3);
                    Integer key1 = (Integer)random.nextInt(200);


                    int value = r2.nextInt();

                    if(choose == 0){
                        bst.put(key1,value);
                    }
                    else if (choose == 1){
                        bst.delete(key1);
                    }
                    else if (choose == 2){
                        bst.get(bst.getRoot(),key1);
                    }
                }



                int sizeAfterOperations = bst.size();
                System.out.println("Size of the tree--> "+sizeAfterOperations);

                int heightAfterOperations = bst.depth();
                System.out.println("Depth -->"+heightAfterOperations);
                System.out.println("log(N)--> "+(Math.log(sizeAfterOperations)/Math.log(2)));
                System.out.println("O(sqaure root of N)--> "+Math.sqrt(sizeAfterOperations));




                //------------------------------------------------

            }
        }
    }





# AlgorithmFall2018

PSA Assignment 5:
Section 2


Test cases passed:
 

Calculation of depth with its helper:
//helper function to calculate depth of the tree
public int depth() {
    return depthBST(root);
}

////function to calculate depth of the tree
private int depthBST(Node node) {
    if (node == null) {
        return 0;
    } else {
        int rightdepth = depthBST(node.larger);
        int leftdepth = depthBST(node.smaller);


        if (leftdepth > rightdepth) {
            return (1 + leftdepth);
        } else
            return (1 + rightdepth);


    }

}


Analysis of Insertion and deletions with different random inputs /code output:
 


Observation table out of the testing:

So from the above table we observe that the depth/height of a Binary Search Tree after N and insertions is  proportional to the square root of N. 

Size of the tree N	O(lg N)	O(N^1/2)	Depth
474	8.35	19.23	22
328	8.37	18.11	24
457	8.83	21.37	20
100	4.06	10	13
407	8.66	22.97	23
435	8.76	20.17	23
322	8.33	17.94	24
481	8.9	21.93	25
Average of all the Depth	21.75
Average of all the O(N^1/2)	19.96


Graph plotted:
  


Conclusion with the above proof of concept :
When the we randomly input the values starting from 100 node tree growing upto 1000 and keep on adding 10000  nodes each time, we observe that the depth/height of a Binary Search Tree after N and insertions is  proportional to the square root of N.


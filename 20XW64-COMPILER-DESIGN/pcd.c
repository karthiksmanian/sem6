#include<stdio.h>
int main()
{

    int nstates;
    int i,j;
    printf("Enter the number of states:\n");
    scanf("%d",&nstates);

    int nterminals;
    printf("Enter the size of terminal set\n");
    scanf("%d",&nterminals);

    char* states[nstates][nterminals+1];
    //printf("%d",sizeof(states));
    //printf("\n");
    //printf("%d",sizeof(c));

    //terminals are assumed to be ab or abc

    for(i=0;i<nstates;i++){
        printf("Enter the states :\n");
        char* c=malloc(2*sizeof(char));
        scanf("%s",c);
        states[i][0] = c;

        printf("Enter the reaching states: N for null:\n");
        for(j=1;j<=nterminals;j++){
            char* c=malloc(2*sizeof(char));
            scanf("%s",c);
            states[i][j] = c;
        }
    }

    printf("The NFA is: \n");
    for(i=0;i<nstates;i++){
        for(j=0;j<=nterminals;j++){
            printf("%s\t",states[i][j]);
        }
        printf("\n");
    }


    char* DFA[100][nterminals+1];
    int n;



    return 0;
}

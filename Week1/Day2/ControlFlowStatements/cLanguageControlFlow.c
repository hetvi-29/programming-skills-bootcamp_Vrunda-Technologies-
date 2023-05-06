#include <stdio.h>
void main()
{
    int x = 5, y = 2, z = 1;
    if (x > 0){
        printf("x is positive");
    }
    if (x > y){
        printf("x is greater than y");
    }
    else{
        printf("y is greater than x");
    }
    if (x > y && x > z) {
        printf("x is large");
    }
    else if (y > x && y > z){
        printf("y is large");
    }
    else if (z > x && z > y){
        printf("z is large");
    }
    else{
    }
    if (x > y){
        if (x > z){
            printf("x is large");
        }
        else{
            printf("z is large");
        }
    }
    else{
        if (y > z){
            printf("y is large");
        }
        else{
            printf("z is large");
        }
    }
    switch (x)
    {
        case 1:
            printf("Hi");
            break;
        case 34:
            printf("Hello");
            break;
        default:
            printf("world");
    }
}

#include <stdio.h>

#include <stdlib.h>
int main(void) {
  float soma = 0;
  float media, numero;
  
  for(int i = 0; i < 3; i++){
    printf("Digite um numero: ");
    scanf("%f", &numero);
    soma += numero;
  }
  media = soma / 3;
  printf("Media = %.1f\n", media);

  system("pause");

  return 0;
}
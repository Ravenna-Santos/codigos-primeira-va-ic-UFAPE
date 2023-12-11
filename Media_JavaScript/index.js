const prompt = require('prompt-sync')();

let soma = 0;

for (let i = 0; i < 3; i++) {
  let numero = parseFloat(prompt("Digite um número: "));
  soma += numero;
}

let media = soma / 3;

console.log(`Média = ${media.toFixed(1)}`);

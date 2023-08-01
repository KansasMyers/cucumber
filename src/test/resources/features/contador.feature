# language: pt
Funcionalidade: Contador

  Cenário: Deve incrementar contador corretamente
    Dado que o valor do contador é 15
    Quando eu incrementa-lo em 3
    Então o valor será 18

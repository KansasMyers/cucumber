# language: pt
Funcionalidade: Testa compra de tickets
	Funcionalidade criada para que se possa aprender e testar habilidade com Regex.

  Cenário: Deve criar steps genericos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é Fulano da Silva
    Dado que o telefone do passageiro é 9999-9999
    
  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    Dado que o ticket especial é AB167
    Dado que o valor da passagem é R$ 1120,23
    Dado que o nome do passageiro é Cicrano de Oliveira
    Dado que o telefone do passageiro é 9888-8888

  Cenário: Deve negar os steps "Dado" dos cenários anteriores
    Dado que o ticket é CD123
    Dado que o ticket especial é AG1234
    Dado que o valor da passagem é R$ 1.1120,23
    Dado que o nome do passageiro é Beltrano Souza de Matos de Alcântara de Azevedo
    Dado que o telefone do passageiro é 1234-5678
    Dado que o telefone do passageiro é 999-2223
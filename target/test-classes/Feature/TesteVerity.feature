
@tag
Feature: Validacao e Acesso ao Site 



@tag1
  Scenario: validacao de Titulo culture and tech
  Given que o usuario acesse a url "https://www.verity.com.br/en"
  When selecionar a aba Verity
  Then valido a mensagem culture and tech

@tag2  
  Scenario: validacao de Titulo Nossas solucoes
  Given que o usuario acesse a url "https://www.verity.com.br/nosso-jeito"
  When selecionar a aba Verity
  Then valido a mensagem Nossas solucoes
 
  
  @tag3
  Scenario: Acesso e validacao do site 
  Given que o usuario acesse a url "https://www.verity.com.br/nosso-jeito"
  And selecionar a aba Contato
  When preencher o formulario Vamos conversar
  And selecionar o checkbox Aceito receber mensagens da Verity
  Then clicar no botao enviar
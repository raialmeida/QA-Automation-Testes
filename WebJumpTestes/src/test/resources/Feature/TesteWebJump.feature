
Feature: Crie um cenario onde clicamos nos botoes "One", "Two, e "Four", 
depois verifique a ausencia dos mesmos

Scenario: Clicar no botao "One", "Two, e "Four" e verifique a ausencia dos mesmos

Given que eu acesse a pagina https://webjump-user.github.io/testqa/
When no painel Buttons e exibido os botoes 'One', 'Two', e 'Four'
And clicar no botao 'One', 'Two', e 'Four'
Then verificar se os botoes ainda estao na tela


#Cen�rio:  Dentro da mesma p�gina, clique nos bot�es "One", "Two" e "Four" 
#que encontram-se dentro do painel "IFRAME BUTTONS" e valide a n�o-presen�a dos mesmos.
#Dado que eu acesse a p�gina https://webjump-user.github.io/testqa/
#Quando no painel IFrame Buttons e exibido os botoes "One", "Two, e "Four"
#E clicar no botao "One", "Two, e "Four"
#Entao os botoes n�o devem esta presente na tela.


#Cen�rio: No cen�rio final, iremos preencher o campo "YourFirstName" com um texto qualquer. 
#Clique no bot�o "One", cheque a op��o "OptionThree", selecione a op��o "ExampleTwo" 
#dentro da select box, e valide a presen�a da imagem do logo do "Selenium Webdriver".

#Dado que eu acesse a p�gina https://webjump-user.github.io/testqa/
#Quando digito no campo YourFirstName com o texto qualquer.
#E clicar no botao "One" 
#E clicar cheque a op��o "OptionThree"
#E Selecionar a op��o "ExampleTwo" 
#Ent�o validar imagem "Selenium Webdriver"















Feature: Crie um cen�rio onde clicamos nos botoes "One", "Two, e "Four", 
depois verifique a ausencia dos mesmos e validar a imegem do logo selenium

Scenario: Clicar no botao "One", "Two, e "Four" e verifique a ausencia dos mesmos

Given que eu acesse a pagina https://webjump-user.github.io/testqa/
When no painel Buttons e exibido os botoes 'One', 'Two', e 'Four'
And clicar no botao 'One', 'Two', e 'Four'
Then verificar se os botoes ainda estao na tela
Then Fecha navegador

Scenario: Clicar no botao "One", "Two, e "Four" e verifique a ausencia dos mesmos 
do painel "IFRAME BUTTONS"

Given que eu acesse a pagina https://webjump-user.github.io/testqa
When  no painel iframe buttons Buttons e exibido os botoes 'One', 'Two', e 'Four'
And   clicar no botao 'One', 'Two', e 'Four'do painel IFRAME BUTTONS
Then  verificar se os botoes ainda estao na tela do painel IFRAME BUTTONS

Scenario: Preencher no campo 'YourFirstName' clicar no botao 'One' cheque a op��o "OptionThree", 
selecione a op��o "ExampleTwo" dentro da select box e validar a presen�a da imagem do logo do "Selenium Webdriver"


Given Que acesse a pagina https://webjump-user.github.io/testqa
When digita no campo YourFirstName com o texto
And clicar no botao One
And cheque a opcao OptionThree
When selecione a opcao ExampleTwo dentro da select box
Then validar a presenca da imagem do logo do Selenium Webdriver
#Then Fecha navegador



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














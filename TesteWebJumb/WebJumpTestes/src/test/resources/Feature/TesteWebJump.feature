
Feature: Crie um cenario onde clicamos nos botoes "One", "Two, e "Four", 
depois verifique a ausencia dos mesmos e validar a imegem do logo selenium

Scenario: 1 Clicar no botao "One", "Two, e "Four" e verifique a ausencia dos mesmos

Given que eu acesse a pagina
When no painel Buttons e exibido os botoes 'One', 'Two', e 'Four'
And clicar no botao 'One', 'Two', e 'Four'
Then verificar se os botoes ainda estao na tela
Then Fecha navegador

Scenario: 2 Clicar no botao "One", "Two, e "Four" e verifique a ausencia dos mesmos 
do painel "IFRAME BUTTONS"

Given que eu acesse o Iframe
When  no painel iframe buttons Buttons e exibido os botoes 'One', 'Two', e 'Four'
And   clicar no botao 'One', 'Two', e 'Four'do painel IFRAME BUTTONS
Then  verificar se os botoes ainda estao na tela do painel IFRAME BUTTONS
Then Fecha Chrome

Scenario: 3 Preencher no campo 'YourFirstName' clicar no botao 'One' cheque a opção "OptionThree", 
selecione a opcao "ExampleTwo" dentro da select box e validar a presença da imagem do logo do "Selenium Webdriver"


Given que eu acesse a pagina principal
When digita no campo YourFirstName com o texto
And clicar no botao One
And cheque a opcao OptionThree
And selecione a opcao ExampleTwo dentro da select box
Then validar a presenca da imagem do logo do Selenium Webdriver
Then Fecha Browser






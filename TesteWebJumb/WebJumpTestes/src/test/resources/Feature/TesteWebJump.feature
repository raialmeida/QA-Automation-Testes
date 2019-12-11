
Feature: Crie um cenario onde clicamos nos botoes "One", "Two, e "Four", 
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

Scenario: Preencher no campo 'YourFirstName' clicar no botao 'One' cheque a opção "OptionThree", 
selecione a opcao "ExampleTwo" dentro da select box e validar a presença da imagem do logo do "Selenium Webdriver"


Given Que acesse a pagina https://webjump-user.github.io/testqa
When digita no campo YourFirstName com o texto
And clicar no botao One
And cheque a opcao OptionThree
When selecione a opcao ExampleTwo dentro da select box
Then validar a presenca da imagem do logo do Selenium Webdriver
#Then Fecha navegador



#Cenário:  Dentro da mesma página, clique nos botões "One", "Two" e "Four" 
#que encontram-se dentro do painel "IFRAME BUTTONS" e valide a não-presença dos mesmos.
#Dado que eu acesse a página https://webjump-user.github.io/testqa/
#Quando no painel IFrame Buttons e exibido os botoes "One", "Two, e "Four"
#E clicar no botao "One", "Two, e "Four"
#Entao os botoes não devem esta presente na tela.


#Cenário: No cenário final, iremos preencher o campo "YourFirstName" com um texto qualquer. 
#Clique no botão "One", cheque a opção "OptionThree", selecione a opção "ExampleTwo" 
#dentro da select box, e valide a presença da imagem do logo do "Selenium Webdriver".

#Dado que eu acesse a página https://webjump-user.github.io/testqa/
#Quando digito no campo YourFirstName com o texto qualquer.
#E clicar no botao "One" 
#E clicar cheque a opção "OptionThree"
#E Selecionar a opção "ExampleTwo" 
#Então validar imagem "Selenium Webdriver"














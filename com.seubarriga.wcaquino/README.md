# automacaodetesteweb


O ambiente de textweb foi criado na Ide "IntelliJ IDEA".

Objetivos:

O text foi criado para fazer a validação e Acegurar que todos os campos solicitados ao longo do text, passem com o preenchimento correto.
Sabendo que todos os campos são obrigatórios, não se consegue continuar com o text sem preencher os campos corretamente.
O campo de login, o email e senha tem que ser válidos, caso contrário, não tem como acessar o sistema.
Após o acesso com os campos corretamente preenchidos, segue o text.
Na adição de usuario "conta", déve-se preencher o campo nome e clicar em salvar.
com a mensagem de sucesso identificada na criação, na próxima tela, a criação de movimentação.
na tela que abrir, todos os campos são obrigatórios, "verificado em text com campos vasios, o text não passa".
Ao preencher os campos e clicar em salvar, póde-se finalizar o text clicando no menu contas, listar e excluir atual criada.
Mas também antes de excluir pode editar caso queira ou seja exigido.
Este foi o resumo do que foi feito no decorrer do text.


Criação do textWeb:

foi criado em Maven e suas dependências:
selenium-java
versão 4.0.0-alpha-4

dependências junit5
junit-jupiter-api
versão 5.6.0

junit-jupiter-engine
versão 5.6.0

dependência do Boni Garcia
webdrivermanager
versão 3.8.1

foi criado no sistema de desenvolvimento os seguintes pacotes com suas respectivas classes na órdem.

appobjects
	LoginAppObject
AdiçãoDeUsuarioAppObject
CriaçãoDeMovimentaçãoAppObject
ExclusãoDeContaAppObject

tasks
LoginTask
AdiçãoDeUsuarioTask
CriaçãoDeMovimentaçãoTask
VerificaçãoDeResumoMençalTask
ExclusãoDeContaTask

TestCases
 ExecuçãoTestCase

 Na execução de test case, estão todas ações para o teste.
 dentro desta classe se encontra toda ação com os importes de

 @Beforeach
 @Text
 @AfterEach

 teste criado e executado no navegador google Chrome.

 finalizado com:
 driver.quit;

para obter este text, basta baixar no git ou clonar, não foi testado em outra Ide, mas está funcional em qualquer uma.

Autor do text:
Marcos Alan Schussler.
# automatizandosite

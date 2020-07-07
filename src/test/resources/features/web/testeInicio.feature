#language: pt
#enconding: UTF-8
#author: iuriraredu
#date: 03/07/2020
#version: 1.0

  Funcionalidade: Excluir publicação

    @login @web
    Cenario: Realizar login na aplicação com usuário cadatrado para realizar exclusão de postagem no perfil
      Dado realizo login com usuário "Cadastrado"
      E acesso perfil clicando em "Iuri Ramos Reducino"
      Quando exclui publicação
      Então exibe mensagem "Sua publicação foi excluída."

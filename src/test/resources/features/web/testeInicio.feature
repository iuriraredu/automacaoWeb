#language: pt
#enconding: UTF-8
#author: iuriraredu
#date: 03/07/2020
#version: 1.0

  Funcionalidade: Validar Login da aplicação

    @login @web
    Cenario: Realizar login na aplicação com usuário cadatrado
      Dado preencho os dados de login com usuário "Cadastrado"
      Quando clico em "Entrar"
      Entao visualizo a tela inicial com o meu usuário logado



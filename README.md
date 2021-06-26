# cliente-servidor-rmi
Aplicação que redireciona reclamações de cidadãos para diferentes unidades.

## Descrição do problema
Implemente um servidor que recebe reclamações de cidadãos de uma cidade e encaminha as reclamações para os órgãos competentes. Definir tipos de reclamações, sua prioridade de atendimento (URGENTE, ALTA, MEDIA, BAIXA) e os respectivos órgãos que irão atendê-las. P.ex.: incêndio encaminha para bombeiro, buraco na via encaminha para prefeitura, etc.

## Como compilar
Primeiro executa-se o servidor
- javac SearchServer.java
- java SearchServer

Depois executa-se os clientes que serão unidades responsáveis
- javac Policia.java
- java Policia
- javac Bombeiros.java
- java Bombeiros

Depois executa-se os clientes que serão cidadãos
- javac ClientRequest.java
- java ClientRequest


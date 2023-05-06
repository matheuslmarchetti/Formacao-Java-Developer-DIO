### Descrição

O projeto consiste em utilizar o Docker Compose para executar uma aplicação WEb em um Container Apache.

A aplicação web é um simple relógio digital em HTML5, CSS3 e JavaScript
O código fonte desse relógio digital foi retirado de <a href="http://https://github.com/coffeewithprogramming/Digital-Clock" target="_blank" rel="noopener noreferrer">coffeewithprogramming</a>

##### PASSO A PASSO DO DESAFIO:

**1.** Criar um arquivo YML com as definições de um servidor Apache (httpd);<br />
**2.** Especificar no arquivo YML o local onde os arquivos da aplicação estarão. A aplicação pode ser um simples Hello World.<br />
**3.** Subir o arquivo YML e a aplicação para um repositório no GitHub;<br />

##### Rodando a aplicação

```bash
# Iniciar o container
$ docker-compose up

# Remover o container
$ docker-compose down
```
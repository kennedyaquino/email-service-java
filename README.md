# Email Service

### 💻 Projeto

Este projeto surgiu como parte de um estudo sobre aplicações baseadas em microserviços, tendo como destaque o desenvolvimento de um serviço de e-mail. Esse serviço oferece um endpoint para o envio de mensagens, permitindo a conexão com servidores de e-mail em nuvem, como o SES da AWS, e a capacidade de adicionar outros servidores sem afetar a lógica de negócio do sistema  

### 🚀 Tecnologias

- Java
- Spring Boot
- AWS SES

### 📋 Pré-requisitos

- Java

### 🔧 Instalação

1. Clone este repositório:

```
git clone https://github.com/kennedyaquino/email-service-java.git
```

2. Configure as variaveis de ambiente adicionando os dados SES da AWS para leitura no arquivo application.properties, ou se desejar implementar a conexão a outros servidores de email.
```
aws.accessKeyId:CHAVE DE ACESSO
aws.secretKey:CHAVE SECRETA DE ACESSO
aws.region: REGIAO DA AWS
emailsource: E-MAIL CADASTRADO PARA ENVIOS
```


3. Na pasta raiz do projeto execute a aplicação pela linha de comando:
```
mvn spring-boot:run
```

4. Acesse endpoint ``` http://localhost:8080/api/email``` com uma ferramenta API Client de sua escolha,  passando o seguinte json no body:
```json
{
  "to": "email de destino",
  "subject": "assunto da mensagem",
  "body": "corpo da mensagem"
}
```

5. Esta aplicação está documentada pelo Swagger e pode ser acessada pelo endpoint ``` http://localhost:8080/swagger-ui/``` e os endpoints da aplicação podem ser testado pela interface da documentação.

### 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

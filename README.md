# 💱 Conversor de Moedas

Este é um projeto em Java para conversão de moedas, utilizando uma API para obter taxas de câmbio atualizadas. Ele permite ao usuário escolher o idioma (Português ou Inglês), realizar conversões e visualizar o histórico das transações.

## 🚀 Funcionalidades

- 🔄 Conversão entre moedas
- 📜 Histórico das conversões realizadas
- 🧾 Interface de linha de comando amigável

## 🛠️ Tecnologias Utilizadas

- Java 17+
- API de câmbio (Ex: exchangerate.host)
- Biblioteca GSON
- Formatação personalizada de saída

## 📂 Estrutura do Projeto

```text
conversorDeMoedas/
├── src/
│   ├── ApiCliente.java
│   ├── ConversorMoedas.java
│   ├── EntradaUsuario.java
│   ├── SaidaFormatada.java
│   ├── HistoricoConversoes.java
│   ├── Principal.java
│   ├── Mensagens.java
│   └── resources/
│       ├── mensagens_pt.properties
│       └── mensagens_en.properties
├── README.md
└── .gitignore


🧠 Melhorias futuras
Interface gráfica (GUI com JavaFX ou Swing)

Suporte a mais idiomas

Exportar histórico para CSV ou PDF

Cache de taxas para evitar requisições repetidas

👩‍💻 Autor
Patrícia Starck Bernardi

📫 LinkedIn
https://www.linkedin.com/in/patricia-starck-bernardi/

💻 Projeto criado com fins educacionais no curso da Alura + Oracle ONE

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

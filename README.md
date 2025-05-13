# 💱 Conversor de Moedas em Java

Um aplicativo simples de conversão de moedas com suporte a múltiplos idiomas, integração com uma API de câmbio e histórico de conversões. Ideal para praticar Java, API REST, internacionalização (i18n) e boas práticas de terminal interativo.

---

## 🚀 Funcionalidades

- ✅ Conversão em tempo real de uma moeda para outra.
- 🌍 Suporte a múltiplos idiomas (Português 🇧🇷 e Inglês 🇺🇸).
- 📈 Histórico das últimas conversões realizadas.
- 🧾 Validação de entrada do usuário.
- 🔗 Integração com a [ExchangeRate API](https://www.exchangerate-api.com/).

---

## 🎥 Demonstração

<img src="https://user-images.githubusercontent.com/your-github/terminal-demo.gif" alt="Demonstração no terminal" width="700"/>

---

## 🛠️ Tecnologias usadas

- Java 17+
- API HTTP nativa (`java.net.http.HttpClient`)
- Internacionalização com `ResourceBundle`
- Terminal interativo com `Scanner`
- Estilização ANSI para saída formatada

---

## 📦 Estrutura do projeto

conversorDeMoedas/
├── src/
│ ├── ApiCliente.java
│ ├── ConversorMoedas.java
│ ├── EntradaUsuario.java
│ ├── SaidaFormatada.java
│ ├── HistoricoConversoes.java
│ ├── Principal.java
│ ├── Mensagens.java
│ └── resources/
│ ├── mensagens_pt.properties
│ └── mensagens_en.properties
├── README.md
└── .gitignore


---

## 📋 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversorDeMoedas.git
   cd conversorDeMoedas

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

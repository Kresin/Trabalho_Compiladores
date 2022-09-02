# Trabalho de Compiladores #

### Alunos ###
* Gabriel Kresin
* Vinícius Zoz
* Haziel Albuquerque Netto

### Discord ###
https://discord.gg/vPfkXE2z

### Checklist Trabalho - Parte 1 ###

- [x] A interface do compilador deve ter os seguintes componentes: uma barra de ferramentas (com tamanho mínimo
900x70), uma área para edição de programas – editor, uma área para visualização das mensagens e uma
barra de status (com tamanho mínimo 900x25), dispostos conforme Figura 1.
- [ ] Deve ser possível minimizar, maximizar, fechar e alterar o tamanho da janela, sendo 910x600 o tamanho
mínimo da janela. Todos os componentes de interface devem ficar totalmente visíveis, como mostrado na
Figura 1, independente do tamanho da janela.
- [x] Quando o tamanho for alterado ou a janela for maximizada, os componentes da interface também devem ter o
tamanho alterado, acompanhando a alteração feita (aumentar ou diminuir o tamanho do componente em
questão), considerando que: a barra de ferramentas deve ser redimensionada na horizontal, mas os botões não
devem ter o tamanho alterado; o editor deve ser redimensionado na horizontal e na vertical; a área para
mensagens deve ser redimensionada na horizontal e na vertical, a barra de status deve ser redimensionada na
horizontal.
- [ ] Deve ser possível alterar o tamanho vertical do editor e da área para mensagens movendo a barra de divisão
existente entre eles.
- [x] Deve apresentar o número da linha, à esquerda, iniciando em 1. Não deve ser possível alterar o número da
linha.
- [x] Deve possuir barras de rolagem (horizontal e vertical), que devem ser visualizadas, mesmo sem texto editado.
- [x] Não deve ser possível editar texto na área para mensagens.
- [x] Deve possuir barras de rolagem (horizontal e vertical), que devem ser visualizadas mesmo sem mensagens.
- [x] Deve mostrar a pasta e o nome do arquivo aberto.
- [x] Deve possuir botões com ações para: manipulação de arquivos (novo, abrir, salvar), edição de textos (copiar,
colar, recortar), compilação de programas (compilar) e informações sobre o compilador (equipe). Os botões
devem estar dispostos na ordem descrita, ou seja, primeiro os botões para manipulação de arquivos, seguidos
dos botões para edição de texto, e assim sucessivamente.
- [X] Cada botão deve possuir: um ícone, um nome e a indicação da tecla de atalho associada. O nome e a
indicação da tecla de atalho associada aos botões devem ser: novo [ctrl-n], abrir [ctrl-o], salvar [ctrl-s], copiar
[ctrl-c], colar [ctrl-v], recortar [ctrl-x], compilar [F7], equipe [F1].
- [x] Quando o botão novo for pressionado (ou a tecla de atalho correspondente), a ação deve ser: limpar o editor,
limpar a área para mensagens e limpar a barra de status.
- [x] Quando o botão abrir for pressionado (ou a tecla de atalho correspondente), a ação deve ser: possibilitar a
seleção de pasta/arquivo, carregar o arquivo selecionado no editor, limpar a área para mensagens e atualizar a
barra de status. Caso nenhum arquivo seja selecionado, o estado da interface, anterior ao botão abrir ser
pressionado, deve ser mantido, ou seja, o editor deve manter o texto que está sendo editado, a área para
mensagens não deve ser limpa e a barra de status não deve ser atualizada. Devem ser abertos arquivos texto
(extensão .txt) compatíveis com o Notepad.
- [x] Quando o botão salvar for pressionado (ou a tecla de atalho correspondente), a ação deve ser: (1) se o arquivo
for novo, possibilitar a seleção de pasta/nome do arquivo, salvar o conteúdo do editor no arquivo com o nome e
no local selecionados, manter no editor o texto que está sendo editado, limpar a área para mensagens e
atualizar a barra de status; (2) caso contrário, salvar as alterações do arquivo editado, manter no editor o texto
que está sendo editado, limpar a área para mensagens2 e manter a barra de status. Devem ser salvos
arquivos texto (extensão .txt) compatíveis com o Notepad.
- [ ] A ação associada a cada um dos botões de edição e as teclas de atalho associadas (copiar, colar, recortar) é
a mesma encontrada nos editores de texto convencionais. 
- [ ] Quando o botão compilar for pressionado (ou a tecla de atalho correspondente), a ação deve ser: apresentar
mensagem (compilação de programas ainda não foi implementada) na área para mensagens.
- [ ] Quando o botão equipe for pressionado (ou a tecla de atalho correspondente), a ação deve ser: apresentar os
nomes dos componentes da equipe de desenvolvimento do compilador na área para mensagens.

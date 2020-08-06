
function limpa_formulário_cnpj() {

    //Limpa valores do formulário de cep.
    document.getElementById('txtRazaoSocial').value = ("");
    document.getElementById('txtCepReceita').value = ("");
    document.getElementById('txtCnpj').value = ("");
    //  document.getElementById('txtDtaAbertura').value = ("");
    
}

function formatDate(date) {

    var d = new Date(date),
            month = '' + (d.getMonth() + 1),
            day = '' + d.getDate(),
            year = d.getFullYear();

    if (month.length < 2)
        month = '0' + month;
    if (day.length < 2)
        day = '0' + day;

    return [year, day, month].join('-');
    
}

function meu_callback(conteudo) {

    if (!("erro" in conteudo)) {
        //Atualiza os campos com os valores.

        document.getElementById('txtRazaoSocial').value = (conteudo.nome);
        document.getElementById('txtCepReceita').value = (conteudo.cep);
      //  document.getElementById('txtDtaAbertura').value = formatDate(conteudo.data_situacao);

    } //end if.
    else {
        //Cnpj não Encontrado.
        limpa_formulário_cnpj();
        alert("Cnpj não encontrado.");
    }
}

function pesquisarcnpj(valor) {

    //Nova variável "cnpj" somente com dígitos.
    var cnpj = valor.replace(/\D/g, '');
    //Verifica se campo cep possui valor informado.  
    if (cnpj !== "") {
        //Expressão regular para validar o CEP.
        //    var validacnpj = /^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/;
        //Valida o formato do CEP.

        //Preenche os campos com "..." enquanto consulta webservice.
        document.getElementById('txtRazaoSocial').value = "...";
        document.getElementById('txtCepReceita').value = "...";
     //   document.getElementById('txtDtaAbertura').value = "...";


        //Cria um elemento javascript.
        var script = document.createElement('script');
        //Sincroniza com o callback.

        script.src = 'https://www.receitaws.com.br/v1/cnpj/' + cnpj + '/?callback=meu_callback';

        //Insere script no documento e carrega o conteúdo.
        document.body.appendChild(script);

    } //end if.
    else {
        //cep sem valor, limpa formulário.
        limpa_formulário_cnpj();
    }
}
;
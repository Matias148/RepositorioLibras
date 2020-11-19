var pesquisa;
var url = window.location.search;
var teste = url.split("=");
pesquisa = teste[1];

function pesquisar() {
    window.location = "telaPesquisa.html?pes="+document.getElementById('textoPesquisa').value;
}

document.getElementById('procurouPesquisa').onload = mudar();

function mudar() {
    if (document.getElementById('procurouPesquisa') != null) {
        document.getElementById('procurouPesquisa').innerHTML  = "Você procurou por "+pesquisa;
    }
}
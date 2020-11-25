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
        carregarResultado();
    }
}

function carregarResultado() {
    axios.get('http://localhost:8080/api/verbete')
        .then(function (response) {
            //console.log(response.data);
            for (let i = 0; i < response.data.length; i++){
                console.log(response.data[i].titulo);
                if (response.data[i].titulo.toString().includes(pesquisa.toString())){
                    var div = document.createElement("div");
                    var tabela = document.createElement("table");
                    var tblinha = document.createElement("tr");
                    var tbNome = document.createElement("td");
                    var tbDescri = document.createElement("td");
                    var tbLink = document.createElement("td");

                    var nome = document.createTextNode(response.data[i].titulo);
                    var descri = document.createTextNode(response.data[i].descricao);
                    var link = document.createElement("a");
                    var linkText = document.createTextNode("Acessar");
                    link.appendChild(linkText);
                    link.href = "telaSinalClicado.html?sinal="+i;

                    tbNome.appendChild(nome);
                    tbDescri.appendChild(descri);
                    tbLink.appendChild(link);
                    tblinha.appendChild(tbNome);
                    tblinha.appendChild(tbDescri);
                    tblinha.appendChild(tbLink);
                    tabela.appendChild(tblinha);

                    tbLink.style = "border: 1px solid blue";
                    tbNome.style = "border: 1px solid blue";
                    tbDescri.style = "border: 1px solid blue";
                    tabela.style = "border: 1px solid black";
                    div.appendChild(tabela);

                    document.body.appendChild(div);
                }
            }
        }).catch(function (response) {
            console.log(response.data)
        });
}
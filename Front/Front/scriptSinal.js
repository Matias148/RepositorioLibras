function subir() {
    var titulo1 = document.getElementById('titulo').value;
    var descri = document.getElementById('descri').value;
    var tituloLink = document.getElementById('linktitulo').value;
    var descriLink = document.getElementById('linkdescri').value;

    tituloLink = tituloLink.split("=")[1];
    descriLink = descriLink.split("=")[1];
    axios.post('http://localhost:8080/api/verbete',
        {
                titulo: titulo1.toString(),
                descricao: descri.toString(),
                tituloLibras: tituloLink.toString(),
                descricaoLibras: descriLink.toString(),
                rank: 0.0
        })
        .then(function (response) {
            console.log(response.data);
        }).catch(function (response) {
            console.log(response.data)
    });
}

function voltar(){
    window.location = "index.html";
}

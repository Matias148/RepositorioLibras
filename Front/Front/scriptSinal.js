function subir() {
    var titulo1 = document.getElementById('titulo').value;
    var descri = document.getElementById('descri').value;
    var tituloLink = document.getElementById('linktitulo').value;
    var descriLink = document.getElementById('linkdescri').value;

    console.log(titulo1,descri,tituloLink,descriLink);
    axios.post('http://localhost:8080/api/verbete',
        {
                titulo: titulo1.toString(),
                descricao: descri.toString(),
                tituloLibras: tituloLink.toString(),
                descricaoLibras: descriLink.toString()

        })
        .then(function (response) {
            console.log("teste")
            console.log(response.data);
        }).catch(function (response) {
            console.log("blah")
        console.log(response.data)
    });
}

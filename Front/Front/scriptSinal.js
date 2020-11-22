function subir() {
    var titulo = document.getElementById('titulo').value;
    var descri = document.getElementById('descri').value;
    var tituloLink = document.getElementById('linktitulo').value;
    var descriLink = document.getElementById('linkdescri').value;

    console.log(titulo,descri,tituloLink,descriLink);
    axios.post('http://localhost:8080/api/verbete',
        {
            "titulo": titulo,
            "descricao": descri,
            "tituloLibras": tituloLink,
            "descricaoLibras": descriLink
        })
        .then(function (response) {
            console.log(response.data);
        }).catch(function (response) {
        console.log(response.data)
    });
}
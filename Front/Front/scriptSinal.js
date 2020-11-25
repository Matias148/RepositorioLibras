function subir() {
    var titulo1 = document.getElementById('titulo').value;
    var descri = document.getElementById('descri').value;
    var tituloLink = document.getElementById('linktitulo').value;
    var descriLink = document.getElementById('linkdescri').value;

    console.log(titulo1,descri,tituloLink,descriLink);
    axios.post('http://localhost:8080/api/verbete',
        {withCredentials: true,
            auth: {
                titulo: titulo1.toString(),
                descricao: descri.toString(),
                tituloLibras: tituloLink.toString(),
                descricaoLibras: descriLink.toString()
            },
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Access-Control-Allow-Headers": "Authorization",
                "Access-Control-Allow-Methods": "GET, POST, OPTIONS, PUT, PATCH, DELETE" ,
                "Content-Type": "application/json;charset=UTF-8"
            },
        })
        .then(function (response) {
            console.log("teste")
            console.log(response.data);
        }).catch(function (response) {
            console.log("blah")
        console.log(response.data)
    });
}

var srt;
var abc;

$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();
});

function previewFile(file) {
    var file;
    var reader  = new FileReader();
    var ret;

    reader.addEventListener("load", function () {
        ret = reader.result;
    }, false);

    if (file) {
        reader.readAsDataURL(file);
    }

    return ret;
}

function subir() {

    var titulo1 = document.getElementById('titulo').value;
    var descri = document.getElementById('descri').value;
    var tituloLink = document.getElementById('linktitulo').files[0];
    var descriLink = document.getElementById('linkdescri').files[0];
    var config = document.getElementById('config').value;
    var mao = document.getElementById('mao').value;

    var strSinal = previewFile(tituloLink);
    var srtDescri = previewFile(descriLink);
    
    if (mao.toString == "Não desejo") {mao = null}

    axios.post('http://localhost:8080/api/verbete',
        {
                titulo: titulo1.toString(),
                descricao: descri.toString(),
                tituloLibras: strSinal.toString(),
                descricaoLibras: srtDescri.toString(),
                rank: 0.0,
                configuracaoMao: config.toString,
                direcaoPalma: mao.toString
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

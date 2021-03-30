var idSinal;
var url = window.location.search;
var teste = url.split("=");
idSinal = teste[1];

axios.get('http://localhost:8080/api/verbete/'+idSinal).
    then(function (response){
        console.log(response.data);
        document.title = "Sinal - " + response.data.titulo;

        var titulo = document.createTextNode(response.data.titulo + "  " + response.data.rank);
        var video = document.createElement("iframe");
        var descriLibras = document.createElement("iframe");
        var descricao = document.createTextNode(response.data.descricao);

        var divTitulo = document.createElement("div");
        var divVideos = document.createElement("div");
        var divDescricao = document.createElement("div");

        video.src = "https://www.youtube.com/embed/"+response.data.tituloLibras;
        video.width = "560";
        video.height = "315";
        video.allowFullscreen = true;

        descriLibras.src = "https://www.youtube.com/embed/"+response.data.descricaoLibras;
        descriLibras.width = "560";
        descriLibras.height = "315";
        descriLibras.allowFullscreen = true;

        video.alt = "titulo libras";
        descriLibras.alt = "Descrição libras";

        divVideos.style = "width: fit-content;margin: 0 auto";
        divTitulo.style = "text-align: center;font-size: 50px";
        divDescricao.style = "margin: 0 auto;text-align: center;width: 500px;font-size: x-large";

        var botaoUP = document.createElement("button");
        var botaoDown = document.createElement("button");

        botaoUP.onclick = function () {
            axios.put('http://localhost:8080/api/verbete/'+response.data.id, {
                    id: response.data.id,
                    titulo: response.data.titulo,
                    descricao: response.data.descricao,
                    tituloLibras: response.data.tituloLibras,
                    descricaoLibras: response.data.descricaoLibras,
                    rank: (response.data.rank + 1.0)
            }).then(function (response) {
                console.log(response.data.rank);
            }).catch(function (response) {
                console.log(response.data)
            });
        };

        botaoDown.onclick = function () {
            axios.put('http://localhost:8080/api/verbete/'+response.data.id, {
                id: response.data.id,
                titulo: response.data.titulo,
                descricao: response.data.descricao,
                tituloLibras: response.data.tituloLibras,
                descricaoLibras: response.data.descricaoLibras,
                rank: (response.data.rank - 1.0)
            }).then(function (response) {
                console.log(response.data.rank);
            }).catch(function (response) {
                console.log(response.data)
            });
        };

        botaoUP.appendChild(document.createTextNode("UP"));
        botaoDown.appendChild(document.createTextNode("Down"));

        divTitulo.appendChild(titulo);
        divVideos.appendChild(video);
        divVideos.appendChild(descriLibras);
        divDescricao.appendChild(descricao);

        document.body.appendChild(divTitulo);
        document.body.appendChild(divVideos);
        document.body.appendChild(divDescricao);
        document.body.appendChild(botaoUP);
        document.body.appendChild(botaoDown);
    }).catch(function (response) {
    console.log(response.data)
});
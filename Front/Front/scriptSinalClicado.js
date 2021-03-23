var idSinal;
var url = window.location.search;
var teste = url.split("=");
idSinal = teste[1];

axios.get('http://localhost:8080/api/verbete/'+idSinal).
    then(function (response){
        console.log(response.data);
        document.title = response.data.titulo;

        var titulo = document.createTextNode(response.data.titulo);
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
        descriLibras.alt = "Drecrição libras";

        divVideos.style = "width: fit-content;margin: 0 auto";
        divTitulo.style = "text-align: center;font-size: 50px";
        divDescricao.style = "margin: 0 auto;text-align: center;width: 500px;font-size: x-large";

        divTitulo.appendChild(titulo);
        divVideos.appendChild(video);
        divVideos.appendChild(descriLibras);
        divDescricao.appendChild(descricao);

        document.body.appendChild(divTitulo);
        document.body.appendChild(divVideos);
        document.body.appendChild(divDescricao);
    }).catch(function (response) {
    console.log(response.data)
});
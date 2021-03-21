var idSinal;
var url = window.location.search;
var teste = url.split("=");
idSinal = teste[1];

axios.get('http://localhost:8080/api/verbete/'+idSinal).
    then(function (response){
        console.log(response.data);
        var titulo = document.createTextNode(response.data.titulo);
        var video = document.createElement("iframe");
        var descriLibras = document.createElement("iframe");
        var descricao = document.createTextNode(response.data.descricao);


        //video.src = "Wildlife.wmv";
        //descriLibras.src = "2020-12-16_10-30-50.mp4";

        //video.src = response.data.tituloLibras;
        //descriLibras.src = response.data.descricaoLibras;

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

        document.body.appendChild(titulo);
        document.body.appendChild(video);
        document.body.appendChild(descriLibras);
        document.body.appendChild(descricao);
    }).catch(function (response) {
    console.log(response.data)
});
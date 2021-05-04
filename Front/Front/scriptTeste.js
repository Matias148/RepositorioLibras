function previewFile() {
    var preview = document.querySelector('img');
    var file    = document.querySelector('input[type=file]').files[0];
    var file2   = document.getElementById('teste2').files[0];
    var reader  = new FileReader();

    reader.addEventListener("load", function () {
        var base64gif = reader.result; // your gif in base64 here
        preview.src = base64gif;
        //document.getElementById('base64').innerHTML = base64gif;
    }, false);

    if (file) {
        reader.readAsDataURL(file);
    }
}
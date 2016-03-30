function SomenteNumero(e) {
    var tecla = (window.event) ? event.keyCode : e.which;
    if ((tecla > 47 && tecla < 58))
        return true;
    else {
        if (tecla == 8 || tecla == 0)
            return true;
        else
            return false;
    }
}

function valor(){

   var moeda = document.getElementById("preco");
   alert(modeda);
   moeda = moeda.replace(".","");

   moeda = moeda.replace(",",".");

   return parseFloat(moeda);

}

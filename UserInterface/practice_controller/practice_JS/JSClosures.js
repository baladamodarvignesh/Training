var add = (function() {
    var counter = 0;
    return function() { counter += 1; return counter; }
})();

function myFunction() {
    document.getElementById("demo").innerHTML = add();

}
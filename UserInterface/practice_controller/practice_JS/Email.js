function validateEmail() {
    var text = document.getElementById("tb1").value;
    var reg = /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,4})$/;
    var simplifiedReg = /^[_\w-]+[\.\w]*@[\w]+(\.[a-z]{2,3})$/;
    if (simplifiedReg.test(text)) {
        window.alert("Validation Successful");
    } else {
        window.alert("validation failed");
    }
}
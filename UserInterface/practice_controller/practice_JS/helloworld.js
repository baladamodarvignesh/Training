"use strict";
var sample = /** @class */ (function () {
    function sample() {
    }
    sample.prototype.greet2World = function () {
        console.log("Hello world !, console");
    };
    return sample;
}());
function alertMe() {
    alert("hi");
}
var sampleObject = new sample();
sampleObject.greet2World();

"use strict";
var Student1 = /** @class */ (function () {
    function Student1(name, age, marks, aadharNo, panNumber) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.aadharNo = aadharNo;
        this.panNumber = panNumber;
    }
    return Student1;
}());
var student = {
    name: 'Saif',
    age: 45,
    marks: 100
};
var student2 = new Student1('Saif', 30, 100, undefined, 'asfdsgfd');
var clearedStudents = [
    new Student1('Saif', 23, 100),
    new Student1('Suraj', 22, 100)
];
console.log(clearedStudents);
//class impelementing
var Training = /** @class */ (function () {
    function Training() {
    }
    Training.prototype.printData = function () {
    };
    return Training;
}());
var trainee1 = {
    name: 'name',
    age: 45,
    marks: 100,
    printData: function () {
    }
};

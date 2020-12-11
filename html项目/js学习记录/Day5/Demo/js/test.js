// var reg_01 = /a/;
// var str="abcdef";
// var result = str.search(reg_01);
// console.log(result);

document.getElementById("input_01").onkeyup = function(){
	var str = this.value;
	var reg_test = /\b(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\.){3}(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\b/;
	var result = reg_test.test(str);
	document.getElementById("span_01").innerText = result;
}

// var str = "Welcome gaa to gad beijing 2020 ,11 beijing gd is very good";
// var reg1 = /beijing/g;
// var result = str.replace(reg1,"dalian");
// console.log(result);

// var reg2 = /\d{1}/g;
// var result = str.replace(reg2,2019);
// console.log(result);

// var reg3 = /\d{2,}/g;
// var result = str.replace(reg3,"2019");
// console.log(result);

// var reg4 = /g(\w)*d/g;
// var result = str.replace(reg4,"good");
// console.log(result);




//var str2 = "Welcome to IBM! We are proud to announce that IBM has one of the largest Web Developers sites in the world.2020/10/19";

// var reg1 = /IBM/g;
// var result = str.replace(reg1,"dhc");
// console.log(result);

// var result = str2.split("");
// console.log(result);

// var result = str2.split("");
// var result2 = [result[0],result[1],result[2]];
// console.log(result2);

// var reg4 =/ibm/i;
// var result = str2.search();
// console.log(result);





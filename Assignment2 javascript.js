
 //Q1
     function sum(x,y)
            {
                return x+y;
            }
            sum(3,4);


//Q2
            obj={id:101 ,name:"ram"};
            console.log(obj.id +"  "+obj.name);
        


//Q3

var arr=["ram","sham","seeta"];
console.log(arr);
   
///Q4
function fun(x)
{
    if(isNaN(x))
    console.log("Not a Number");
    else
    console.log("a number");
}
fun(12);


//Q5






//Q6
var f=100;
var  c= ((f-32)/9)*5;
console.log(c);


//Q7
function fun1(n)
{
    if(n<1)
    {
        return 1;
    }
    else
    {
        return n*fun1(n-1);
    }
   
}
fun1(4);




//Q8
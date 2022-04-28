import {getTotalPrice} from "./totalAmountOnCheckout.js";

const requiredFields = document.querySelectorAll(".form-control");
const checkoutButton = document.querySelector("button");


for (let field of requiredFields) {
    field.addEventListener("change", fieldHandler);
}


checkoutButton.addEventListener("click", checkoutButtonHandler);
getTotalPrice().then(() => {return null;});

let logOutput = [];
let orderOutput = [];
let orderId = document.getElementsByClassName("orderId")[0].id;
orderOutput.push("Order ID: " + orderId);
localStorage.setItem("orderId", orderId);

getCart().then(data => {console.log(data);});


function fieldHandler(e) {
    logOutput.push(`${e.target.id} input occurred`);
}

function fieldLog() {
    logOutput.push("FIELD STATUSES ON CHECKOUT EVENT")
    for (let field of requiredFields) {
        if (field.id === "email") {
            logOutput.push(field.id + ": " + field.value)
        } else {
            let validInput = field.value.length > 0 ? "yes" : "no"
            let fieldStatus = field.id + " valid input: " + validInput;
            logOutput.push(fieldStatus);
        }
    }
}


function fieldChecker() {
    let allOkay = true;
    for (let field of requiredFields) {
        if (field.value.length === 0) {
            allOkay = false;
        }
    }
    return allOkay;
}

async function checkoutButtonHandler(e) {
    fieldLog();
    apiGet("http://0.0.0.0:8080/api/adminlog", logOutput, "logoutput");
    if (fieldChecker()) {
        await getCart().then(data =>  {
            console.log(data);
            let customerEmail = document.getElementById("email").value;
            orderOutput.push("Customer email address: " + customerEmail);
            for (let item of data) {
                orderOutput.push("Ordered item and amount: " + item['name'] + " " + item['amount']);
            }
            let totalSum = 0;
            for (let item of data) {
                totalSum += parseFloat(item['defaultPrice']) * parseFloat(item['amount']);
            }
            console.log(totalSum + "adsadsa")
            orderOutput.push("Total amount: " + totalSum + " USD");
            return null;
        })
        apiGet("http://0.0.0.0:8080/api/order", orderOutput, "order");
        window.location.href="http://0.0.0.0:8080/order_confirmation";
    }
}





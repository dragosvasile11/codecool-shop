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




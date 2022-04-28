import {getTotalPrice} from "./totalAmountOnCheckout.js";

const requiredFields = document.querySelectorAll(".form-control");
const checkoutButton = document.querySelector("button");


for (let field of requiredFields) {
    field.addEventListener("change", fieldHandler);
}


checkoutButton.addEventListener("click", checkoutButtonHandler);
getTotalPrice().then(() => {return null;});



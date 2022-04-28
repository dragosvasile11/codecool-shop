import {removeItemExport} from "./removeItem.js";
import {getCartContentCard} from "./htmlFactory.js";
import {changeQuantityExport} from "./changeQuantity.js";
import {getTotalPayableExport} from "./getTotalPayable.js";

export function fillModalExport() {fillModal();}

function fillModal() {
    const cartItemContainer = document.getElementById("current-item-container");
    const cartButtonNumber = document.getElementById('number-cart-contains')
    fetch('/api/session/get')
        .then(response => (response.json())
        .then(data => {
            let itemCounter = 0;
            let newContent = "";
            for (let product of data) {
                itemCounter += 1;
                newContent += getCartContentCard(product);
            }
            if (newContent === "") {
                cartItemContainer.innerHTML = '<h3>No item selected</h3><br><hr>';
            } else {
                cartItemContainer.innerHTML = newContent;
            }
            cartButtonNumber.innerText = itemCounter.toString();
            removeItemExport();
            changeQuantityExport();
            getTotalPayableExport();
        }));
}


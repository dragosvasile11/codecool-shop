import {addToCartExport} from "./addToCart.js";
import {fillModalExport} from "./fillModal.js";

function addEventListeners() {
    fillModalExport();
    addToCartExport();
}

window.onload = addEventListeners;
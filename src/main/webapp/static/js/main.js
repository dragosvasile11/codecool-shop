document.getElementById("cartButton").addEventListener("click", openCart);

function openCart() {
    window.location.href = "http://localhost:8888/view-cart";
}

document.getElementById("checkoutButton").addEventListener("click", openCheckoutPage);


function openCheckoutPage() {

}

const addToCartButtons = document.getElementsByClassName("btn btn-success");
console.log(addToCartButtons);

for (let addToCartButton of addToCartButtons) {
    addToCartButton.addEventListener("click", addItem);
    function addItem() {
        let cartNumberOfItems = document.getElementById("itemsNumberInCart").innerHTML;
        let numberAsInteger = parseInt(cartNumberOfItems.slice(1, cartNumberOfItems.length - 1));
        document.getElementById("itemsNumberInCart").innerHTML = "(" + (numberAsInteger + 1) + ")";
    }
}
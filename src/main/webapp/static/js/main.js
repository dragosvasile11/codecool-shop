document.getElementById("cartButton").addEventListener("click", openCart);

function openCart() {
    window.location.href = "http://localhost:8888/view-cart";
}

document.getElementById("checkoutButton").addEventListener("click", openCheckoutPage);


function openCheckoutPage() {

}

const els = document.getElementsByClassName("btn btn-success");
console.log(els);

for (let el of els) {
    el.addEventListener("click", addItem);
    function addItem() {
        let cartNumberOfItems = document.getElementById("itemsNumberInCart").innerHTML;
        let numberAsInteger = parseInt(cartNumberOfItems.slice(1, cartNumberOfItems.length - 1));
        document.getElementById("itemsNumberInCart").innerHTML = "(" + (numberAsInteger + 1) + ")";
    }
}
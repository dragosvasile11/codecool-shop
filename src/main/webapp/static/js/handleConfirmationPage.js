

async function clearCart() {
    await fetch("/api/session/removeAll", {method: 'GET',})
}

async function getCart() {
    let response = await fetch("/api/session/get", {
        method: 'GET',
    })
    if (response.status === 200) {
        let data = response.json()
        console.log(data)
        return data
    }
}

import "./home.css"
function Home() {
    return (
        <>
            <div className={"container"}>
                <h1>Item Register</h1>
                <label>Name</label>
                <input type={"text"}/>
                <p></p>
                <label>Price</label>
                <input type={"text"}/>
                <p></p>
                <label>Quantity</label>
                <input type={"text"}/>
                <p></p>
                <label>Description</label>
                <input type={"text"}/>
            </div>
        </>
    )
}

export  default Home;
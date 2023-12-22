import './App.css'
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import About from "./pages/About.tsx";
// import React from "react";
import Home from "./pages/Home.tsx";

const router = createBrowserRouter(
    [
        {
            path: "/",
            element: <Home/>
        },
        {
            path: "/about",
            element: <About/>
        }
    ]
)

function App() {

  return (
    <>
      <RouterProvider router={router}/>
    </>
  )
}

export default App

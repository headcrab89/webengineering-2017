import React from "react";
import ReactDOM from "react-dom";

import Greeter from "./components/greeter";
import Post from "./components/post";


ReactDOM.render(
    <div>
        <Greeter message="Students"/>
        <Greeter message="Michael"/>
        <Greeter />
        <Post/>
    </div>,
    document.getElementById('root'));


import React from "react";
import axios from "axios";

// A general counter component.
class Post extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    componentDidMount() {
        axios.get("/api/post")
            .then(res => {
                let p = [];

                res.data.forEach(d => {
                    p.push(<ul key={d.id}>{d.title} </ul>)
                });

                this.setState({
                posts: p
                })
            })
            .catch(function (error) {
                console.error(error);
            });
    }

    render() {
        return <ul>{this.state.posts}</ul>
    }
}


export default Post;
import axios from "axios";

export function getEventList(params) {
    return axios.get(`http://localhost:5000/event`, { params });
}
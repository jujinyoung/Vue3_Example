import axios from "axios";

export function getEventList(params) {
    return axios.get(`http://localhost:8080/event`, { params });
}
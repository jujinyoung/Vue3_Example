import axios from "axios";

const instance = axios.create({
    baseURL: 'http://localhost:8080'
});

export function getEventList(params) {
    return instance.get(`/event`, { params });
}
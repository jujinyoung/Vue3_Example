import {posts} from "@/api/index.js";

export function getPosts(params) {
    return posts.get('/', { params });
}

export function getPostById(id) {
    return posts.get(`/${id}`);
}

export function createPost(data) {
    return posts.post('', data);
}

export function updatePost(id, data) {
    return posts.patch(`/${id}`, data);
}

export function deletePost(id) {
    return posts.delete(`/${id}`);
}
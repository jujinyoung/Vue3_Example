import { createRouter, createWebHistory } from "vue-router";
import HomeView from "@/views/HomeView.vue";
import AboutView from "@/views/AboutView.vue";
import PostEditView from "@/views/posts/PostEditView.vue";
import PostCreateView from "@/views/posts/PostCreateView.vue";
import PostDetailView from "@/views/posts/PostDetailView.vue";
import PostListView from "@/views/posts/PostListView.vue";

const routes = [
    {
        path: '/',
        name: 'Home',
        component: HomeView,
    },
    {
        path: '/about',
        name: 'About',
        component: AboutView,
    },
    {
        path: '/posts/create',
        name: 'PostCreate',
        component: PostCreateView,
    },
    {
        path: '/posts/edit/:id',
        name: 'PostEdit',
        component: PostEditView,
    },
    {
        path: '/posts/:id',
        name: 'PostDetail',
        component: PostDetailView,
    },
    {
        path: '/posts',
        name: 'PostList',
        component: PostListView,
    },
    {
        path: '/:pathMatch(.*)*',
        name: 'NotFound',
        component: NotFoundView
    },
    // {
    //     path: '/nested',
    //     name: 'Nested',
    //     component: NestedView,
    //     children: [
    //         {
    //             path: '',
    //             name: 'NestedHome',
    //             component: NestedHomeView,
    //         },
    //         {
    //             path: 'one',
    //             name: 'NestedOne',
    //             component: NestedOneView
    //         },
    //         {
    //             path: 'two',
    //             name: 'NestedTwo',
    //             component: NestedTwoView
    //         }
    //     ]
    // }
];

const router = createRouter({
    history: createWebHistory('/'),
    routes
})

export default router;
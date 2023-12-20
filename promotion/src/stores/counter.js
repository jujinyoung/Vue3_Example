import { defineStore } from "pinia";

export const useCounterStore = defineStore('counter', {
    state: () => ({
        url: null
    }),
    getters: {},
    actions: {
        setUrl(url) {
            this.url = url;
        }
    }
});

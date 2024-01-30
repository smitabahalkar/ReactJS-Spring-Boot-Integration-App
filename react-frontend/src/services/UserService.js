import axios from 'axios';


const UERS_REST_API_URL = 'http://localhost:8080/api/users';

class UserService {

    getUsers() {
        return axios.get(UERS_REST_API_URL);
    }
}

export default new UserService();
const API_BASE_URL = 'http://localhost:8080/api';

/**
 * Function Purpose: Fetches all products from the backend API.
 * @returns {Promise<Array<object>>} A promise that resolves to an array of product objects.
 * @throws {Error} If the network response is not ok.
 */
export const fetchProducts = async() => {
    try{
        const response = await fetch(`${API_BASE_URL}/products/`);
        if(!response.ok) 
            throw new Error(`HTTP error! Status: ${response.status}`);
        const data = await response.json();
        return data;
    }catch(error){
        console.error("Cannot fetch products: ", error); 
        throw error;
    }
}

/**
 * Function Purpose: Fetches a single product by its ID from the backend API.
 * @param {number|string} id The ID of the product to fetch.
 * @returns {Promise<object>} A promise that resolves to the product object.
 * @throws {Error} If the network response is not ok (including 404 Not Found).
 */
export const fetchProductsById = async(id) =>{
    try{
        const response = await fetch(`${API_BASE_URL}/products/${id}`);        
        if(!response.ok){
            throw new Error(`HTTP error! Status: ${response.status}`);
        }
        const data = await response.json();
        return data;
    }catch(error){
        console.error(`Could not fetch product with id ${id}:`, error);
        throw error;
    }
} 
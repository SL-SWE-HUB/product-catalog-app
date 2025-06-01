import React, {useState, useEffect} from 'react';
import { fetchProducts } from '../api/apiClient';
import ProductCard from './ProductCard';
import '../components/ProductList.css';

function ProductList(){
    //State variables set-up
    const[products, setProducts] = useState([]);
    const[loading, setLoading] = useState(true);
    const[error, setError] = useState(null);

    useEffect(() => {
        const loadProducts = async() => {
            try{
                setLoading(true);
                setError(null);
                const data = await fetchProducts();
                setProducts(data);
            }catch(err){
                setError(`Failed to load products ${err.message}`);
                setProducts([]); //Reset product array on error
                console.error(err);
            }finally{
                setLoading(false); //Reset loading to false, after each fetch attempt
            }
        };
        loadProducts();
    }, []);

    if (!products) { // If products is null or undefined
    return <div className="loading-message">Initializing products...</div>; // Or some other placeholder
    }

    if (products.length === 0 && !loading && !error) { // Checking !loading and !error to ensure it's not just an initial empty state during load
    return <div className="no-products-message">No products found.</div>;
    }

    return (
        <div className="product-list-container">
            {/* Traverse through products array and render ProductCard for each product */}
            {products.map((product) =>(
                <ProductCard key={product.id} product={product}/>
            ))}
        </div>
    );
}

export default ProductList;
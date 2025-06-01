import './ProductList.css';

function ProductCard({ product }){
    if(!product){
        return <div>Product data is missing.</div>;
    }
    const formattedPrice = product.price? `$${Number(product.price).toFixed(2)}` : `Price not available`;

    return(
        <div className="product-card">
            {/* Image Placeholder */}
            <div className="product-image-holder">
                {/* <img/> */}
            </div>
            <div className="product-info">
                <h3 className="product-name">{product.name? `${product.name}` : "Unnamed Product"}</h3>
                <p className="product-description">{product.description? `${product.description}` : "No Description Available."}</p>
                <p className="product-name">{formattedPrice}</p>
            </div>
        </div>
    );
}

export default ProductCard;
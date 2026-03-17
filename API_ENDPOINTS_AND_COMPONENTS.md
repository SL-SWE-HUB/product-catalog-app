# API Endpoints and Components

## API Endpoints

### 1. **GET /api/products**  
- **Description:** Fetches a list of products.  
- **Response:**
  - 200 OK  
  - Returns an array of product objects.

### 2. **GET /api/products/{id}**  
- **Description:** Fetches a specific product by ID.  
- **Response:**
  - 200 OK  
  - Returns the product object.  
  - 404 Not Found if the product does not exist.

### 3. **POST /api/products**  
- **Description:** Creates a new product.  
- **Request Body:**
  - Name: String  
  - Price: Number  
  - Description: String  
- **Response:**
  - 201 Created  
  - Returns the created product object.

### 4. **PUT /api/products/{id}**  
- **Description:** Updates an existing product by ID.  
- **Request Body:** Similar to POST.  
- **Response:**
  - 200 OK  
  - Returns the updated product object.  
  - 404 Not Found if the product does not exist.

### 5. **DELETE /api/products/{id}**  
- **Description:** Deletes a product by ID.  
- **Response:**
  - 204 No Content  
  - 404 Not Found if the product does not exist.

## Components

### 1. **Product List Component**  
- **Functionality:** Displays a list of products fetched from the API.  
- **Props:**
  - products: Array of product objects  
- **State:**
  - loading: Boolean
  - error: String (if an error occurs)

### 2. **Product Detail Component**  
- **Functionality:** Displays details of a single product fetched from the API.  
- **Props:**
  - product: Product object  
- **State:**
  - loading: Boolean
  - error: String (if an error occurs)

### 3. **Add/Edit Product Component**  
- **Functionality:** Form for adding a new product or editing an existing one.  
- **Props:**
  - product: Product object (optional for adding new)  
- **State:**
  - name: String  
  - price: Number  
  - description: String  
  - error: String (if an error occurs)  

### 4. **Delete Confirmation Component**  
- **Functionality:** Confirmation dialog for deleting a product.  
- **Props:**
  - onConfirm: Function to call on confirmation  
  - onCancel: Function to call on cancellation  

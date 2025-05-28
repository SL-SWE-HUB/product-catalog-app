import './App.css'
import ProductList from './components/ProductList'

function App() {

  return (
    <div className="App">
        <header className="App-header">
            <h1>Minimal E-commerce Product Catalog</h1>
        </header>
        <main>
            <ProductList />
            {/* placeholder for: ProductList Component */}
            <p>Loading Products...</p>
        </main>
        <footer className="App-footer">
            <p>© 2025 SL-SWE-HUB</p>
        </footer>
    </div> 
  );
}

export default App;

import './App.css'
import ProductList from './components/ProductList'

function App() {

  if(!ProductList)
    return <p>Loading Products...</p>;
  
  return (
    <div className="App">
        <header className="App-header">
            <nav className="main-navigation">
              <ul className="main-navigation-list">
                <li><a>Home</a></li>
                <li><a>About</a></li>
                <li><a>Contact Us</a></li>
              </ul>
            </nav>
        </header>
        <main>
            <ProductList />
            {/* placeholder for: ProductList Component */}
        </main>
        <footer className="App-footer">
            <p> Application: Product Catalog <br/> © 2025 SL-SWE-HUB</p>
        </footer>
    </div> 
  );
}

export default App;

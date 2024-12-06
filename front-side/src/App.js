import { useState } from "react";
import "./App.css";
import Header from "./Components/header";
import List from "./Components/list";

function App() {
  const [searchQuery, setSearchQuery] = useState("");
  return (
    <div className="App">
      <Header onSearch={setSearchQuery} />
      {/* Rendering the Header component and passing 'setSearchQuery' as a prop named 'onSearch' */}
      <List searchQuery={searchQuery} />
      {/* Rendering the List component and passing the 'searchQuery' state as a prop */}
    </div>
  );
}

export default App;

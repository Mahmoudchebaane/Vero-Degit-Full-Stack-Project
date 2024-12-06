import axios from "axios";
// Create an Axios instance with custom configuration
const API = axios.create({
    baseURL: process.env.REACT_APP_API_URL + "/api", 
    timeout: 5000, 
  });

// Async function to fetch artwork data from the API
export const fetchArtwork = async (searchQuery ="", currentpage, artlimit) => {
  try {
    // Conditionally set query parameters based on the presence of a search query
      const options = searchQuery
  ? { params: { search: searchQuery, page: currentpage, limit:artlimit } }
  : { params :{page: currentpage, limit:artlimit}};
    const response = await API.get("/artworks", options); // Make the GET request to the API using the built-in Axios instance
    return response.data; 
  } catch (error) {
    console.error("Erreur lors de la récupération des données :", error.message);
    // Detailed error logging based on the error type
    if (error.response) {
      console.error("Code d'erreur :", error.response.status);
      console.error("Message de l'API :", error.response.data);
    } else if (error.request) {
      console.error("Aucune réponse reçue. Vérifiez le serveur API.");
    } else {
      console.error("Erreur de configuration :", error.message);
    }
    throw error; 
  }
};

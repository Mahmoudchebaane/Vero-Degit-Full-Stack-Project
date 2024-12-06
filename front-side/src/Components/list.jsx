import * as React from "react";
import { useEffect, useState } from "react";
import Card from "@mui/material/Card";
import CardContent from "@mui/material/CardContent";
import { CardMedia } from "@mui/material";
import Typography from "@mui/material/Typography";
import { fetchArtwork } from "../services/api";
import PaginationRounded from "../Components/paginationRounded";

function List({ searchQuery }) {
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [currentPage, setCurrentPage] = useState();
  const [totalPages, setTotalPages] = useState(1);
  const artPerPage = 12; 

  // Function to handle page change in pagination
  const handlePageChange = (pageNumber) => {
    console.log("change in list", pageNumber);
    setCurrentPage(pageNumber);
  };
  
  // Effect hook to reset the page to 1 when searchQuery changes
  useEffect(() => {
    setCurrentPage(1); 
  }, [searchQuery]);
  
  // Effect hook to load data whenever searchQuery, currentPage, or artPerPage changes
  useEffect(() => {
    const loadData = async () => {
      setLoading(true); 
      setError(null); 
      try {
        const response = await fetchArtwork(
          searchQuery,
          currentPage,
          artPerPage
        );
        setData(response.data);
        setTotalPages(response.pagination.total_pages);
      } catch (error) {
        setError("Unable to load data");
      } finally {
        setLoading(false);
      }
    };
    loadData();
  }, [searchQuery, currentPage, artPerPage]); 

  if (loading) return <p>Loading data...</p>;   // Show loading message while data is being fetched
  if (error) return <p>{error}</p>;   // Show error message if there is an error

  return (
    <div style={{ padding: "20px" }}>
      {data.length > 0 ? (
        <>
        <div
          style={{
            display: "flex",
            flexWrap: "wrap",
            gap: "20px",
            justifyContent: "center",
          }}
        >
        {/* Map through the data array and render a Card for each artwork */}
          {data.map((item) => (
            <Card key={item.id} sx={{ maxWidth: 345 }}>
              <CardMedia
                component="img"
                alt={item.title || "Image"}
                height="140"
                image={
                  item.image_id
                    ? `https://www.artic.edu/iiif/2/${item.image_id}/full/843,/0/default.jpg`   // Image URL if image_id exists
                    : require("../image/notfound.png")          // Fallback image if no image_id is available
                }
              />
              <CardContent>
                <Typography gutterBottom variant="h5">
                  {item.title || "Title unavailable"}
                </Typography>
                <Typography gutterBottom variant="h6">
                  {item.artist_title || "Artist unavailable"}
                </Typography>
                <Typography variant="body2" color="text.secondary">
                  {item.description ? (
                    <span
                      dangerouslySetInnerHTML={{
                        __html: `${item.description.slice(0, 150)}${
                          item.description.length > 150 ? "..." : ""
                        }`,
                      }}
                    />
                  ) : (
                    "Description unavailable"
                  )}
                </Typography>
              </CardContent>
            </Card>
          ))}
          
        </div>
        {/* Pagination component to handle page navigation */}
        <div className="row pt-4" style={{ paddingTop: "50px" }}>
            <PaginationRounded
              artPerPage={artPerPage}
              onPageChange={handlePageChange} // Pass the handlePageChange function as a prop
              totalPages={totalPages}         // Pass total number of pages
              currentPage={currentPage}       // Pass current page number
            />
          </div>
        </>
      ) : (
        <Typography variant="h6" align="center">
          No results found
        </Typography>
      )}
    </div>
  );
}
export default List;

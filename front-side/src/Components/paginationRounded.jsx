import { Pagination, Stack } from "@mui/material";
import React from "react";
// PaginationRounded component that renders a paginated navigation for artwork list
const PaginationRounded = ({ currentPage, totalPages, onPageChange }) => {
  // Handle page click event to trigger the onPageChange callback
  const handlePageClick = (pageNumber) => { 
    if (onPageChange) {
      onPageChange(pageNumber); // Call onPageChange function with the new page number
    }
  };
  return (
    <Stack spacing={1} direction="row" justifyContent="center">
      <Pagination
        count={totalPages} 
        shape="rounded" 
        page={currentPage}
        onChange={(event, pageNumber) => handlePageClick(pageNumber)}   // Handle page number change
        variant="outlined" 
        color="primary" 
      />
    </Stack>
  );
};
export default PaginationRounded;

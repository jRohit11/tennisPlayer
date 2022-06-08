# tennisPlayer

@GetMapping("/page")
	public Page<Players> findPaginated(@RequestParam int pageNo,
									   @RequestParam int pageSize,
									   @RequestParam String sortField,
									   @RequestParam String sortDirection) 
	{
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
			
		Pageable pageable = PageRequest.of(pageNo-1, pageSize,sort);
		return playerRepo.findAll(pageable);
	}

package com.example.Interview.repository;
		
		import java.util.List;
		
		import org.springframework.data.mongodb.repository.MongoRepository;
		import org.springframework.stereotype.Repository;
		
		import com.example.Interview.model.Company;
		
		@Repository
		public interface CompanyRepository extends MongoRepository<Company, String> {
		    List<Company> findByNameContainingIgnoreCase(String keyword);
		    List<Company> findByType(String type);
			List<Company> findAll();
		}
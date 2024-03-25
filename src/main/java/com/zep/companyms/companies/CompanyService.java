package com.zep.companyms.companies;

import java.util.List;

public interface CompanyService {
   List<Company> getAllCompanies();
   boolean updateCompany(Company company,Long id);
   void createCompany(Company company);
Company getCompany(Long id);
boolean deleteCompany(Long id);

   Company getCompanyById(Long companyId);
}

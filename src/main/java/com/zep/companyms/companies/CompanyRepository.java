package com.zep.companyms.companies;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company, Long> {
    Company getCompanyById(Long companyId);
}

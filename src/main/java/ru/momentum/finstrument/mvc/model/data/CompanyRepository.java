package ru.momentum.finstrument.mvc.model.data;

import org.springframework.data.repository.CrudRepository;
import ru.momentum.finstrument.mvc.model.entity.Company;

/**
 * Company's CrudRepository. Allow to operate with table companies in database.
 */
public interface CompanyRepository extends CrudRepository<Company, Integer> {
    /**
     * Finds company by its network address.
     *
     * @param address Company's network address.
     * @return found company.
     */
    Company findByAddress(String address);
}
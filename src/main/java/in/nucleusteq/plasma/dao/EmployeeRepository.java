package in.nucleusteq.plasma.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nucleusteq.plasma.model.Employee;

/**
 * EmployeeRepository.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
   
    Optional<Employee> findByUserId(String employeeId);
    /**
     * getByEmail.
     */
    Employee getByEmail(String userName);

    Optional<Employee> findByEmail(String email);

}

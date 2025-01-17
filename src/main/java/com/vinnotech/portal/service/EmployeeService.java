package com.vinnotech.portal.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.vinnotech.portal.model.Attachments;
import com.vinnotech.portal.model.Employee;

public interface EmployeeService {

	public Employee employeeProfile();

	public String saveEmployee(Employee emp);

	public Employee getEmployee(Long id);

	public List<Employee> getAllEmployees();

	public String deleteEmployee(Long id);

	public Attachments getAttachments(Long empId);

	/*
	 * public List<Employee> getAllEmployeeswitSorting(String field); public
	 * List<Employee> getAllEmployeeswitSortingDesc(String field);
	 */
	public Page<Employee> getAllEmployeeswithSortAndPagiDesc(int offset, int pageSize, String field);

	public Page<Employee> getAllEmployeeswithSortAndPagiASC(int offset, int pageSize, String field);

	public Page<Employee> getAllEmployeeswithSortAndPagiDelDesc(boolean isEmpDeleted, int offset, int pageSize,
			String field);

	public Page<Employee> getAllEmployeeswithSortAndPagiDelASC(boolean isEmpDeleted, int offset, int pageSize,
			String field);

	public Page<Employee> searchEmpsByParam(String searchParam, int offset, int pageSize);
}

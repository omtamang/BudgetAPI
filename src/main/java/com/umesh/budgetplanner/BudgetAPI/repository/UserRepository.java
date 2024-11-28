package com.umesh.budgetplanner.BudgetAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umesh.budgetplanner.BudgetAPI.user.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}

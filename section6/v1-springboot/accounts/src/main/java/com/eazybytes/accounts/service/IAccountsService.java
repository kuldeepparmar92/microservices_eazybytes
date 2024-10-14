package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    public void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return Account details based on mobile number
     */
    public CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return boolean indicating if the account is updated or not
     */
    public boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return boolean indicating if the account is deleted or not
     */
    public boolean deleteAccount(String mobileNumber);
}

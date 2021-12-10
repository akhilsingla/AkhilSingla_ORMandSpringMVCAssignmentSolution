package com.greatlearning.controller;

import com.greatlearning.entity.Customer;
import com.greatlearning.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/list")
    public String listCustomers(Model model) {
        List<Customer> customerList = customerService.getCustomers();
        model.addAttribute("customers", customerList);
        return "customer-list";
    }

    @RequestMapping("/addCustomer")
    public String addCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "add-customer";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute(name = "customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list?isSuccess=true";
    }

    @RequestMapping("/updateForm")
    public String updateCustomer(@RequestParam("customerId") int customerId, Model model) {
        Customer customer = customerService.updateCustomer(customerId);
        model.addAttribute("customer", customer);
        return "add-customer";
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") int customerId) {
        customerService.deleteCustomer(customerId);
        return "redirect:/customer/list?isDeleteSuccess=true";
    }
}

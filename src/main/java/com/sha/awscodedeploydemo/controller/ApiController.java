package com.sha.awscodedeploydemo.controller;

 

/**
 * @author sa
 * @date 6.02.2021
 * @time 14:05
 */
@RestController
public class ApiController
{
    @GetMapping("api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("It works successfully.");
    }
}

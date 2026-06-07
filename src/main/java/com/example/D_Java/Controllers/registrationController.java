package com.example.D_Java.Controllers;

import com.example.D_Java.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class registrationController {
    @RestController
    public class RegistrationController {

        private final RegistrationService registrationService;

        @Autowired
        public RegistrationController(RegistrationService registrationService) {
            this.registrationService = registrationService;
        }

        @DeleteMapping("/registrations")
        public String bulkDeleteRegistrations(@RequestBody List<Integer> ids) {
            if (ids == null || ids.isEmpty()) {
                return "No registration IDs were provided in the request payload body.";
            }

            return registrationService.deleteMultipleByIds(ids);
        }
    }
}
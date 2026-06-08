package com.example.D_Java.Services;

import com.example.D_Java.Entities.EventRegistration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RegistrationService {

    private Map<Integer, EventRegistration> registrations = new HashMap<>();

    public RegistrationService() {
        loadSampleRegistrations();
    }

    private void loadSampleRegistrations() {
        registrations.put(101, new EventRegistration(101, "Ahmed"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "John"));
        registrations.put(104, new EventRegistration(104, "Fatima"));
    }


    public String deleteMultipleByIds(List<Integer> ids) {
        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();

        // Loop through each ID provided in the batch request
        for (Integer id : ids) {
            if (registrations.containsKey(id)) {
                registrations.remove(id);
                deletedIds.add(id);
            } else {
                notFoundIds.add(id);
            }
        }
        return "Bulk Deletion Completed" +
                "Total Requested: " + ids.size() + " " +
                "Deleted Successfully: " + deletedIds.size() + " " +
                "Deleted IDs: " + deletedIds + " " +
                "Not Found IDs: " + notFoundIds;
    }
}

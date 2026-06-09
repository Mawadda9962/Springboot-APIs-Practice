package Interfaces;

import com.example.D_Java.Entities.Campaign;
import org.springframework.boot.jackson.JacksonComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign,String> {
}

package ie.atu.notificationservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class NotificationController {
    @PostMapping("/send-notification")
    public String sendNotification(@RequestBody String message) {
        return "Notification sent: " + message;
    }
}

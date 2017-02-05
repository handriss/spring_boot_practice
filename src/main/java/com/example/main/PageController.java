package com.example.main;


import com.example.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    private NotificationService notificationService;

    @Value("${pageController.msg}")
    public String pageControllerMessage;

    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/")
    public String home(){
        return pageControllerMessage;
    }
}

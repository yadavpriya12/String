package String;


public class Notification {
    
    public void displayNotification(String message) {
        System.out.println("Notification: " + message);
    }

    public void sendEmailNotification(String message, String toAddress) {
        System.out.println("Email sent to " + toAddress + " with message: " + message);
    }

    public void sendSMSNotification(String message, String toNumber) {
        System.out.println("SMS sent to " + toNumber + " with message: " + message);
    }

    public void displayPopupNotification(String message) {
        System.out.println("Popup notification displayed with message: " + message);
    }

    public void logNotification(String message) {
        System.out.println("Notification logged: " + message);
    }
}

 class Alert extends Notification {
    public void displayAlert(String message) {
        System.out.println("Alert: " + message);
    }

    public void displayAlertDialog(String message) {
        System.out.println("Alert dialog displayed with message: " + message);
    }

    public void sendAlertEmail(String message, String toAddress) {
        System.out.println("Alert email sent to " + toAddress + " with message: " + message);
    }

    public void sendAlertSMS(String message, String toNumber) {
        System.out.println("Alert SMS sent to " + toNumber + " with message: " + message);
    }

    public void playAlertSound(String message) {
        System.out.println("Alert sound played with message: " + message);
    }
}

 class SpeedyGrocer {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.displayNotification("Your order is ready for pickup!");
        notification.sendEmailNotification("Your order has been delayed.", "customer@example.com");
        notification.sendSMSNotification("Your order is on its way!", "1234567890");
        notification.displayPopupNotification("Don't forget to pick up your order!");
        notification.logNotification("Order ready for pickup.");

        Alert alert = new Alert();
        alert.displayAlert("System error. Please contact support.");
        alert.displayAlertDialog("Alert: System down for maintenance.");
        alert.sendAlertEmail("Alert: Order delayed.", "customer@example.com");
        alert.sendAlertSMS("Alert: Order cancelled.", "1234567890");
        alert.playAlertSound("Alert: System error.");
    }
}



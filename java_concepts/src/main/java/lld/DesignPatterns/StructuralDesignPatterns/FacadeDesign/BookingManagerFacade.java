package lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign;

import java.time.LocalDate;

import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.models.BookingConfirmation;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.models.BookingResult;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.models.PaymentStatus;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.AccomodationDetails.AccommodationDetailsService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.AvailabilityService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.LoyaltyService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.NotificationService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.PaymentService;

public class BookingManagerFacade {

    private AvailabilityService availabilityService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    private LoyaltyService loyaltyService;
    private AccommodationDetailsService accommodationDetailsService;

    public BookingManagerFacade(AvailabilityService availabilityService, PaymentService paymentService,
            NotificationService notificationService, LoyaltyService loyaltyService,
            AccommodationDetailsService accommodationDetailsService) {
        this.availabilityService = availabilityService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.loyaltyService = loyaltyService;
        this.accommodationDetailsService = accommodationDetailsService;
    }

    public BookingResult book(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        boolean isAvailable = availabilityService.checkAvailability(accommodationId, checkInDate, checkOutDate);

        if (!isAvailable) {
            return BookingResult.notAvailable("Accommodation not available for the given dates");
        }

        PaymentStatus paymentStatus = paymentService.makePayment(userId, accommodationId);
        if (paymentStatus != PaymentStatus.SUCCESS) {
            return BookingResult.paymentFailed("Payment failed with status: " + paymentStatus);
        }

        BookingConfirmation confirmation = new BookingConfirmation(userId, accommodationId, checkInDate, checkOutDate);
        notificationService.sendBookingConfirmation(confirmation);

        loyaltyService.updateLoyaltyPoints(userId, paymentService.calculatePaymentAmount(accommodationId));
        accommodationDetailsService.updateAccommodationDetails(accommodationId, checkInDate, checkOutDate);

        return BookingResult.success(confirmation);
    }

}

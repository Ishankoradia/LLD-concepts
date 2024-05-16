package lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign;

import java.time.LocalDate;

import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.models.BookingResult;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.AccomodationDetails.AccommodationDetailsService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.AvailabilityService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.LoyaltyService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.NotificationService;
import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.services.PaymentService;

public class BookingManager {
    BookingManagerFacade facade;

    // As you can see here; it looks as if .book() is just a single line of code but
    // behind the scenes in facade lot of things are going on and are abstracted out
    // from here

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
            NotificationService notificationService, LoyaltyService loyaltyService,
            AccommodationDetailsService accommodationDetailsService) {
        this.facade = new BookingManagerFacade(availabilityService, paymentService, notificationService, loyaltyService,
                accommodationDetailsService);
    }

    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate,
            LocalDate checkOutDate) {
        return this.facade.book(userId, accommodationId, checkInDate, checkOutDate);
    }

}
package com.bluetech.protech.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.bluetech.protech.dto.ComponentInventoryDTO;
import com.bluetech.protech.dto.CustomPCBuildDTO;
import com.bluetech.protech.dto.DeliveryDTO;
import com.bluetech.protech.dto.InvoiceDTO;
import com.bluetech.protech.dto.OrdersDTO;
import com.bluetech.protech.dto.PCComponentDTO;
import com.bluetech.protech.dto.PaymentDTO;
import com.bluetech.protech.dto.ReviewFeedbackDTO;
import com.bluetech.protech.dto.ServiceRequestDTO;
import com.bluetech.protech.dto.UserDTO;
import com.bluetech.protech.pojo.ComponentInventory;
import com.bluetech.protech.pojo.CustomPCBuild;
import com.bluetech.protech.pojo.Delivery;
import com.bluetech.protech.pojo.Invoice;
import com.bluetech.protech.pojo.Orders;
import com.bluetech.protech.pojo.PCComponent;
import com.bluetech.protech.pojo.Payment;
import com.bluetech.protech.pojo.ReviewFeedback;
import com.bluetech.protech.pojo.ServiceRequest;
import com.bluetech.protech.pojo.User;

@Mapper(componentModel = "spring")
public interface Mapstruct {

	List<User> userDTOsToUsers(List<UserDTO> userDTOList);

	List<UserDTO> usersToUserDTOs(List<User> userList);

	List<ComponentInventory> componentInventoryDTOsToComponents(List<ComponentInventoryDTO> componentInventoryDTOs);

	List<ComponentInventoryDTO> componentsToComponentInventoryDTOs(List<ComponentInventory> components);

	List<CustomPCBuild> customPCBuildDTOsToCustomPCBuilds(List<CustomPCBuildDTO> customPCBuildDTOs);

	List<CustomPCBuildDTO> customPCBuildsToCustomPCBuildDTOs(List<CustomPCBuild> customPCBuilds);

	List<Delivery> deliveryDTOsToDeliveries(List<DeliveryDTO> deliveryDTOs);

	List<DeliveryDTO> deliveriesToDeliveryDTOs(List<Delivery> deliveries);

	List<Invoice> invoiceDTOsToInvoices(List<InvoiceDTO> invoiceDTOs);

	List<InvoiceDTO> invoicesToInvoiceDTOs(List<Invoice> invoices);

	OrdersDTO ordersToOrdersDTO(Orders order);
	
	List<Orders> ordersDTOsToOrders(List<OrdersDTO> ordersDTOs);

	List<OrdersDTO> ordersToOrdersDTOs(List<Orders> orders);

	List<Payment> paymentDTOsToPayments(List<PaymentDTO> paymentDTOs);

	List<PaymentDTO> paymentsToPaymentDTOs(List<Payment> payments);

	List<PCComponent> pcComponentDTOsToPCComponents(List<PCComponentDTO> pcComponentDTOs);

	List<PCComponentDTO> pcComponentsToPCComponentDTOs(List<PCComponent> pcComponents);

	List<ReviewFeedback> reviewFeedbackDTOsToReviewFeedbacks(List<ReviewFeedbackDTO> reviewFeedbackDTOs);

	List<ReviewFeedbackDTO> reviewFeedbacksToReviewFeedbackDTOs(List<ReviewFeedback> reviewFeedbacks);

	List<ServiceRequest> serviceRequestDTOsToServiceRequests(List<ServiceRequestDTO> serviceRequestDTOs);

	List<ServiceRequestDTO> serviceRequestsToServiceRequestDTOs(List<ServiceRequest> serviceRequests);
}

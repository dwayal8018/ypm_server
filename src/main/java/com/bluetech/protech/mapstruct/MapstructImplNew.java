package com.bluetech.protech.mapstruct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

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

@Service
public class MapstructImplNew implements Mapstruct {

	@Override
	public List<User> userDTOsToUsers(List<UserDTO> userDTOList) {
		if (userDTOList == null) {
			return null;
		}

		List<User> list = new ArrayList<User>(userDTOList.size());
		for (UserDTO userDTO : userDTOList) {
			list.add(userDTOToUser(userDTO));
		}

		return list;
	}

	@Override
	public List<UserDTO> usersToUserDTOs(List<User> userList) {
		if (userList == null) {
			return null;
		}

		List<UserDTO> list = new ArrayList<UserDTO>(userList.size());
		for (User user : userList) {
			list.add(userToUserDTO(user));
		}

		return list;
	}

	@Override
	public List<ComponentInventory> componentInventoryDTOsToComponents(
			List<ComponentInventoryDTO> componentInventoryDTOs) {
		if (componentInventoryDTOs == null) {
			return null;
		}

		List<ComponentInventory> list = new ArrayList<ComponentInventory>(componentInventoryDTOs.size());
		for (ComponentInventoryDTO componentInventoryDTO : componentInventoryDTOs) {
			list.add(componentInventoryDTOToComponentInventory(componentInventoryDTO));
		}

		return list;
	}

	@Override
	public List<ComponentInventoryDTO> componentsToComponentInventoryDTOs(List<ComponentInventory> components) {
		if (components == null) {
			return null;
		}

		List<ComponentInventoryDTO> list = new ArrayList<ComponentInventoryDTO>(components.size());
		for (ComponentInventory componentInventory : components) {
			list.add(componentInventoryToComponentInventoryDTO(componentInventory));
		}

		return list;
	}

	@Override
	public List<CustomPCBuild> customPCBuildDTOsToCustomPCBuilds(List<CustomPCBuildDTO> customPCBuildDTOs) {
		if (customPCBuildDTOs == null) {
			return null;
		}

		List<CustomPCBuild> list = new ArrayList<CustomPCBuild>(customPCBuildDTOs.size());
		for (CustomPCBuildDTO customPCBuildDTO : customPCBuildDTOs) {
			list.add(customPCBuildDTOToCustomPCBuild(customPCBuildDTO));
		}

		return list;
	}

	@Override
	public List<CustomPCBuildDTO> customPCBuildsToCustomPCBuildDTOs(List<CustomPCBuild> customPCBuilds) {
		if (customPCBuilds == null) {
			return null;
		}

		List<CustomPCBuildDTO> list = new ArrayList<CustomPCBuildDTO>(customPCBuilds.size());
		for (CustomPCBuild customPCBuild : customPCBuilds) {
			list.add(customPCBuildToCustomPCBuildDTO(customPCBuild));
		}

		return list;
	}

	@Override
	public List<Delivery> deliveryDTOsToDeliveries(List<DeliveryDTO> deliveryDTOs) {
		if (deliveryDTOs == null) {
			return null;
		}

		List<Delivery> list = new ArrayList<Delivery>(deliveryDTOs.size());
		for (DeliveryDTO deliveryDTO : deliveryDTOs) {
			list.add(deliveryDTOToDelivery(deliveryDTO));
		}

		return list;
	}

	@Override
	public List<DeliveryDTO> deliveriesToDeliveryDTOs(List<Delivery> deliveries) {
		if (deliveries == null) {
			return null;
		}

		List<DeliveryDTO> list = new ArrayList<DeliveryDTO>(deliveries.size());
		for (Delivery delivery : deliveries) {
			list.add(deliveryToDeliveryDTO(delivery));
		}

		return list;
	}

	@Override
	public List<Invoice> invoiceDTOsToInvoices(List<InvoiceDTO> invoiceDTOs) {
		if (invoiceDTOs == null) {
			return null;
		}

		List<Invoice> list = new ArrayList<Invoice>(invoiceDTOs.size());
		for (InvoiceDTO invoiceDTO : invoiceDTOs) {
			list.add(invoiceDTOToInvoice(invoiceDTO));
		}

		return list;
	}

	@Override
	public List<InvoiceDTO> invoicesToInvoiceDTOs(List<Invoice> invoices) {
		if (invoices == null) {
			return null;
		}

		List<InvoiceDTO> list = new ArrayList<InvoiceDTO>(invoices.size());
		for (Invoice invoice : invoices) {
			list.add(invoiceToInvoiceDTO(invoice));
		}

		return list;
	}

	@Override
	public OrdersDTO ordersToOrdersDTO(Orders order) {
		if (order == null) {
			return null;
		}

		OrdersDTO ordersDTO = new OrdersDTO();
		ordersDTO.setClient(userToUserDTO(order.getClient()));
		ordersDTO.setCustomPCBuild(customPCBuildToCustomPCBuildDTO(order.getCustomPCBuild()));
		ordersDTO.setOrderDate(order.getOrderDate());
		ordersDTO.setOrderID(order.getOrderID());
		ordersDTO.setOrderStatus(order.getOrderStatus());
		ordersDTO.setServiceRequest(serviceRequestToServiceRequestDTO(order.getServiceRequest()));
		ordersDTO.setTotalCost(order.getTotalCost());

		return ordersDTO;
	}

	@Override
	public List<Orders> ordersDTOsToOrders(List<OrdersDTO> ordersDTOs) {
		if (ordersDTOs == null) {
			return null;
		}

		List<Orders> list = new ArrayList<Orders>(ordersDTOs.size());
		for (OrdersDTO ordersDTO : ordersDTOs) {
			list.add(ordersDTOToOrders(ordersDTO));
		}

		return list;
	}

	@Override
	public List<OrdersDTO> ordersToOrdersDTOs(List<Orders> orders) {
		if (orders == null) {
			return null;
		}

		List<OrdersDTO> list = new ArrayList<OrdersDTO>(orders.size());
		for (Orders orders1 : orders) {
			list.add(ordersToOrdersDTO(orders1));
		}

		return list;
	}

	@Override
	public List<Payment> paymentDTOsToPayments(List<PaymentDTO> paymentDTOs) {
		if (paymentDTOs == null) {
			return null;
		}

		List<Payment> list = new ArrayList<Payment>(paymentDTOs.size());
		for (PaymentDTO paymentDTO : paymentDTOs) {
			list.add(paymentDTOToPayment(paymentDTO));
		}

		return list;
	}

	@Override
	public List<PaymentDTO> paymentsToPaymentDTOs(List<Payment> payments) {
		if (payments == null) {
			return null;
		}

		List<PaymentDTO> list = new ArrayList<PaymentDTO>(payments.size());
		for (Payment payment : payments) {
			list.add(paymentToPaymentDTO(payment));
		}

		return list;
	}

	@Override
	public List<PCComponent> pcComponentDTOsToPCComponents(List<PCComponentDTO> pcComponentDTOs) {
		if (pcComponentDTOs == null) {
			return null;
		}

		List<PCComponent> list = new ArrayList<PCComponent>(pcComponentDTOs.size());
		for (PCComponentDTO pCComponentDTO : pcComponentDTOs) {
			list.add(pCComponentDTOToPCComponent(pCComponentDTO));
		}

		return list;
	}

	@Override
	public List<PCComponentDTO> pcComponentsToPCComponentDTOs(List<PCComponent> pcComponents) {
		if (pcComponents == null) {
			return null;
		}

		List<PCComponentDTO> list = new ArrayList<PCComponentDTO>(pcComponents.size());
		for (PCComponent pCComponent : pcComponents) {
			list.add(pCComponentToPCComponentDTO(pCComponent));
		}

		return list;
	}

	@Override
	public List<ReviewFeedback> reviewFeedbackDTOsToReviewFeedbacks(List<ReviewFeedbackDTO> reviewFeedbackDTOs) {
		if (reviewFeedbackDTOs == null) {
			return null;
		}

		List<ReviewFeedback> list = new ArrayList<ReviewFeedback>(reviewFeedbackDTOs.size());
		for (ReviewFeedbackDTO reviewFeedbackDTO : reviewFeedbackDTOs) {
			list.add(reviewFeedbackDTOToReviewFeedback(reviewFeedbackDTO));
		}

		return list;
	}

	@Override
	public List<ReviewFeedbackDTO> reviewFeedbacksToReviewFeedbackDTOs(List<ReviewFeedback> reviewFeedbacks) {
		if (reviewFeedbacks == null) {
			return null;
		}

		List<ReviewFeedbackDTO> list = new ArrayList<ReviewFeedbackDTO>(reviewFeedbacks.size());
		for (ReviewFeedback reviewFeedback : reviewFeedbacks) {
			list.add(reviewFeedbackToReviewFeedbackDTO(reviewFeedback));
		}

		return list;
	}

	@Override
	public List<ServiceRequest> serviceRequestDTOsToServiceRequests(List<ServiceRequestDTO> serviceRequestDTOs) {
		if (serviceRequestDTOs == null) {
			return null;
		}

		List<ServiceRequest> list = new ArrayList<ServiceRequest>(serviceRequestDTOs.size());
		for (ServiceRequestDTO serviceRequestDTO : serviceRequestDTOs) {
			list.add(serviceRequestDTOToServiceRequest(serviceRequestDTO));
		}

		return list;
	}

	@Override
	public List<ServiceRequestDTO> serviceRequestsToServiceRequestDTOs(List<ServiceRequest> serviceRequests) {
		if (serviceRequests == null) {
			return null;
		}

		List<ServiceRequestDTO> list = new ArrayList<ServiceRequestDTO>(serviceRequests.size());
		for (ServiceRequest serviceRequest : serviceRequests) {
			list.add(serviceRequestToServiceRequestDTO(serviceRequest));
		}

		return list;
	}

	public User userDTOToUser(UserDTO userDTO) {
		if (userDTO == null) {
			return null;
		}

		User user = new User();

		user.setUsername(userDTO.getUsername());
		user.setPassword(userDTO.getPassword());
		user.setUserID(userDTO.getUserID());
		user.setEmail(userDTO.getEmail());
		user.setPhoneNumber(userDTO.getPhoneNumber());
		user.setAddress(userDTO.getAddress());
		user.setRole(userDTO.getRole());

		return user;
	}

	public UserDTO userToUserDTO(User user) {
		if (user == null) {
			return null;
		}

		UserDTO userDTO = new UserDTO();

		userDTO.setUserID(user.getUserID());
		userDTO.setUsername(user.getUsername());
		userDTO.setPassword(user.getPassword());
		userDTO.setEmail(user.getEmail());
		userDTO.setPhoneNumber(user.getPhoneNumber());
		userDTO.setAddress(user.getAddress());
		userDTO.setRole(user.getRole());

		return userDTO;
	}

	public ComponentInventory componentInventoryDTOToComponentInventory(ComponentInventoryDTO componentInventoryDTO) {
		if (componentInventoryDTO == null) {
			return null;
		}

		ComponentInventory componentInventory = new ComponentInventory();

		componentInventory.setComponentInventoryID(componentInventoryDTO.getComponentInventoryID());
		componentInventory.setCustomPCBuild(componentInventoryDTO.getCustomPCBuild());
		componentInventory.setPcComponent(componentInventoryDTO.getPcComponent());
		componentInventory.setQuantity(componentInventoryDTO.getQuantity());

		return componentInventory;
	}

	public ComponentInventoryDTO componentInventoryToComponentInventoryDTO(ComponentInventory componentInventory) {
		if (componentInventory == null) {
			return null;
		}

		ComponentInventoryDTO componentInventoryDTO = new ComponentInventoryDTO();

		componentInventoryDTO.setComponentInventoryID(componentInventory.getComponentInventoryID());
		componentInventoryDTO.setCustomPCBuild(componentInventory.getCustomPCBuild());
		componentInventoryDTO.setPcComponent(componentInventory.getPcComponent());
		componentInventoryDTO.setQuantity(componentInventory.getQuantity());

		return componentInventoryDTO;
	}

	public CustomPCBuild customPCBuildDTOToCustomPCBuild(CustomPCBuildDTO customPCBuildDTO) {
		if (customPCBuildDTO == null) {
			return null;
		}

		CustomPCBuild customPCBuild = new CustomPCBuild();

		customPCBuild.setCustomPCID(customPCBuildDTO.getCustomPCID());
		customPCBuild.setBuildType(customPCBuildDTO.getBuildType());
		customPCBuild.setBudget(customPCBuildDTO.getBudget());
		customPCBuild.setBuildStatus(customPCBuildDTO.getBuildStatus());
		customPCBuild.setClient(userDTOToUser(customPCBuildDTO.getClient()));
		customPCBuild.setTechExpert(userDTOToUser(customPCBuildDTO.getTechExpert()));
		customPCBuild.setAdmin(userDTOToUser(customPCBuildDTO.getAdmin()));

		return customPCBuild;
	}

	public CustomPCBuildDTO customPCBuildToCustomPCBuildDTO(CustomPCBuild customPCBuild) {
		if (customPCBuild == null) {
			return null;
		}

		CustomPCBuildDTO customPCBuildDTO = new CustomPCBuildDTO();

		customPCBuildDTO.setCustomPCID(customPCBuild.getCustomPCID());
		customPCBuildDTO.setBuildType(customPCBuild.getBuildType());
		customPCBuildDTO.setBudget(customPCBuild.getBudget());
		customPCBuildDTO.setBuildStatus(customPCBuild.getBuildStatus());
		customPCBuildDTO.setClient(userToUserDTO(customPCBuild.getClient()));
		customPCBuildDTO.setTechExpert(userToUserDTO(customPCBuild.getTechExpert()));
		customPCBuildDTO.setAdmin(userToUserDTO(customPCBuild.getAdmin()));

		return customPCBuildDTO;
	}

	public Orders ordersDTOToOrders(OrdersDTO ordersDTO) {
		if (ordersDTO == null) {
			return null;
		}

		Orders orders = new Orders();
		return orders;
	}

	public Delivery deliveryDTOToDelivery(DeliveryDTO deliveryDTO) {
		if (deliveryDTO == null) {
			return null;
		}

		Delivery delivery = new Delivery();

		delivery.setDeliveryID(deliveryDTO.getDeliveryID());
		delivery.setDeliveryStatus(deliveryDTO.getDeliveryStatus());
		delivery.setDeliveryAddress(deliveryDTO.getDeliveryAddress());
		delivery.setClient(userDTOToUser(deliveryDTO.getClient()));
		delivery.setDeliveryPerson(userDTOToUser(deliveryDTO.getDeliveryPerson()));
		delivery.setOrder(ordersDTOToOrders(deliveryDTO.getOrder()));

		return delivery;
	}

	public DeliveryDTO deliveryToDeliveryDTO(Delivery delivery) {
		if (delivery == null) {
			return null;
		}

		DeliveryDTO deliveryDTO = new DeliveryDTO();

		deliveryDTO.setDeliveryID(delivery.getDeliveryID());
		deliveryDTO.setDeliveryStatus(delivery.getDeliveryStatus());
		deliveryDTO.setDeliveryAddress(delivery.getDeliveryAddress());
		deliveryDTO.setClient(userToUserDTO(delivery.getClient()));
		deliveryDTO.setDeliveryPerson(userToUserDTO(delivery.getDeliveryPerson()));
		deliveryDTO.setOrder(ordersToOrdersDTO(delivery.getOrder()));

		return deliveryDTO;
	}

	public Payment paymentDTOToPayment(PaymentDTO paymentDTO) {
		if (paymentDTO == null) {
			return null;
		}

		Payment payment = new Payment();

		payment.setPaymentID(paymentDTO.getPaymentID());
		payment.setPaymentMethod(paymentDTO.getPaymentMethod());
		payment.setPaymentStatus(paymentDTO.getPaymentStatus());
		payment.setPaymentDate(paymentDTO.getPaymentDate());
		payment.setOrder(ordersDTOToOrders(paymentDTO.getOrder()));

		return payment;
	}

	public Invoice invoiceDTOToInvoice(InvoiceDTO invoiceDTO) {
		if (invoiceDTO == null) {
			return null;
		}

		Invoice invoice = new Invoice();

		invoice.setInvoiceID(invoiceDTO.getInvoiceID());
		invoice.setQuantity(invoiceDTO.getQuantity());
		invoice.setUnitPrice(invoiceDTO.getUnitPrice());
		invoice.setTotalPrice(invoiceDTO.getTotalPrice());
		invoice.setNetAmount(invoiceDTO.getNetAmount());
		invoice.setTransactionID(invoiceDTO.getTransactionID());
		invoice.setPayment(paymentDTOToPayment(invoiceDTO.getPayment()));
		invoice.setOrder(ordersDTOToOrders(invoiceDTO.getOrder()));

		return invoice;
	}

	public PaymentDTO paymentToPaymentDTO(Payment payment) {
		if (payment == null) {
			return null;
		}

		PaymentDTO paymentDTO = new PaymentDTO();

		paymentDTO.setPaymentID(payment.getPaymentID());
		paymentDTO.setPaymentMethod(payment.getPaymentMethod());
		paymentDTO.setPaymentStatus(payment.getPaymentStatus());
		paymentDTO.setPaymentDate(payment.getPaymentDate());
		paymentDTO.setOrder(ordersToOrdersDTO(payment.getOrder()));
		return paymentDTO;
	}

	public InvoiceDTO invoiceToInvoiceDTO(Invoice invoice) {
		if (invoice == null) {
			return null;
		}

		InvoiceDTO invoiceDTO = new InvoiceDTO();

		invoiceDTO.setInvoiceID(invoice.getInvoiceID());
		invoiceDTO.setQuantity(invoice.getQuantity());
		invoiceDTO.setUnitPrice(invoice.getUnitPrice());
		invoiceDTO.setTotalPrice(invoice.getTotalPrice());
		invoiceDTO.setNetAmount(invoice.getNetAmount());
		invoiceDTO.setTransactionID(invoice.getTransactionID());
		invoiceDTO.setPayment(paymentToPaymentDTO(invoice.getPayment()));
		invoiceDTO.setOrder(ordersToOrdersDTO(invoice.getOrder()));

		return invoiceDTO;
	}

	public PCComponent pCComponentDTOToPCComponent(PCComponentDTO pCComponentDTO) {
		if (pCComponentDTO == null) {
			return null;
		}

		PCComponent pCComponent = new PCComponent();

		pCComponent.setPcComponentID(pCComponentDTO.getPcComponentID());
		pCComponent.setComponentModel(pCComponentDTO.getComponentModel());
		pCComponent.setPrice(pCComponentDTO.getPrice());
		pCComponent.setComponentType(pCComponentDTO.getComponentType());

		return pCComponent;
	}

	public PCComponentDTO pCComponentToPCComponentDTO(PCComponent pCComponent) {
		if (pCComponent == null) {
			return null;
		}

		PCComponentDTO pCComponentDTO = new PCComponentDTO();

		pCComponentDTO.setPcComponentID(pCComponent.getPcComponentID());
		pCComponentDTO.setComponentModel(pCComponent.getComponentModel());
		pCComponentDTO.setPrice(pCComponent.getPrice());
		pCComponentDTO.setComponentType(pCComponent.getComponentType());

		return pCComponentDTO;
	}

	public ServiceRequest serviceRequestDTOToServiceRequest(ServiceRequestDTO serviceRequestDTO) {
		if (serviceRequestDTO == null) {
			return null;
		}

		ServiceRequest serviceRequest = new ServiceRequest();

		serviceRequest.setServiceID(serviceRequestDTO.getServiceID());
		serviceRequest.setServiceReqDate(serviceRequestDTO.getServiceReqDate());
		serviceRequest.setServiceReqStatus(serviceRequestDTO.getServiceReqStatus());
		serviceRequest.setType(serviceRequestDTO.getType());
		serviceRequest.setPriority(serviceRequestDTO.getPriority());
		serviceRequest.setClient(userDTOToUser(serviceRequestDTO.getClient()));
		serviceRequest.setTechExpert(userDTOToUser(serviceRequestDTO.getTechExpert()));

		return serviceRequest;
	}

	public ReviewFeedback reviewFeedbackDTOToReviewFeedback(ReviewFeedbackDTO reviewFeedbackDTO) {
		if (reviewFeedbackDTO == null) {
			return null;
		}

		ReviewFeedback reviewFeedback = new ReviewFeedback();

		reviewFeedback.setReviewID(reviewFeedbackDTO.getReviewID());
		reviewFeedback.setReviewRating(reviewFeedbackDTO.getReviewRating());
		reviewFeedback.setFeedback(reviewFeedbackDTO.getFeedback());
		reviewFeedback.setTechExpert(userDTOToUser(reviewFeedbackDTO.getTechExpert()));
		reviewFeedback.setClient(userDTOToUser(reviewFeedbackDTO.getClient()));
		reviewFeedback.setServiceRequest(serviceRequestDTOToServiceRequest(reviewFeedbackDTO.getServiceRequest()));

		return reviewFeedback;
	}

	public ServiceRequestDTO serviceRequestToServiceRequestDTO(ServiceRequest serviceRequest) {
		if (serviceRequest == null) {
			return null;
		}

		ServiceRequestDTO serviceRequestDTO = new ServiceRequestDTO();

		serviceRequestDTO.setServiceID(serviceRequest.getServiceID());
		serviceRequestDTO.setServiceReqDate(serviceRequest.getServiceReqDate());
		serviceRequestDTO.setServiceReqStatus(serviceRequest.getServiceReqStatus());
		serviceRequestDTO.setType(serviceRequest.getType());
		serviceRequestDTO.setPriority(serviceRequest.getPriority());
		serviceRequestDTO.setClient(userToUserDTO(serviceRequest.getClient()));
		serviceRequestDTO.setTechExpert(userToUserDTO(serviceRequest.getTechExpert()));

		return serviceRequestDTO;
	}

	public ReviewFeedbackDTO reviewFeedbackToReviewFeedbackDTO(ReviewFeedback reviewFeedback) {
		if (reviewFeedback == null) {
			return null;
		}

		ReviewFeedbackDTO reviewFeedbackDTO = new ReviewFeedbackDTO();

		reviewFeedbackDTO.setReviewID(reviewFeedback.getReviewID());
		reviewFeedbackDTO.setReviewRating(reviewFeedback.getReviewRating());
		reviewFeedbackDTO.setFeedback(reviewFeedback.getFeedback());
		reviewFeedbackDTO.setTechExpert(userToUserDTO(reviewFeedback.getTechExpert()));
		reviewFeedbackDTO.setClient(userToUserDTO(reviewFeedback.getClient()));
		reviewFeedbackDTO.setServiceRequest(serviceRequestToServiceRequestDTO(reviewFeedback.getServiceRequest()));

		return reviewFeedbackDTO;
	}
}

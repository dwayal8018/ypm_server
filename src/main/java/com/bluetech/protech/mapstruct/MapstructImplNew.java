package com.bluetech.protech.mapstruct;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
	        if ( userDTOList == null ) {
	            return null;
	        }

	        List<User> list = new ArrayList<User>( userDTOList.size() );
	        for ( UserDTO userDTO : userDTOList ) {
	            list.add( userDTOToUser( userDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<UserDTO> usersToUserDTOs(List<User> userList) {
	        if ( userList == null ) {
	            return null;
	        }

	        List<UserDTO> list = new ArrayList<UserDTO>( userList.size() );
	        for ( User user : userList ) {
	            list.add( userToUserDTO( user ) );
	        }

	        return list;
	    }

	    @Override
	    public List<ComponentInventory> componentInventoryDTOsToComponents(List<ComponentInventoryDTO> componentInventoryDTOs) {
	        if ( componentInventoryDTOs == null ) {
	            return null;
	        }

	        List<ComponentInventory> list = new ArrayList<ComponentInventory>( componentInventoryDTOs.size() );
	        for ( ComponentInventoryDTO componentInventoryDTO : componentInventoryDTOs ) {
	            list.add( componentInventoryDTOToComponentInventory( componentInventoryDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<ComponentInventoryDTO> componentsToComponentInventoryDTOs(List<ComponentInventory> components) {
	        if ( components == null ) {
	            return null;
	        }

	        List<ComponentInventoryDTO> list = new ArrayList<ComponentInventoryDTO>( components.size() );
	        for ( ComponentInventory componentInventory : components ) {
	            list.add( componentInventoryToComponentInventoryDTO( componentInventory ) );
	        }

	        return list;
	    }

	    @Override
	    public List<CustomPCBuild> customPCBuildDTOsToCustomPCBuilds(List<CustomPCBuildDTO> customPCBuildDTOs) {
	        if ( customPCBuildDTOs == null ) {
	            return null;
	        }

	        List<CustomPCBuild> list = new ArrayList<CustomPCBuild>( customPCBuildDTOs.size() );
	        for ( CustomPCBuildDTO customPCBuildDTO : customPCBuildDTOs ) {
	            list.add( customPCBuildDTOToCustomPCBuild( customPCBuildDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<CustomPCBuildDTO> customPCBuildsToCustomPCBuildDTOs(List<CustomPCBuild> customPCBuilds) {
	        if ( customPCBuilds == null ) {
	            return null;
	        }

	        List<CustomPCBuildDTO> list = new ArrayList<CustomPCBuildDTO>( customPCBuilds.size() );
	        for ( CustomPCBuild customPCBuild : customPCBuilds ) {
	            list.add( customPCBuildToCustomPCBuildDTO( customPCBuild ) );
	        }

	        return list;
	    }

	    @Override
	    public List<Delivery> deliveryDTOsToDeliveries(List<DeliveryDTO> deliveryDTOs) {
	        if ( deliveryDTOs == null ) {
	            return null;
	        }

	        List<Delivery> list = new ArrayList<Delivery>( deliveryDTOs.size() );
	        for ( DeliveryDTO deliveryDTO : deliveryDTOs ) {
	            list.add( deliveryDTOToDelivery( deliveryDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<DeliveryDTO> deliveriesToDeliveryDTOs(List<Delivery> deliveries) {
	        if ( deliveries == null ) {
	            return null;
	        }

	        List<DeliveryDTO> list = new ArrayList<DeliveryDTO>( deliveries.size() );
	        for ( Delivery delivery : deliveries ) {
	            list.add( deliveryToDeliveryDTO( delivery ) );
	        }

	        return list;
	    }

	    @Override
	    public List<Invoice> invoiceDTOsToInvoices(List<InvoiceDTO> invoiceDTOs) {
	        if ( invoiceDTOs == null ) {
	            return null;
	        }

	        List<Invoice> list = new ArrayList<Invoice>( invoiceDTOs.size() );
	        for ( InvoiceDTO invoiceDTO : invoiceDTOs ) {
	            list.add( invoiceDTOToInvoice( invoiceDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<InvoiceDTO> invoicesToInvoiceDTOs(List<Invoice> invoices) {
	        if ( invoices == null ) {
	            return null;
	        }

	        List<InvoiceDTO> list = new ArrayList<InvoiceDTO>( invoices.size() );
	        for ( Invoice invoice : invoices ) {
	            list.add( invoiceToInvoiceDTO( invoice ) );
	        }

	        return list;
	    }

	    @Override
	    public List<Orders> ordersDTOsToOrders(List<OrdersDTO> ordersDTOs) {
	        if ( ordersDTOs == null ) {
	            return null;
	        }

	        List<Orders> list = new ArrayList<Orders>( ordersDTOs.size() );
	        for ( OrdersDTO ordersDTO : ordersDTOs ) {
	            list.add( ordersDTOToOrders( ordersDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<OrdersDTO> ordersToOrdersDTOs(List<Orders> orders) {
	        if ( orders == null ) {
	            return null;
	        }

	        List<OrdersDTO> list = new ArrayList<OrdersDTO>( orders.size() );
	        for ( Orders orders1 : orders ) {
	            list.add( ordersToOrdersDTO( orders1 ) );
	        }

	        return list;
	    }

	    @Override
	    public List<Payment> paymentDTOsToPayments(List<PaymentDTO> paymentDTOs) {
	        if ( paymentDTOs == null ) {
	            return null;
	        }

	        List<Payment> list = new ArrayList<Payment>( paymentDTOs.size() );
	        for ( PaymentDTO paymentDTO : paymentDTOs ) {
	            list.add( paymentDTOToPayment( paymentDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<PaymentDTO> paymentsToPaymentDTOs(List<Payment> payments) {
	        if ( payments == null ) {
	            return null;
	        }

	        List<PaymentDTO> list = new ArrayList<PaymentDTO>( payments.size() );
	        for ( Payment payment : payments ) {
	            list.add( paymentToPaymentDTO( payment ) );
	        }

	        return list;
	    }

	    @Override
	    public List<PCComponent> pcComponentDTOsToPCComponents(List<PCComponentDTO> pcComponentDTOs) {
	        if ( pcComponentDTOs == null ) {
	            return null;
	        }

	        List<PCComponent> list = new ArrayList<PCComponent>( pcComponentDTOs.size() );
	        for ( PCComponentDTO pCComponentDTO : pcComponentDTOs ) {
	            list.add( pCComponentDTOToPCComponent( pCComponentDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<PCComponentDTO> pcComponentsToPCComponentDTOs(List<PCComponent> pcComponents) {
	        if ( pcComponents == null ) {
	            return null;
	        }

	        List<PCComponentDTO> list = new ArrayList<PCComponentDTO>( pcComponents.size() );
	        for ( PCComponent pCComponent : pcComponents ) {
	            list.add( pCComponentToPCComponentDTO( pCComponent ) );
	        }

	        return list;
	    }

	    @Override
	    public List<ReviewFeedback> reviewFeedbackDTOsToReviewFeedbacks(List<ReviewFeedbackDTO> reviewFeedbackDTOs) {
	        if ( reviewFeedbackDTOs == null ) {
	            return null;
	        }

	        List<ReviewFeedback> list = new ArrayList<ReviewFeedback>( reviewFeedbackDTOs.size() );
	        for ( ReviewFeedbackDTO reviewFeedbackDTO : reviewFeedbackDTOs ) {
	            list.add( reviewFeedbackDTOToReviewFeedback( reviewFeedbackDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<ReviewFeedbackDTO> reviewFeedbacksToReviewFeedbackDTOs(List<ReviewFeedback> reviewFeedbacks) {
	        if ( reviewFeedbacks == null ) {
	            return null;
	        }

	        List<ReviewFeedbackDTO> list = new ArrayList<ReviewFeedbackDTO>( reviewFeedbacks.size() );
	        for ( ReviewFeedback reviewFeedback : reviewFeedbacks ) {
	            list.add( reviewFeedbackToReviewFeedbackDTO( reviewFeedback ) );
	        }

	        return list;
	    }

	    @Override
	    public List<ServiceRequest> serviceRequestDTOsToServiceRequests(List<ServiceRequestDTO> serviceRequestDTOs) {
	        if ( serviceRequestDTOs == null ) {
	            return null;
	        }

	        List<ServiceRequest> list = new ArrayList<ServiceRequest>( serviceRequestDTOs.size() );
	        for ( ServiceRequestDTO serviceRequestDTO : serviceRequestDTOs ) {
	            list.add( serviceRequestDTOToServiceRequest( serviceRequestDTO ) );
	        }

	        return list;
	    }

	    @Override
	    public List<ServiceRequestDTO> serviceRequestsToServiceRequestDTOs(List<ServiceRequest> serviceRequests) {
	        if ( serviceRequests == null ) {
	            return null;
	        }

	        List<ServiceRequestDTO> list = new ArrayList<ServiceRequestDTO>( serviceRequests.size() );
	        for ( ServiceRequest serviceRequest : serviceRequests ) {
	            list.add( serviceRequestToServiceRequestDTO( serviceRequest ) );
	        }

	        return list;
	    }

	    public User userDTOToUser(UserDTO userDTO) {
	        if ( userDTO == null ) {
	            return null;
	        }

	        User user = new User();

	        user.setAddress( userDTO.getAddress() );
	        user.setEmail( userDTO.getEmail() );
	        user.setPassword( userDTO.getPassword() );
	        user.setPhoneNumber( userDTO.getPhoneNumber() );
	        user.setRole( userDTO.getRole() );
	        user.setUserID( userDTO.getUserID() );
	        user.setUsername( userDTO.getUsername() );

	        return user;
	    }

	    public UserDTO userToUserDTO(User user) {
	        if ( user == null ) {
	            return null;
	        }

	        UserDTO userDTO = new UserDTO();

	        userDTO.setAddress( user.getAddress() );
	        userDTO.setEmail( user.getEmail() );
	        userDTO.setPassword( user.getPassword() );
	        userDTO.setPhoneNumber( user.getPhoneNumber() );
	        userDTO.setRole( user.getRole() );
	        userDTO.setUserID( user.getUserID() );
	        userDTO.setUsername( user.getUsername() );

	        return userDTO;
	    }

	    public ComponentInventory componentInventoryDTOToComponentInventory(ComponentInventoryDTO componentInventoryDTO) {
	        if ( componentInventoryDTO == null ) {
	            return null;
	        }

	        ComponentInventory componentInventory = new ComponentInventory();

	        componentInventory.setComponentInventoryID( componentInventoryDTO.getComponentInventoryID() );
	        componentInventory.setCustomPCBuild( componentInventoryDTO.getCustomPCBuild() );
	        componentInventory.setPcComponent( componentInventoryDTO.getPcComponent() );
	        componentInventory.setQuantity( componentInventoryDTO.getQuantity() );

	        return componentInventory;
	    }

	    public ComponentInventoryDTO componentInventoryToComponentInventoryDTO(ComponentInventory componentInventory) {
	        if ( componentInventory == null ) {
	            return null;
	        }

	        ComponentInventoryDTO componentInventoryDTO = new ComponentInventoryDTO();

	        componentInventoryDTO.setComponentInventoryID( componentInventory.getComponentInventoryID() );
	        componentInventoryDTO.setCustomPCBuild( componentInventory.getCustomPCBuild() );
	        componentInventoryDTO.setPcComponent( componentInventory.getPcComponent() );
	        componentInventoryDTO.setQuantity( componentInventory.getQuantity() );

	        return componentInventoryDTO;
	    }

	    public CustomPCBuild customPCBuildDTOToCustomPCBuild(CustomPCBuildDTO customPCBuildDTO) {
	        if ( customPCBuildDTO == null ) {
	            return null;
	        }

	        CustomPCBuild customPCBuild = new CustomPCBuild();

	        customPCBuild.setAdmin( userDTOToUser( customPCBuildDTO.getAdmin() ) );
	        customPCBuild.setBudget( customPCBuildDTO.getBudget() );
	        customPCBuild.setBuildStatus( customPCBuildDTO.getBuildStatus() );
	        customPCBuild.setBuildType( customPCBuildDTO.getBuildType() );
	        customPCBuild.setClient( userDTOToUser( customPCBuildDTO.getClient() ) );
	        customPCBuild.setCustomPCID( customPCBuildDTO.getCustomPCID() );
	        customPCBuild.setTechExpert( userDTOToUser( customPCBuildDTO.getTechExpert() ) );

	        return customPCBuild;
	    }

	    public CustomPCBuildDTO customPCBuildToCustomPCBuildDTO(CustomPCBuild customPCBuild) {
	        if ( customPCBuild == null ) {
	            return null;
	        }

	        CustomPCBuildDTO customPCBuildDTO = new CustomPCBuildDTO();

	        customPCBuildDTO.setAdmin( userToUserDTO( customPCBuild.getAdmin() ) );
	        customPCBuildDTO.setBudget( customPCBuild.getBudget() );
	        customPCBuildDTO.setBuildStatus( customPCBuild.getBuildStatus() );
	        customPCBuildDTO.setBuildType( customPCBuild.getBuildType() );
	        customPCBuildDTO.setClient( userToUserDTO( customPCBuild.getClient() ) );
	        customPCBuildDTO.setCustomPCID( customPCBuild.getCustomPCID() );
	        customPCBuildDTO.setTechExpert( userToUserDTO( customPCBuild.getTechExpert() ) );

	        return customPCBuildDTO;
	    }

	    public Set<Delivery> deliveryDTOSetToDeliverySet(Set<DeliveryDTO> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<Delivery> set1 = new LinkedHashSet<Delivery>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( DeliveryDTO deliveryDTO : set ) {
	            set1.add( deliveryDTOToDelivery( deliveryDTO ) );
	        }

	        return set1;
	    }

	    public Payment paymentDTOToPayment(PaymentDTO paymentDTO) {
	        if ( paymentDTO == null ) {
	            return null;
	        }

	        Payment payment = new Payment();

	        payment.setOrder( ordersDTOToOrders( paymentDTO.getOrder() ) );
	        payment.setPaymentDate( paymentDTO.getPaymentDate() );
	        payment.setPaymentID( paymentDTO.getPaymentID() );
	        payment.setPaymentMethod( paymentDTO.getPaymentMethod() );
	        payment.setPaymentStatus( paymentDTO.getPaymentStatus() );

	        return payment;
	    }

	    public Invoice invoiceDTOToInvoice(InvoiceDTO invoiceDTO) {
	        if ( invoiceDTO == null ) {
	            return null;
	        }

	        Invoice invoice = new Invoice();

	        invoice.setInvoiceID( invoiceDTO.getInvoiceID() );
	        invoice.setNetAmount( invoiceDTO.getNetAmount() );
	        invoice.setOrder( ordersDTOToOrders( invoiceDTO.getOrder() ) );
	        invoice.setPayment( paymentDTOToPayment( invoiceDTO.getPayment() ) );
	        invoice.setQuantity( invoiceDTO.getQuantity() );
	        invoice.setTotalPrice( invoiceDTO.getTotalPrice() );
	        invoice.setTransactionID( invoiceDTO.getTransactionID() );
	        invoice.setUnitPrice( invoiceDTO.getUnitPrice() );

	        return invoice;
	    }

	    public Set<Invoice> invoiceDTOSetToInvoiceSet(Set<InvoiceDTO> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<Invoice> set1 = new LinkedHashSet<Invoice>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( InvoiceDTO invoiceDTO : set ) {
	            set1.add( invoiceDTOToInvoice( invoiceDTO ) );
	        }

	        return set1;
	    }

	    public Set<Payment> paymentDTOSetToPaymentSet(Set<PaymentDTO> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<Payment> set1 = new LinkedHashSet<Payment>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( PaymentDTO paymentDTO : set ) {
	            set1.add( paymentDTOToPayment( paymentDTO ) );
	        }

	        return set1;
	    }

	    public Orders ordersDTOToOrders(OrdersDTO ordersDTO) {
	        if ( ordersDTO == null ) {
	            return null;
	        }

	        Orders orders = new Orders();

	        orders.setClient( ordersDTO.getClient() );
	        orders.setCustomPCBuild( ordersDTO.getCustomPCBuild() );
	        orders.setDeliveries( deliveryDTOSetToDeliverySet( ordersDTO.getDeliveries() ) );
	        orders.setInvoices( invoiceDTOSetToInvoiceSet( ordersDTO.getInvoices() ) );
	        orders.setOrderDate( ordersDTO.getOrderDate() );
	        orders.setOrderID( ordersDTO.getOrderID() );
	        orders.setOrderStatus( ordersDTO.getOrderStatus() );
	        orders.setPayments( paymentDTOSetToPaymentSet( ordersDTO.getPayments() ) );
	        orders.setServiceRequest( ordersDTO.getServiceRequest() );
	        orders.setTotalCost( ordersDTO.getTotalCost() );

	        return orders;
	    }

	    public Delivery deliveryDTOToDelivery(DeliveryDTO deliveryDTO) {
	        if ( deliveryDTO == null ) {
	            return null;
	        }

	        Delivery delivery = new Delivery();

	        delivery.setClient( userDTOToUser( deliveryDTO.getClient() ) );
	        delivery.setDeliveryAddress( deliveryDTO.getDeliveryAddress() );
	        delivery.setDeliveryID( deliveryDTO.getDeliveryID() );
	        delivery.setDeliveryPerson( userDTOToUser( deliveryDTO.getDeliveryPerson() ) );
	        delivery.setDeliveryStatus( deliveryDTO.getDeliveryStatus() );
	        delivery.setOrder( ordersDTOToOrders( deliveryDTO.getOrder() ) );

	        return delivery;
	    }

	    public Set<DeliveryDTO> deliverySetToDeliveryDTOSet(Set<Delivery> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<DeliveryDTO> set1 = new LinkedHashSet<DeliveryDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( Delivery delivery : set ) {
	            set1.add( deliveryToDeliveryDTO( delivery ) );
	        }

	        return set1;
	    }

	    public PaymentDTO paymentToPaymentDTO(Payment payment) {
	        if ( payment == null ) {
	            return null;
	        }

	        PaymentDTO paymentDTO = new PaymentDTO();

	        paymentDTO.setOrder( ordersToOrdersDTO( payment.getOrder() ) );
	        paymentDTO.setPaymentDate( payment.getPaymentDate() );
	        paymentDTO.setPaymentID( payment.getPaymentID() );
	        paymentDTO.setPaymentMethod( payment.getPaymentMethod() );
	        paymentDTO.setPaymentStatus( payment.getPaymentStatus() );

	        return paymentDTO;
	    }

	    public InvoiceDTO invoiceToInvoiceDTO(Invoice invoice) {
	        if ( invoice == null ) {
	            return null;
	        }

	        InvoiceDTO invoiceDTO = new InvoiceDTO();

	        invoiceDTO.setInvoiceID( invoice.getInvoiceID() );
	        invoiceDTO.setNetAmount( invoice.getNetAmount() );
	        invoiceDTO.setOrder( ordersToOrdersDTO( invoice.getOrder() ) );
	        invoiceDTO.setPayment( paymentToPaymentDTO( invoice.getPayment() ) );
	        invoiceDTO.setQuantity( invoice.getQuantity() );
	        invoiceDTO.setTotalPrice( invoice.getTotalPrice() );
	        invoiceDTO.setTransactionID( invoice.getTransactionID() );
	        invoiceDTO.setUnitPrice( invoice.getUnitPrice() );

	        return invoiceDTO;
	    }

	    public Set<InvoiceDTO> invoiceSetToInvoiceDTOSet(Set<Invoice> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<InvoiceDTO> set1 = new LinkedHashSet<InvoiceDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( Invoice invoice : set ) {
	            set1.add( invoiceToInvoiceDTO( invoice ) );
	        }

	        return set1;
	    }

	    public Set<PaymentDTO> paymentSetToPaymentDTOSet(Set<Payment> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<PaymentDTO> set1 = new LinkedHashSet<PaymentDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( Payment payment : set ) {
	            set1.add( paymentToPaymentDTO( payment ) );
	        }

	        return set1;
	    }

	    public OrdersDTO ordersToOrdersDTO(Orders orders) {
	        if ( orders == null ) {
	            return null;
	        }

	        OrdersDTO ordersDTO = new OrdersDTO();

	        ordersDTO.setClient( orders.getClient() );
	        ordersDTO.setCustomPCBuild( orders.getCustomPCBuild() );
	        ordersDTO.setDeliveries( deliverySetToDeliveryDTOSet( orders.getDeliveries() ) );
	        ordersDTO.setInvoices( invoiceSetToInvoiceDTOSet( orders.getInvoices() ) );
	        ordersDTO.setOrderDate( orders.getOrderDate() );
	        ordersDTO.setOrderID( orders.getOrderID() );
	        ordersDTO.setOrderStatus( orders.getOrderStatus() );
	        ordersDTO.setPayments( paymentSetToPaymentDTOSet( orders.getPayments() ) );
	        ordersDTO.setServiceRequest( orders.getServiceRequest() );
	        ordersDTO.setTotalCost( orders.getTotalCost() );

	        return ordersDTO;
	    }

	    public DeliveryDTO deliveryToDeliveryDTO(Delivery delivery) {
	        if ( delivery == null ) {
	            return null;
	        }

	        DeliveryDTO deliveryDTO = new DeliveryDTO();

	        deliveryDTO.setClient( userToUserDTO( delivery.getClient() ) );
	        deliveryDTO.setDeliveryAddress( delivery.getDeliveryAddress() );
	        deliveryDTO.setDeliveryID( delivery.getDeliveryID() );
	        deliveryDTO.setDeliveryPerson( userToUserDTO( delivery.getDeliveryPerson() ) );
	        deliveryDTO.setDeliveryStatus( delivery.getDeliveryStatus() );
	        deliveryDTO.setOrder( ordersToOrdersDTO( delivery.getOrder() ) );

	        return deliveryDTO;
	    }

	    public Set<ComponentInventory> componentInventoryDTOSetToComponentInventorySet(Set<ComponentInventoryDTO> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<ComponentInventory> set1 = new LinkedHashSet<ComponentInventory>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( ComponentInventoryDTO componentInventoryDTO : set ) {
	            set1.add( componentInventoryDTOToComponentInventory( componentInventoryDTO ) );
	        }

	        return set1;
	    }

	    public PCComponent pCComponentDTOToPCComponent(PCComponentDTO pCComponentDTO) {
	        if ( pCComponentDTO == null ) {
	            return null;
	        }

	        PCComponent pCComponent = new PCComponent();

	        pCComponent.setComponentModel( pCComponentDTO.getComponentModel() );
	        pCComponent.setComponentType( pCComponentDTO.getComponentType() );
	        pCComponent.setInventories( componentInventoryDTOSetToComponentInventorySet( pCComponentDTO.getInventories() ) );
	        pCComponent.setPcComponentID( pCComponentDTO.getPcComponentID() );
	        pCComponent.setPrice( pCComponentDTO.getPrice() );

	        return pCComponent;
	    }

	    public Set<ComponentInventoryDTO> componentInventorySetToComponentInventoryDTOSet(Set<ComponentInventory> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<ComponentInventoryDTO> set1 = new LinkedHashSet<ComponentInventoryDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( ComponentInventory componentInventory : set ) {
	            set1.add( componentInventoryToComponentInventoryDTO( componentInventory ) );
	        }

	        return set1;
	    }

	    public PCComponentDTO pCComponentToPCComponentDTO(PCComponent pCComponent) {
	        if ( pCComponent == null ) {
	            return null;
	        }

	        PCComponentDTO pCComponentDTO = new PCComponentDTO();

	        pCComponentDTO.setComponentModel( pCComponent.getComponentModel() );
	        pCComponentDTO.setComponentType( pCComponent.getComponentType() );
	        pCComponentDTO.setInventories( componentInventorySetToComponentInventoryDTOSet( pCComponent.getInventories() ) );
	        pCComponentDTO.setPcComponentID( pCComponent.getPcComponentID() );
	        pCComponentDTO.setPrice( pCComponent.getPrice() );

	        return pCComponentDTO;
	    }

	    public Set<Orders> ordersDTOSetToOrdersSet(Set<OrdersDTO> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<Orders> set1 = new LinkedHashSet<Orders>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( OrdersDTO ordersDTO : set ) {
	            set1.add( ordersDTOToOrders( ordersDTO ) );
	        }

	        return set1;
	    }

	    public Set<ReviewFeedback> reviewFeedbackDTOSetToReviewFeedbackSet(Set<ReviewFeedbackDTO> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<ReviewFeedback> set1 = new LinkedHashSet<ReviewFeedback>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( ReviewFeedbackDTO reviewFeedbackDTO : set ) {
	            set1.add( reviewFeedbackDTOToReviewFeedback( reviewFeedbackDTO ) );
	        }

	        return set1;
	    }

	    public ServiceRequest serviceRequestDTOToServiceRequest(ServiceRequestDTO serviceRequestDTO) {
	        if ( serviceRequestDTO == null ) {
	            return null;
	        }

	        ServiceRequest serviceRequest = new ServiceRequest();

	        serviceRequest.setClient( userDTOToUser( serviceRequestDTO.getClient() ) );
	        serviceRequest.setOrders( ordersDTOSetToOrdersSet( serviceRequestDTO.getOrders() ) );
	        serviceRequest.setPriority( serviceRequestDTO.getPriority() );
	        serviceRequest.setReviewFeedbacks( reviewFeedbackDTOSetToReviewFeedbackSet( serviceRequestDTO.getReviewFeedbacks() ) );
	        serviceRequest.setServiceID( serviceRequestDTO.getServiceID() );
	        serviceRequest.setServiceReqDate( serviceRequestDTO.getServiceReqDate() );
	        serviceRequest.setServiceReqStatus( serviceRequestDTO.getServiceReqStatus() );
	        serviceRequest.setTechExpert( userDTOToUser( serviceRequestDTO.getTechExpert() ) );
	        serviceRequest.setType( serviceRequestDTO.getType() );

	        return serviceRequest;
	    }

	    public ReviewFeedback reviewFeedbackDTOToReviewFeedback(ReviewFeedbackDTO reviewFeedbackDTO) {
	        if ( reviewFeedbackDTO == null ) {
	            return null;
	        }

	        ReviewFeedback reviewFeedback = new ReviewFeedback();

	        reviewFeedback.setClient( userDTOToUser( reviewFeedbackDTO.getClient() ) );
	        reviewFeedback.setFeedback( reviewFeedbackDTO.getFeedback() );
	        reviewFeedback.setReviewID( reviewFeedbackDTO.getReviewID() );
	        reviewFeedback.setReviewRating( reviewFeedbackDTO.getReviewRating() );
	        reviewFeedback.setServiceRequest( serviceRequestDTOToServiceRequest( reviewFeedbackDTO.getServiceRequest() ) );
	        reviewFeedback.setTechExpert( userDTOToUser( reviewFeedbackDTO.getTechExpert() ) );

	        return reviewFeedback;
	    }

	    public Set<OrdersDTO> ordersSetToOrdersDTOSet(Set<Orders> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<OrdersDTO> set1 = new LinkedHashSet<OrdersDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( Orders orders : set ) {
	            set1.add( ordersToOrdersDTO( orders ) );
	        }

	        return set1;
	    }

	    public Set<ReviewFeedbackDTO> reviewFeedbackSetToReviewFeedbackDTOSet(Set<ReviewFeedback> set) {
	        if ( set == null ) {
	            return null;
	        }

	        Set<ReviewFeedbackDTO> set1 = new LinkedHashSet<ReviewFeedbackDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
	        for ( ReviewFeedback reviewFeedback : set ) {
	            set1.add( reviewFeedbackToReviewFeedbackDTO( reviewFeedback ) );
	        }

	        return set1;
	    }

	    public ServiceRequestDTO serviceRequestToServiceRequestDTO(ServiceRequest serviceRequest) {
	        if ( serviceRequest == null ) {
	            return null;
	        }

	        ServiceRequestDTO serviceRequestDTO = new ServiceRequestDTO();

	        serviceRequestDTO.setClient( userToUserDTO( serviceRequest.getClient() ) );
	        serviceRequestDTO.setOrders( ordersSetToOrdersDTOSet( serviceRequest.getOrders() ) );
	        serviceRequestDTO.setPriority( serviceRequest.getPriority() );
	        serviceRequestDTO.setReviewFeedbacks( reviewFeedbackSetToReviewFeedbackDTOSet( serviceRequest.getReviewFeedbacks() ) );
	        serviceRequestDTO.setServiceID( serviceRequest.getServiceID() );
	        serviceRequestDTO.setServiceReqDate( serviceRequest.getServiceReqDate() );
	        serviceRequestDTO.setServiceReqStatus( serviceRequest.getServiceReqStatus() );
	        serviceRequestDTO.setTechExpert( userToUserDTO( serviceRequest.getTechExpert() ) );
	        serviceRequestDTO.setType( serviceRequest.getType() );

	        return serviceRequestDTO;
	    }

	    public ReviewFeedbackDTO reviewFeedbackToReviewFeedbackDTO(ReviewFeedback reviewFeedback) {
	        if ( reviewFeedback == null ) {
	            return null;
	        }

	        ReviewFeedbackDTO reviewFeedbackDTO = new ReviewFeedbackDTO();

	        reviewFeedbackDTO.setClient( userToUserDTO( reviewFeedback.getClient() ) );
	        reviewFeedbackDTO.setFeedback( reviewFeedback.getFeedback() );
	        reviewFeedbackDTO.setReviewID( reviewFeedback.getReviewID() );
	        reviewFeedbackDTO.setReviewRating( reviewFeedback.getReviewRating() );
	        reviewFeedbackDTO.setServiceRequest( serviceRequestToServiceRequestDTO( reviewFeedback.getServiceRequest() ) );
	        reviewFeedbackDTO.setTechExpert( userToUserDTO( reviewFeedback.getTechExpert() ) );

	        return reviewFeedbackDTO;
	    }

}

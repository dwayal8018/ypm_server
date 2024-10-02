package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.DeliveryDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.Delivery;
import com.bluetech.protech.repository.DeliveryRepository;
import com.bluetech.protech.service.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	private DeliveryRepository deliveryRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	public List<DeliveryDTO> createDelivery(List<DeliveryDTO> deliveryDTOList) {
		List<Delivery> deliveryList = mapstructImplNew.deliveryDTOsToDeliveries(deliveryDTOList);

		deliveryList = deliveryRepository.saveAll(deliveryList);
		return mapstructImplNew.deliveriesToDeliveryDTOs(deliveryList);
	}

	public List<DeliveryDTO> getAllDeliveries() {
		return deliveryRepository.findAll().stream().map(mapstructImplNew::deliveryToDeliveryDTO)
				.collect(Collectors.toList());
	}

	public Optional<DeliveryDTO> getDeliveryById(Integer id) {
		return deliveryRepository.findById(id).map(mapstructImplNew::deliveryToDeliveryDTO);
	}

	public void deleteDelivery(Integer id) {
		deliveryRepository.deleteById(id);
	}
}

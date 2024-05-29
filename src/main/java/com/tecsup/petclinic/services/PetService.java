package com.tecsup.petclinic.services;

import java.util.Date;
import java.util.List;

import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;

/**
 * 
 * @author jgomezm
 *
 */
public interface PetService {

	/**
	 * 
	 * @param pet
	 * @return
	 */
	Pet create(Pet pet);

	/**
	 * 
	 * @param pet
	 * @return
	 */
	Pet update(Pet pet);

	/**
	 * 
	 * @param id
	 * @throws PetNotFoundException
	 */
	void delete(Integer id) throws PetNotFoundException;

	/**
	 * 
	 * @param id
	 * @return
	 */
	Pet findById(Integer id) throws PetNotFoundException;

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<Pet> findByName(String name);

	/**
	 * 
	 * @param typeId
	 * @return
	 */
	List<Pet> findByTypeId(int typeId);

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	List<Pet> findByOwnerId(int ownerId);

	/**
	 *
	 * @param fecha
	 * @return
	 */
	List<Pet> findBybirthDate(Date fecha);

	/**
	 *
	 * @return
	 */
	List<Pet> findAll();
}
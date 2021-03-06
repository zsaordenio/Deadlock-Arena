package com.deadlockarena.backend.entity;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * This class is to allow an entity to inherit properties from it.
 *
 * @author Phong Vo
 * @version 1.0
 * @since 1.0
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "createdAt" , "createdBy" , "updatedAt" , "updatedBy" })
public abstract class BaseEntity {

	/**
	 * Sequence Style Generator to auto generate id's based on the choices in the
	 * parameters.
	 */
	@GenericGenerator(name = "DeadlockArenaSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "DeadlockArenaSequence") ,
			@Parameter(name = "initial_value", value = "1") ,
			@Parameter(name = "increment_size", value = "1") })

//	@Id
//	@GeneratedValue(generator = "DeadlockArenaSequenceGenerator")
//	private Long id;

	/**
	 * Manages the version of Entities to measure the amount of modifications made
	 * to this entity.
	 */
//	@Version
//	@Column(name = "version")
//	private int version;

	/**
	 * Keeps record of when an Entity wss created.
	 */
	@CreatedDate
	@CreationTimestamp
	private Date createdAt;

	/**
	 * Records who updated an Entity by saving username.
	 */
	@CreatedBy
	private String createdBy;

	/**
	 * Keeps record of when the item was last Modified.
	 */
	@LastModifiedDate
	@UpdateTimestamp
	private Date updatedAt;

	/**
	 * Manages the timestamps for each update made to an Entity.
	 */
	@LastModifiedBy
	private String updatedBy;
}

package com.deadlockarena.backend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.deadlockarena.backend.dto.ChampionDto;
import com.deadlockarena.backend.mapper.ChampionMapper;

import lombok.Data;

/**
 * Maps to {@link ChampionDto} using {@link ChampionMapper}.
 *
 * @author zsaordenio
 *
 */
@Data
@Entity
@Table(name = "CHAMPION", schema = "deadlock")
public class Champion implements Serializable {
	private static final long serialVersionUID = 5195526083757043733L;

	@Id
	@Column(name = "CHAMPION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CHAMPION_SEQ")
	@SequenceGenerator(name = "CHAMPION_SEQ", sequenceName = "CHAMPION_SEQ")
	protected String championId;

	@Column(name = "NAME")
	protected String name;
	@Column(name = "DESCRIPTION")
	protected String description;
	@Column(name = "LOGIC")
	protected int logic;

	@Column(name = "MAX_HP")
	protected int maxHp;
	@Column(name = "MAX_MP")
	protected int maxMp;
	@Column(name = "MIN_DMG")
	protected int minDmg;
	@Column(name = "MAX_DMG")
	protected int maxDmg;
	@Column(name = "DEFENSE")
	protected int defense;
	@Column(name = "CRITICAL")
	protected int critical;
	@Column(name = "DODGE")
	protected int dodge;

	@Column(name = "SKILL1")
	protected String skill1;
	@Column(name = "SKILL2")
	protected String skill2;
	@Column(name = "SKILL3")
	protected String skill3;
	@Column(name = "SKILL4")
	protected String skill4;
	@Column(name = "SKILL5")
	protected String skill5;

	@Column(name = "SKILL1_DESCRIPTION")
	protected String skill1Description;
	@Column(name = "SKILL2_DESCRIPTION")
	protected String skill2Description;
	@Column(name = "SKILL3_DESCRIPTION")
	protected String skill3Description;
	@Column(name = "SKILL4_DESCRIPTION")
	protected String skill4Description;
	@Column(name = "SKILL5_DESCRIPTION")
	protected String skill5Description;

	@Column(name = "SKILL1_MP_COST")
	protected int skill1MpCost;
	@Column(name = "SKILL2_MP_COST")
	protected int skill2MpCost;
	@Column(name = "SKILL3_MP_COST")
	protected int skill3MpCost;
	@Column(name = "SKILL4_MP_COST")
	protected int skill4MpCost;
	@Column(name = "SKILL5_MP_COST")
	protected int skill5MpCost;

	@Column(name = "SKILL1_CD")
	protected int skill1CD;
	@Column(name = "SKILL2_CD")
	protected int skill2CD;
	@Column(name = "SKILL3_CD")
	protected int skill3CD;
	@Column(name = "SKILL4_CD")
	protected int skill4CD;
	@Column(name = "SKILL5_CD")
	protected int skill5CD;

	@Transient
	protected int currentHp;
	@Transient
	protected int currentMp;
	@Transient
	protected int currentDmgMin;
	@Transient
	protected int currentDmgMax;
	@Transient
	protected int currentDefense;
	@Transient
	protected int currentCritical;
	@Transient
	protected int currentDodge;

	@Transient
	protected int currentSkill1CD;
	@Transient
	protected int currentSkill2CD;
	@Transient
	protected int currentSkill3CD;
	@Transient
	protected int currentSkill4CD;
	@Transient
	protected int currentSkill5CD;

	@Transient
	protected PotionInventory potionInventory;
	@Transient
	protected StatusBox statusBox;

}

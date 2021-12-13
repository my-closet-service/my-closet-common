package com.mycloset.common.closet.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClosetKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6627576664178107049L;
	private String userId;
	private Integer seq;
}

package com.musicapp.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SONGS")
@Getter
@Setter
@NoArgsConstructor
public class Songs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer songId;
	String songName;
	String songSinger;
	String songsImage;
	
	@ManyToAny
	PlayList paylist;
	

}

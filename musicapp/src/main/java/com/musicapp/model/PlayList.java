package com.musicapp.model;

import java.util.List;

import com.musicapp.MusicappApplication;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLAYLIST")
public class PlayList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String playListId;
	String playListName;
	String PlayListImage;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "PlayList")
	List<Songs> songsList;

}

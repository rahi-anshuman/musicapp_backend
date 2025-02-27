package com.musicapp.model;

import java.util.List;

public class User {
	
	String userId;
	String userName;
	String userEmailId;
	String userImage;
	
//	one to may relation
	List<PlayList> playlistList;
}

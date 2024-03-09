/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.albums.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlbumRest {
    private String userId;
    private String albumId;
    private String albumTitle;
    private String albumDescription;
    private String albumUrl;
 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.photos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhotoRest {
    private String userId;
    private String photoId;
    private String albumId;
    private String photoTitle;
    private String photoDescription;
    private String photoUrl;
}
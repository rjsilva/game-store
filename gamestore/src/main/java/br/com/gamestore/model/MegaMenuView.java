/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gamestore.model;
/**
 *
 * @author rjs
 */
import javax.faces.bean.ManagedBean;

@ManagedBean
public class MegaMenuView {

    private String orientation = "horizontal";

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}

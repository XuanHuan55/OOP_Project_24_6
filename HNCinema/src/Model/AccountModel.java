/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haing
 */
public class AccountModel implements Serializable {

    private String username;
    private String password;
    private String phoneNumber;
    private List<Film> listFavorite = new ArrayList<>();
    private boolean isManager;

    public AccountModel(String username, String password, String phoneNumber, boolean isManager) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isManager = isManager;
    }

    public boolean isManager() {
        return this.isManager;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Film> getListFavorite() {
        return listFavorite;
    }

    public boolean checkFaFilm(Film f) {
        for (Film film : listFavorite) {
            if (film.getNameFilm().equals(f.getNameFilm())) {
                return false;
            }
        }
        return true;
    }

    public void removeFilm(Film f ) {
        this.listFavorite.remove(f);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author ljones30
 */
public interface IDoctorFeedback {
    String getDoctorID();
    String getFeedbackNotes();
    int getRating();
    void setDoctorID();
    void setRating();
    void setFeedbackNotes();
}

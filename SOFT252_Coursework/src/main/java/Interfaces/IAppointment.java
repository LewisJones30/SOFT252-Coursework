/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.util.Date;
/**
 *
 * @author ljones30
 */
public interface IAppointment {
    String getDoctorID();
    String getPatientID();
    Date getAssignedDate();
}

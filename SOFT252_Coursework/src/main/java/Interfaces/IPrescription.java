/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import System.Medicine;
/*
 *
 * @author ljones30
 */
public interface IPrescription {
    String getDoctorID();
    String getPatientID();
    String getDoctorNotes();
    Medicine getMedicine();
    int getQuantity();
    int getDosage();
}

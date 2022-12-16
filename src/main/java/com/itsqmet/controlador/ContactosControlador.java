
package com.itsqmet.controlador;


public class ContactosControlador {
    
    private int idcontacto;
    private String nombres;
    private String apellidos;
    private String tel1;
    private String tel2;
    private String dir;
    private String mail;
    private String buscarContacto;

    public int getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(int idcontacto) {
        this.idcontacto = idcontacto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
       public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getBuscarContacto() {
        return buscarContacto;
    }

    public void setBuscarContacto(String buscarContacto) {
        this.buscarContacto = buscarContacto;
    }
    
}

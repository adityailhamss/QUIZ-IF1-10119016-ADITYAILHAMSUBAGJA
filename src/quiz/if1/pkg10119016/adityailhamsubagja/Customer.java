/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119016.adityailhamsubagja;

/**
 *
 * @author aditi
 */
public class Customer {
    private String name;
    private String email;
    private boolean member;
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isMember(){
        return this.member;
    }
    public void setMember(boolean member){
        this.member = member;
    }

    void setNama(String aditya) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

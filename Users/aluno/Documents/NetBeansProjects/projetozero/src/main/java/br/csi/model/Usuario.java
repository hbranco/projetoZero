package csi.modelo;

public class Usuario {


    private String login;
    private String senha;
   
     public Usuario(String login, String senha){
        this.senha = senha;
        this.login = login;
     }
    
     public Usuario(){
         
     }
     
    
     /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}

package csi.dao;

import csi.modelo.Usuario;

public class Teste {
    
static UsuarioDAO dao = new UsuarioDAO();
   
 public static void main(String args[]){
       
     try{
         //inserir();
         //deletar(); 
         //getUsuario();
        /* System.out.println("*** Lista de Usuários ****");
         listar();
         autalizar();
          System.out.println("*** Lista de Usuários ****");
         listar();*/
        
        autenticar();
        
         
     }catch(Exception e){
         e.printStackTrace();
     }
        
    }

 private static void autenticar() throws Exception{
     Usuario u = new Usuario("paulo", "123");
     System.out.println("Autenticado? "+dao.autenticado(u));
 }
 
 private static void autalizar() throws Exception{
     Usuario u = new Usuario("nossa", "789456");
     dao.atualizar(u);
 }
 
 private static void getUsuario() throws Exception{
     Usuario u = dao.getUsuario("alencar");
     System.out.println("Login: "+u.getLogin()+" Senha: "+u.getSenha());
 }
 
 private static void deletar() throws Exception{
     Usuario u = new Usuario("verme", "");
     dao.deletar(u);
 }
 
 private static void inserir()throws Exception{
     Usuario u = new Usuario("jose","123");
     dao.inserir(u);
 }
 
 private static void listar()throws Exception{
     for(Usuario u: dao.listar()){
         System.out.println("Login: "+u.getLogin()+" Senha:"+u.getSenha());
     }
 }
}

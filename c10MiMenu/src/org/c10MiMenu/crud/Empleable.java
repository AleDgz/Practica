package org.c10MiMenu.crud;

public interface Empleable {
       public void Create(String id, String name,String email, String cPhone);
       public void Read(String[][] employee);
       public void Update(String id, int position, String inf, String[][] employee);
       public void Delete (String[][] employee, String id);
}

package link.bek.poc.model;

import com.google.gson.Gson;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class User implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("User Identifier")
   private java.lang.String userId;
   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Manager")
   private java.lang.String manager;
   @org.kie.api.definition.type.Label("Password")
   private java.lang.String password;

   @org.kie.api.definition.type.Label(value = "Identifier")
   private java.lang.String _id;

   public User()
   {
   }

   public java.lang.String getUserId()
   {
      return this.userId;
   }

   public void setUserId(java.lang.String userId)
   {
      this.userId = userId;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getManager()
   {
      return this.manager;
   }

   public void setManager(java.lang.String manager)
   {
      this.manager = manager;
   }

   public java.lang.String getPassword()
   {
      return this.password;
   }

   public void setPassword(java.lang.String password)
   {
      this.password = password;
   }

   public java.lang.String get_id()
   {
      return this._id;
   }

   public void set_id(java.lang.String _id)
   {
      this._id = _id;
   }

   public User(java.lang.String userId, java.lang.String name,
         java.lang.String manager, java.lang.String _id)
   {
      this.userId = userId;
      this.name = name;
      this.manager = manager;
      this._id = _id;
   }
   
   @Override
   public String toString() {
      Gson gson = new Gson();
      return gson.toJson(this);
   }

}
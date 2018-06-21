import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mu04_labinfo4404 on 15/06/2018.
 */

public class databaseAcess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static databaseAcess instance;


    databaseAcess( Context context ) {
        this.openHelper = new database(context);


    }


    public static databaseAcess
    getInstance( Context context){
        if (instance == null){
            instance = new databaseAcess(context);
        }
        return instance;
    }
   public void  open (){

       this.database = openHelper .getWritableDatabase();
   }

   public void close (){
       if(database!=null){
           this.database.close();
       }
   }


}
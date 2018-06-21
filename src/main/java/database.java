import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;

/**
 * Created by mu04_labinfo4404 on 15/06/2018.
 */




public class database extends SQLiteOpenHelper {
    private static final String DATABASE = "MEUBANCO";
    private static final int DATABSE_VERTION = 1;
    private static final String MEEBANCO = " meu banco";

    public database( Context context ) {
        super(context, MEEBANCO, null, 1);

    }


    @Override
    public void onCreate( SQLiteDatabase db ) {


        db.execSQL(sql_Curso);
        db.execSQL(sql_alunos);
        db.execSQL( sql_Medias_fianais );
        db.execSQL("create table alunos (id integer primary key , nome_aluno  text,cpf_alu text , curso_alu text, dta_nas text,sexo_alu text, fone_alu text, matricula_alu text   )");
        db.execSQL("create table Aplicativo(id integer, primary key ,nome_aluno text,cpf_alu text, curso_alu text, dta_nas text,sexo_alu text, fone_alu text, matricula_alu tetx)");
        db.execSQL("insert into alunos values (1 ,'Amanda Rebeca' , 02705178002 , 'Ciencas da computcao' , 04091995 ,F , 0929922961 ,15172678)");

        db.execSQL( "create table Notas (id integer , N1 float , N2 foalt , N3 float , media_final float)" );
        db.execSQL( "create table aplicativo (id integer , N1 float , N2 foalt , N3 float , media_final float )" );
        db.execSQL( "insert into Notas values ( 1 ,10.0 , 9.5, 7.0 , 7.7)" );


    }


    @Override
    public void onUpgrade( SQLiteDatabase db, int oldVersion, int newVersion ) {

    }

    String getSql_alunos = "create table [alunos] (\n" +
            "[id_aluno][int] not null, \n" +
            "[nome_alu] [char] (20) not null \n" +
            ");";


    String sql_Curso = "create table [curso] (\n" +
            "[id_aluno][int] not null, \n" +
            "[nome_curso][char] (20) not null \n" +
            ");";

    String getSql_Medias_fianais =" create table [Medias_finais]( \n +" +
            "[N1][float] \n " +
            "[N2] float \n " +
            "[N3] foat \n" +
            " media float );";

    String sql_alunos = "insert into [alunos] ([id_aluno],[nome_alu]) values (1 ,'joaoa'))";

    String sql_Medias_fianais  = "insert into [Medias_finais]([N1] ,[N2] ,[N3] values ( 7.3  , 5.5 , 8.4 ))";





}
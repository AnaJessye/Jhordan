import android.provider.BaseColumns;
import android.provider.Settings;

/**
 * Created by mu04_labinfo4404 on 18/06/2018.
 */

public final class alunos{



    private alunos (){}

    public static class alunos1 implements BaseColumns{

        public static final String TABLE_NOME="poster";


private String nome_aluno ;
private String cpf ;
private String fone;
private  String sexo;
private String curso;

        public String getCpf() {
            return cpf;
        }

        public String getFone() {
            return fone;
        }


        public String getCurso() {
            return curso;
        }

        public String getNome_aluno() {
            return nome_aluno;
        }

        public String getSexo() {
            return sexo;


        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;



        }

        public void setNome_aluno(String nome_aluno) {
            this.nome_aluno = nome_aluno;
        }


        public void setSexo(String sexo) {
            this.sexo = sexo;
        }



    }





}

import android.provider.BaseColumns;

/**
 * Created by mu04_labinfo4404 on 20/06/2018.
 */

public class Medias_finais {


    private Medias_finais() {
    }

    public static class Medias_finais1 implements BaseColumns {

        public static final String TABLE_NOME = "poster";
        private float N1;
        private float N2;
        private float N3;
        private float media_final;


        public float getN1() {
            return N1;
        }

        public float getN2() {
            return N3;
        }


        public float getN3() {
            return N3;
        }

        public float getmedia_final() {
            return media_final;
        }

        public void setN1(float n1) {
            N1 = n1;
        }


        public void setN2(float n2) {
            N2 = n2;
        }

        public void setMedia_final(float media_final) {
            this.media_final = media_final;

        }


    }

}


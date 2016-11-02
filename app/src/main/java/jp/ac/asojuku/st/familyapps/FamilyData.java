package jp.ac.asojuku.st.familyapps;

/**
 * Created by kouya1224 on 2016/11/02.
 */
public class FamilyData {
        private int number;
        private int addition;
        private String comment;

        public FamilyData(String comment){

            this.comment = comment;
        }

        public String getComment() {

            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
}


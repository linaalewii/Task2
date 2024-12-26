
    public class IUStudent extends Student{
        IUStudent(String FIO, int course, int lastmark){
            super( FIO, course, lastmark);
        }
        @Override
        public void writeExam(){
            System.out.printf("Студент "+FIO+" "+course+" курса направления IU написал последний экзамен на оценку: "+lastmark);
            System.out.print("\n");

        }
    }


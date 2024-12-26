
    public class MathStudent extends Student{
        MathStudent(String FIO, int course, int lastmark){
            super(FIO, course, lastmark);
        }
        @Override
        public void writeExam(){
            System.out.printf("Студент "+FIO+" "+course+" курса направления Math написал последний экзамен на оценку: "+lastmark);
            System.out.print("\n");

        }
    }


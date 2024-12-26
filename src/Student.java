
    public abstract class Student {
        String FIO;
        int course;
        int lastmark;
        public abstract void writeExam();
        Student(String FIO, int course, int lastmark){
            this.FIO=FIO;
            this.course=course;
            this.lastmark=lastmark;
        }
    }


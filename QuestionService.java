public class QuestionService {
    
    Question[] questions = new Question[5];
    
    public QuestionService(){

        questions[0] = new Question(1,"What","Java","CPP","C","Python","Java");
        questions[1] = new Question(2,"What","Java","CPP","C","Python","Java");
        questions[2] = new Question(3,"What","Java","CPP","C","Python","Java");
        questions[3] = new Question(4,"What","Java","CPP","C","Python","Java");
        questions[4] = new Question(5,"What","Java","CPP","C","Python","Java");

    }

    public void displayQuestion(){
        for(Question q : questions){
        System.out.println(q);
    }
    }
}

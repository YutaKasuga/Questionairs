class Question{

    private String _question;
    private String _answer;
    private String _type;

    public Question(String question,String answer, String type){
        this._question = question;
        this._answer = answer;
        this._type = type;
    }

    public String getAnswer(){
        return this._answer;
    }

    public String getQuestion(){
        return this._question;
    }

    public String getType(){
        return this._type;
    }

    public void setAnswer(String ans){
        this._answer = ans;
    }

    public void setQuestion(String ques){
        this._question = ques;
    }

    public void setType(String type){
        this._type = type;
    }

}
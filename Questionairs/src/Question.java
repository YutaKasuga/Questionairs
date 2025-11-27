class Question{

    private String _question;
    private String _answer;
    private String _type;

    public Question(String question,String answer, String type){
        this._question = question;
        this._answer = answer;

        // only type is optional setting at the moment
        if (!type.isEmpty()){
            this._type = type;
        } else {
            this._type = "";
        }

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

    public boolean checkQuestion(){
        if (this.getAnswer().isEmpty() | this.getQuestion().isEmpty()){
            System.out.println("You need to fill both of question and answer...");
            return false;
        } else {
            if (this.getType().isEmpty()){
                System.out.println("The type is empty... but it is ok to make a question.");
            }
            return true;
        }
    }

}
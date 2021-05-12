package com.company.InnerClass.intro;

public class Button {
    private String title;

    //use interface as a parameter
    private IOnClickListener onClickListenerVariable;

    public Button(String title){
    this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(IOnClickListener  onClickListenerVariable) {
        this.onClickListenerVariable = onClickListenerVariable;
    }
    //Button class's onClick method= Button class's interface has the onClick method;
    //this method is to be defined in main
    public void onClick(){
        this.onClickListenerVariable.onClick(this.title);
    }

    //nested interface
    public interface IOnClickListener{
        public void onClick(String title);
    }

}

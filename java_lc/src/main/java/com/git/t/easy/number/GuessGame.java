package com.git.t.easy.number;

public class GuessGame {
  public int guessNumber(int n) {
    int low =1;
    int high= n;
    while (low<high){
      int guess= low +(high-low)/2;

         int out =guess(guess);
        if( out==0) return  guess;
        else if(out <0 ) high=guess-1;
        else low=guess+1;
    }
  return  high;
  }

  private int guess(int guess) {
    return 0;
  }


}

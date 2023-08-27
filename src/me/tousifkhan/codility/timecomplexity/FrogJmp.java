package me.tousifkhan.codility.timecomplexity;

//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int jump = 0;
        while(X <= Y) {
            X+=D;
            jump++;
        }
        return jump;
    }

    public static void main(String[] args) {
        FrogJmp jump = new FrogJmp();
        System.out.println(jump.solution(10, 85,30));
    }
}

package com.company;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
	// write your code here
        Scanner d = new Scanner(System.in);
        Random random = new Random();
        int[][] a = new int[50][50];
        String st1,st;
        System.out.println("You will get a ladder if the numbers reaches to 8,17,21,46,61,66,70");
        System.out.println("A snake will bite if the number reaches to 35,38,48,52,68,78,89,95,98");
        System.out.println("Enter player1 name");
        String st2 = d.nextLine();
        System.out.println("Enter player2 name");
        String st3 = d.nextLine();
        int i,j,k=100,l=0,m=0,x=0,y=0,p1=0,p2=1,q=0,n=0;
        for (i=0;i<10;i++) {
            for (j = 0; j < 10; j++) {
                if (i % 2 == 0) {
                    a[i][j] = k--;
                }
                else{
                    a[i][9-j]=k--;
                }
            }
        }
        for (i=0;i<10;i++){
            for (j=0;j<10;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        while (x<=100&&y<=100){
                if (p1%2==0 && x>=94){
                    System.out.print(st2+" roll the dice by clicking enter ");
                    st1= d.nextLine();
                    m = (random.nextInt(6))+1;
                    System.out.println(m);
                    if(m==(100-x)){x+=m;break;}
                    if (m<(100-x)){x=x+m;
                        System.out.println(st2+" reaches to "+x);
                    }
                    if (m>(100-x)){
                        System.out.println(x);
                    }
                    if (x==98){x=13;System.out.println(m+" Oo no "+st2+" reaches to "+x);}
                    else if (x==95){x=85;System.out.println(m+" Oo no "+st2+" reaches to "+x);}
                   p1++;
                }
                else if(p1%2==0){
                    if (q == 0) {
                        System.out.print(st2+" roll the dice by clicking enter ");
                        st1= d.nextLine();
                        m = (random.nextInt(6))+1;
                        System.out.println(m);
                        if (m == 1) {
                                   x++;
                            q++;
                            p1++;
                            continue;
                        }
                    }
                    if (q==1){
                        System.out.print(st2+" roll the dice by clicking enter ");
                        st1= d.nextLine();
                        m=(random.nextInt(6))+1;
                        System.out.println(m);
                        x=x+m;
                        System.out.println(st2+" reaches to "+x);
                        if (x==8){x=26;System.out.println("Wow "+st2+" reaches to "+x);}
                        else if (x==17){x=36;System.out.println("Wow "+st2+" reaches to "+x);}
                        else if (x==46){x=64;System.out.println("Wow "+st2+" reaches to "+x);}
                        else if (x==21){x=82;System.out.println("Wow "+st2+" reaches to "+x);}
                        else if (x==61){x=99;System.out.println("Wow "+st2+" reaches to "+x);}
                        else if (x==66){x=87;System.out.println("Wow "+st2+" reaches to "+x);}
                        else if (x==70){x=92;System.out.println("Wow "+st2+" reaches to "+x);}
                        else if (x==89){x=67;System.out.println("Oo no "+st2+" reaches to "+x);}
                        else if (x==78){x=43;System.out.println("Oo no "+st2+" reaches to "+x);}
                        else if (x==68){x=19;System.out.println("Oo no "+st2+" reaches to "+x);}
                        else if (x==52){x=30;System.out.println("Oo no "+st2+" reaches to "+x);}
                        else if (x==48){x=9;System.out.println("Oo no "+st2+" reaches to "+x);}
                        else if (x==38){x=20;System.out.println("Oo no "+st2+" reaches to "+x);}
                        else if (x==35){x=15;System.out.println("Oo no "+st2+" reaches to "+x);}
                    }p1++;
                }
                if (p1%2!=0&&y>=94){
                    System.out.print(st3+" roll the dice by clicking enter ");
                    st1= d.nextLine();
                    n = (random.nextInt(6))+1;
                    System.out.println(n);
                    if (n==(100-y)){y+=n;break;}
                    if (n<(100-y)){y=y+n;
                        System.out.println(st3+" reaches to "+y);
                    }
                    if (n>(100-y)){
                        System.out.println(y);
                    }
                    if (y==98){y=13; System.out.println(n+" Oo no "+st3+" reaches to "+y);}
                    else if (y==95){y=85;System.out.println(n+" Oo no "+st3+" reaches to "+y);}
                    p1++;
                }
                else if (p1%2!=0){
                    if(l==0){
                        System.out.print(st3+" roll the dice by clicking enter ");
                        st= d.nextLine();
                        n = (random.nextInt(6))+1;
                        System.out.println(n);
                        if (n==1){
                            y++;
                            l++;
                            p1++;
                            continue;
                        }
                    }
                    if (l==1){
                        System.out.print(st3+" roll the dice by clicking enter ");
                        st= d.nextLine();
                        n=(random.nextInt(6))+1;
                        System.out.println(n);
                        y=y+n;
                        System.out.println(st3+" reaches to "+y);
                        if (y==8){y=26;System.out.println("Wow "+st3+" reaches to "+y);}
                        else if (y==17){y=36;System.out.println("Wow "+st3+" reaches to "+y);}
                        else if (y==46){y=64; System.out.println("Wow "+st3+" reaches to "+y);}
                        else if (y==21){y=82; System.out.println("Wow "+st3+" reaches to "+y);}
                        else if (y==61){y=99; System.out.println("Wow "+st3+" reaches to "+y);}
                        else if (y==66){y=87; System.out.println("Wow "+st3+" reaches to "+y);}
                        else if (y==70){y=92; System.out.println("Wow "+st3+" reaches to "+y);}
                        else if (y==89){y=67;System.out.println("Oo no "+st3+" reaches to "+y);}
                        else if (y==78){y=43;System.out.println("Oo no "+st3+" reaches to "+y);}
                        else if (y==68){y=19;System.out.println("Oo no "+st3+" reaches to "+y);}
                        else if (y==52){y=30;System.out.println("Oo no "+st3+" reaches to "+y);}
                        else if (y==48){y=9;System.out.println("Oo no "+st3+" reaches to "+y);}
                        else if (y==38){y=20;System.out.println("Oo no "+st3+" reaches to "+y);}
                        else if (y==35){y=15;System.out.println("Oo no "+st3+" reaches to "+y);}
                    }
                    p1++;
                }
        }
        if (x==100){
            System.out.println(st2+" wins");
        }
        if(y==100){
            System.out.println(st3+" wins");
        }
    }
}

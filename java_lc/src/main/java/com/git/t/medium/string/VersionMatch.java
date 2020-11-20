package com.git.t.medium.string;

public class VersionMatch {
    public int compareVersion(String version1, String version2) {
        int len=Math.max(version1.length(),version2.length());
        int v1=0, v2=0;
        while (v1<version1.length() || v2<version2.length()){
            int  sub1=0,sub2=0;
            if(v1<version1.length()) {
             int last=getLastIndex(v1, version1) ;
              sub1=  Integer.parseInt(version1.substring(v1,last));
                v1=last+1;
            }
            if(v2<version2.length()) {
                int last=getLastIndex(v2, version2) ;
                sub2=  Integer.parseInt(version2.substring(v2,last));
                v2=last+1;
            }
            int s= Integer.compare(sub1,sub2);
            if(s!=0) return  s;
        }

        return  0;
    }
    private  int getLastIndex(int start, String s) {
        int i = s.indexOf('.', start);
        if (i < 1) return s.length();
        return i;
    }
  /*  private int getVersion(int start, String s){
      int i=  s.indexOf('.',start);
      if(i<1) return  Integer.parseInt(s.substring(start,s.length())) ;
      return  Integer.pa
    }*/


    public int compareVersion1(String version1, String version2) {
        int len=Math.max(version1.length(),version2.length());
        String []  v1= version1.split("\\.");
        String []  v2= version2.split("\\.");
        for(int i=0;i<len;i++){
            int  sub1=i<v1.length? Integer.parseInt(v1[i]) : 0;
            int  sub2=i<v2.length? Integer.parseInt(v2[i]) : 0;
            int s= Integer.compare(sub1,sub2);
            if(s!=0) return  s;
        }

        return  0;
    }
}

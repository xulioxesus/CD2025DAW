public class Utils { // nombre demasiado genérico para ejercicio

    public static String doStuff(String a,String b){
        // método largo, sin javadoc, nombres pobres
        String r=a+b;    if(r.length()>120){System.out.println("too long: "+r);} // line length
        if(a==null || b==null) return null; // braces ausentes si tu config lo exige
        try{
            if(a.trim().equals("")||b.trim().equals("")){throw new RuntimeException("bad");}
        }catch(Exception e){e.printStackTrace();} // catch genérico + printStackTrace
        return r;
    }

    public static void  Calc( int A , int B ){ // método no lowerCamelCase + espacios raros
        int res=A*B+42; // magic number
        System.out.println( "res = " +res );
    }

    public void unusedMethod(){ int i=0; i=i+1; } // “ruido” + podría disparar reglas de estilo
}
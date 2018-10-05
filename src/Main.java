public class Main {

    public static void main(String[] args) {

         /*
        //////////////////////  FOR LOOPS ////////////////////////////////////////
        /* Komputerlerin esas ustunlekleri odur ki onlar
         * monoton tekrarlanan ishleri cox tez ede bilirler. Bunun ucun bize
         * dovriyeler lazimdir. En besit dovriye for dovriyesidir.
         * ashagida ki setrle  0-dan 10-a kimi olan butun reqemleri print edirik
         *
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /*
         * belelikle for dovriyesini yazmaq ucun biz daxil noqtesini yazmaliyiq
         * dovruyenin bitme noqtesini yazmaliyq, ve dovriyenin deyisheni nece artacaq (azalacaq)
         * qeyd etmeliyik
         *
         */

        //  for ( DAXIL NOQTESI  ;  BITME SHERTI ; ARTMA/AZALMA MENTIQI (INCREMENT) ) {

        // TEKRARLANAN EMELIYATLAR

        //  }

        /////////////////////////////// FOR LOOPLARIN SONU ///////////////////////////


         /*
        //////////////////////  WHILE LOOPS ////////////////////////////////////////
        /*
         * While loop-larin for-dan yegane ferqi odur ki onlari istifade etmek ucun yalniz
         * bitme shertini yazmaq lazimdir. For loopdan ferqli olaraq siz burada girish
         * noqtesini ve incrementasiya (artma) qaydasini yazmirsiz.
         *
         */

         int a = 1;

         while(a<5){
             a++;
             System.out.println(a);
         }

        /*
         * WHILE loopunu yaratmaq ucun size yalnizca her hansi bir shert lazimdir, bu
         * shert mutleq deyil ki hansisa reqemin bir noqteye catmasi olsun. Shert
         * istenilen ola biler. Misal ucun  while( istifadeciClickEtdi ) ve sair.
         *
         */

        //  while ( BITME SHERTI ) {

        // TEKRARLANAN EMELIYATLAR

        //  }


        /*
        *
        * prinsipce for ve while loop-un Java baximindan hec bir ferqi yoxdur.
        * Sadece bezi situasiyalarda for yazmaq (biz proqramci ucun) daha rahatdir, digerlerinde ise while
        * Bu situasiyalarla biz novbeti derslerimizde qarshilashaciq
        *
        * istenilen for loopunu while kimi-de istifade etmek olar
        * ashagida ki setirde GIRISH NOQTESI ve INCREMENT hisselerin bosh olmagina
        * diqqet yetirin. Bu while loop ile praktiki olaraq eyni emeliyatdir
        *
        * for( ; BITME SHERTI ; )
        *
        * while ( BITME SHERTI )
        *
        * */

        /////////////////////////////// WHILE LOOPLARIN SONU ///////////////////////////


        ////////////////////////////// DAXILI LOOPLAR /////////////////////////////////

        /*
         * Daxili looplari yaxshi basha dushmek ucun ikinci dersin prezentasiyasinda (l2.pptx)
         * 11-ci slaydi gozunuzun onune getirin. istenilen dovruyenin daxilinde ki her hansi setri tekrar
         * olunan  blok  kimi dushunun
         *
         */

        /*
         *  for (DAXIL NOQTESI  ;  BITME SHERTI ; ARTMA/AZALMA MENTIQI)
         *  {
         *      TEKRAR OLUNAN EMELIYYAT 1;
         *      TEKRAR OLUNAN EMELLIYAT 2;
         *      ....
         *  }
         *
         */


        /*
         * burada TEKRAR OLUNAN EMELIYYAT ozu ozluyundede bir dovruyye ola biler
         *
         * Bir kitab dushunun.
         * ust dovruyeni bu kitabin bashligi kimi dushunun, daxili dovruyeni ise
         * alt bashliqlar kimi.
         *
         * Misal:
         *
         * Bashliq 1:
         *        Alt bashliq 1.1
         *        Alt bashliq 1.2
         *        Alt bashliq 1.3
         *        Alt bashliq 1.4
         *
         * Bashliq 2:
         *         Alt bashliq 2.1
         *         Alt bashliq 2.2
         *         Alt bashliq 2.3
         *         Alt bashliq 2.4
         *
         * eyni qaydada sizin daxili dovruyeleriniz ishleyir
         *
         * for(int i=0; i<10; i++){
         *
         *      for (int j=0; j<10; j++){
         *          System.out.println("\t  bu blok daxili dovruyenin elementidir");
         *      }
         *
         *      System.out.println("bu blok ust dovruyenin elementidir");
         * }
         *
         * burada iterasiyalar ashagida ki qayda ile deyishecek:
         *
         *
         * i=0:
         *    i=0, j=0
         *    i=0, j=1
         *    i=0, j=2
         *    i=0, j=3
         *    ........
         *    i=0, j=9
         * sonra 131-ci setr-de ki sysout icra olunacaq ve yalniz bundan sonra
         * i artacaq
         *
         *
         * i=1:
         *    i=1, j=0
         *    i=1, j=1
         *    i=1, j=2
         *    i=1, j=3
         *    ........
         *    i=1, j=9
         *sonra 131-ci setr-de ki sysout icra olunacaq ve yalniz bundan sonra
         * i artacaq
         *
         */
    }
}

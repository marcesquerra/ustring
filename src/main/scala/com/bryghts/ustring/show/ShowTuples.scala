package com.bryghts.ustring
package show

/**
 *Created by Marc Esquerrà on 01/08/2014.
 */
trait ShowTuples extends ShowStrings
{

    implicit def showTuple1[A : Show]: Show[Tuple1[A]] =    Show{case (a) => u"(" + a + u")"}


    implicit def showTuple2[A : Show,
                            B : Show]: Show[(A,
                                             B)] =    Show{case (a,
                                                                 b) =>  u"(" + a + u", " +
                                                                               b + u")"}


    implicit def showTuple3[A : Show,
                            B : Show,
                            C : Show]: Show[(A,
                                             B,
                                             C)] =    Show{case (a,
                                                                 b,
                                                                 c) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u")"}

    implicit def showTuple4[A : Show,
                            B : Show,
                            C : Show,
                            D : Show]: Show[(A,
                                             B,
                                             C,
                                             D)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u")"}

    implicit def showTuple5[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u")"}

    implicit def showTuple6[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u")"}

    implicit def showTuple7[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u")"}

    implicit def showTuple8[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u")"}

    implicit def showTuple9[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u")"}

    implicit def showTuple10[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u")"}

    implicit def showTuple11[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u")"}

    implicit def showTuple12[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u")"}

    implicit def showTuple13[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u")"}

    implicit def showTuple14[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u")"}

    implicit def showTuple15[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u")"}

    implicit def showTuple16[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show,
                            P : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O,
                                             P)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o,
                                                                 p) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u", " +
                                                                               p + u")"}

    implicit def showTuple17[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show,
                            P : Show,
                            Q : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O,
                                             P,
                                             Q)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o,
                                                                 p,
                                                                 q) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u", " +
                                                                               p + u", " +
                                                                               q + u")"}

    implicit def showTuple18[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show,
                            P : Show,
                            Q : Show,
                            R : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O,
                                             P,
                                             Q,
                                             R)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o,
                                                                 p,
                                                                 q,
                                                                 r) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u", " +
                                                                               p + u", " +
                                                                               q + u", " +
                                                                               r + u")"}

    implicit def showTuple19[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show,
                            P : Show,
                            Q : Show,
                            R : Show,
                            S : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O,
                                             P,
                                             Q,
                                             R,
                                             S)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o,
                                                                 p,
                                                                 q,
                                                                 r,
                                                                 s) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u", " +
                                                                               p + u", " +
                                                                               q + u", " +
                                                                               r + u", " +
                                                                               s + u")"}

    implicit def showTuple20[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show,
                            P : Show,
                            Q : Show,
                            R : Show,
                            S : Show,
                            T : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O,
                                             P,
                                             Q,
                                             R,
                                             S,
                                             T)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o,
                                                                 p,
                                                                 q,
                                                                 r,
                                                                 s,
                                                                 t) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u", " +
                                                                               p + u", " +
                                                                               q + u", " +
                                                                               r + u", " +
                                                                               s + u", " +
                                                                               t + u")"}

    implicit def showTuple21[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show,
                            P : Show,
                            Q : Show,
                            R : Show,
                            S : Show,
                            T : Show,
                            U : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O,
                                             P,
                                             Q,
                                             R,
                                             S,
                                             T,
                                             U)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o,
                                                                 p,
                                                                 q,
                                                                 r,
                                                                 s,
                                                                 t,
                                                                 u) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u", " +
                                                                               p + u", " +
                                                                               q + u", " +
                                                                               r + u", " +
                                                                               s + u", " +
                                                                               t + u", " +
                                                                               u + u")"}

    implicit def showTuple22[A : Show,
                            B : Show,
                            C : Show,
                            D : Show,
                            E : Show,
                            F : Show,
                            G : Show,
                            H : Show,
                            I : Show,
                            J : Show,
                            K : Show,
                            L : Show,
                            M : Show,
                            N : Show,
                            O : Show,
                            P : Show,
                            Q : Show,
                            R : Show,
                            S : Show,
                            T : Show,
                            U : Show,
                            V : Show]: Show[(A,
                                             B,
                                             C,
                                             D,
                                             E,
                                             F,
                                             G,
                                             H,
                                             I,
                                             J,
                                             K,
                                             L,
                                             M,
                                             N,
                                             O,
                                             P,
                                             Q,
                                             R,
                                             S,
                                             T,
                                             U,
                                             V)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d,
                                                                 e,
                                                                 f,
                                                                 g,
                                                                 h,
                                                                 i,
                                                                 j,
                                                                 k,
                                                                 l,
                                                                 m,
                                                                 n,
                                                                 o,
                                                                 p,
                                                                 q,
                                                                 r,
                                                                 s,
                                                                 t,
                                                                 u,
                                                                 v) =>  u"(" + a + u", " +
                                                                               b + u", " +
                                                                               c + u", " +
                                                                               d + u", " +
                                                                               e + u", " +
                                                                               f + u", " +
                                                                               g + u", " +
                                                                               h + u", " +
                                                                               i + u", " +
                                                                               j + u", " +
                                                                               k + u", " +
                                                                               l + u", " +
                                                                               m + u", " +
                                                                               n + u", " +
                                                                               o + u", " +
                                                                               p + u", " +
                                                                               q + u", " +
                                                                               r + u", " +
                                                                               s + u", " +
                                                                               t + u", " +
                                                                               u + u", " +
                                                                               v + u")"}
}

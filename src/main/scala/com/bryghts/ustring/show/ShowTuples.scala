package com.bryghts.ustring
package show

/**
 * Created by Marc Esquerrà on 01/08/2014.
 */
trait ShowTuples
{

    implicit def showTuple1[A : Show]: Show[(A)] =    Show{case (a) => u"(" + a.toUString + u")"}
    implicit def showTuple2[A : Show,
                            B : Show]: Show[(A,
                                             B)] =    Show{case (a,
                                                                 b) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u")"}


    implicit def showTuple3[A : Show,
                            B : Show,
                            C : Show]: Show[(A,
                                             B,
                                             C)] =    Show{case (a,
                                                                 b,
                                                                 c) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u")"}

    implicit def showTuple4[A : Show,
                            B : Show,
                            C : Show,
                            D : Show]: Show[(A,
                                             B,
                                             C,
                                             D)] =    Show{case (a,
                                                                 b,
                                                                 c,
                                                                 d) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u")"}

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
                                                                 e) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u")"}

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
                                                                 f) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u")"}

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
                                                                 g) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u")"}

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
                                                                 h) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u")"}

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
                                                                 i) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u")"}

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
                                                                 j) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u")"}

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
                                                                 k) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u")"}

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
                                                                 l) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u")"}

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
                                                                 m) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u")"}

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
                                                                 n) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u")"}

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
                                                                 o) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u")"}

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
                                                                 p) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u", " +
                                                                               p.toUString + u")"}

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
                                                                 q) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u", " +
                                                                               p.toUString + u", " +
                                                                               q.toUString + u")"}

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
                                                                 r) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u", " +
                                                                               p.toUString + u", " +
                                                                               q.toUString + u", " +
                                                                               r.toUString + u")"}

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
                                                                 s) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u", " +
                                                                               p.toUString + u", " +
                                                                               q.toUString + u", " +
                                                                               r.toUString + u", " +
                                                                               s.toUString + u")"}

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
                                                                 t) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u", " +
                                                                               p.toUString + u", " +
                                                                               q.toUString + u", " +
                                                                               r.toUString + u", " +
                                                                               s.toUString + u", " +
                                                                               t.toUString + u")"}

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
                                                                 u) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u", " +
                                                                               p.toUString + u", " +
                                                                               q.toUString + u", " +
                                                                               r.toUString + u", " +
                                                                               s.toUString + u", " +
                                                                               t.toUString + u", " +
                                                                               u.toUString + u")"}

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
                                                                 v) =>  u"(" + a.toUString + u", " +
                                                                               b.toUString + u", " +
                                                                               c.toUString + u", " +
                                                                               d.toUString + u", " +
                                                                               e.toUString + u", " +
                                                                               f.toUString + u", " +
                                                                               g.toUString + u", " +
                                                                               h.toUString + u", " +
                                                                               i.toUString + u", " +
                                                                               j.toUString + u", " +
                                                                               k.toUString + u", " +
                                                                               l.toUString + u", " +
                                                                               m.toUString + u", " +
                                                                               n.toUString + u", " +
                                                                               o.toUString + u", " +
                                                                               p.toUString + u", " +
                                                                               q.toUString + u", " +
                                                                               r.toUString + u", " +
                                                                               s.toUString + u", " +
                                                                               t.toUString + u", " +
                                                                               u.toUString + u", " +
                                                                               v.toUString + u")"}

}

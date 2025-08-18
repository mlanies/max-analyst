package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ok1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok1(el1 el1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = el1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ok1 ok1Var = (ok1) n((jb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ok1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ok1 ok1Var = new ok1(this.Y, continuation);
        ok1Var.X = obj;
        return ok1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jb jbVar = (jb) this.X;
        boolean z = jbVar instanceof za;
        el1 el1Var = this.Y;
        if (z) {
            pnf.o(el1Var.M0, wj1.b);
        } else if (jbVar instanceof xa) {
            pnf.o(el1Var.M0, wj1.c);
        } else if (jbVar instanceof wa) {
            pnf.o(el1Var.M0, wj1.d);
        } else if (jbVar instanceof db) {
            pnf.o(el1Var.M0, wj1.e);
        } else if (jbVar instanceof va) {
            pnf.o(el1Var.M0, wj1.f);
        } else if (jbVar instanceof sa) {
            pnf.o(el1Var.M0, wj1.g);
        } else if (jbVar instanceof ra) {
            pnf.o(el1Var.M0, wj1.h);
        } else if (jbVar instanceof ab) {
            pnf.o(el1Var.M0, wj1.i);
        } else if (jbVar instanceof ya) {
            pnf.o(el1Var.M0, wj1.j);
        } else if (jbVar instanceof eb) {
            pnf.o(el1Var.M0, wj1.k);
        } else if (jbVar instanceof fb) {
            pnf.o(el1Var.M0, wj1.l);
        } else if (jbVar instanceof ib) {
            pnf.o(el1Var.M0, wj1.m);
        } else if (jbVar instanceof bb) {
            pnf.o(el1Var.M0, wj1.n);
        } else if (jbVar instanceof gb) {
            pnf.o(el1Var.M0, wj1.o);
        } else if (jbVar instanceof ta) {
            pnf.o(el1Var.M0, wj1.p);
        } else if (jbVar instanceof ua) {
            pnf.o(el1Var.M0, wj1.A);
        } else if (jbVar instanceof hb) {
            pnf.o(el1Var.M0, ((hb) jbVar).a ? wj1.B : wj1.C);
        }
        return e5f.a;
    }
}

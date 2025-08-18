package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jd2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ld2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd2(ld2 ld2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ld2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jd2 jd2Var = (jd2) n((fka) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jd2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jd2 jd2Var = new jd2(this.Y, continuation);
        jd2Var.X = obj;
        return jd2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        fka fkaVar = (fka) this.X;
        ld2 ld2Var = this.Y;
        if (ld2Var.i.a()) {
            khe kheVar = ld2Var.i;
            ngg.G((Drawable) kheVar.getValue(), fkaVar.getIcon().j);
            ((Drawable) kheVar.getValue()).invalidateSelf();
        }
        khe kheVar2 = ld2Var.j;
        if (kheVar2.a()) {
            ngg.G((Drawable) kheVar2.getValue(), fkaVar.getIcon().j);
            ((Drawable) kheVar2.getValue()).invalidateSelf();
        }
        khe kheVar3 = ld2Var.k;
        if (kheVar3.a()) {
            ngg.G((Drawable) kheVar3.getValue(), fkaVar.getIcon().j);
            ((Drawable) kheVar3.getValue()).invalidateSelf();
        }
        khe kheVar4 = ld2Var.l;
        if (kheVar4.a()) {
            ngg.G((Drawable) kheVar4.getValue(), fkaVar.getIcon().j);
            ((Drawable) kheVar4.getValue()).invalidateSelf();
        }
        khe kheVar5 = ld2Var.m;
        if (kheVar5.a()) {
            ngg.G((Drawable) kheVar5.getValue(), fkaVar.getIcon().j);
            ((Drawable) kheVar5.getValue()).invalidateSelf();
        }
        khe kheVar6 = ld2Var.n;
        if (kheVar6.a()) {
            ngg.G((Drawable) kheVar6.getValue(), fkaVar.getIcon().j);
            ((Drawable) kheVar6.getValue()).invalidateSelf();
        }
        khe kheVar7 = ld2Var.o;
        if (kheVar7.a()) {
            ngg.G((Drawable) kheVar7.getValue(), fkaVar.getIcon().j);
            ((Drawable) kheVar7.getValue()).invalidateSelf();
        }
        khe kheVar8 = ld2Var.p;
        if (kheVar8.a()) {
            ngg.G((Drawable) kheVar8.getValue(), fkaVar.getIcon().c);
            ((Drawable) kheVar8.getValue()).invalidateSelf();
        }
        khe kheVar9 = ld2Var.q;
        if (kheVar9.a()) {
            ngg.G((Drawable) kheVar9.getValue(), fkaVar.getIcon().c);
            ((Drawable) kheVar9.getValue()).invalidateSelf();
        }
        khe kheVar10 = ld2Var.r;
        if (kheVar10.a()) {
            ngg.G((Drawable) kheVar10.getValue(), fkaVar.getIcon().b);
            ((Drawable) kheVar10.getValue()).invalidateSelf();
        }
        khe kheVar11 = ld2Var.s;
        if (kheVar11.a()) {
            ((yl5) kheVar11.getValue()).onThemeChanged(fkaVar);
        }
        return e5f.a;
    }
}

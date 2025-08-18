package defpackage;

import android.opengl.EGLSurface;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class hcg extends rd7 implements m56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ne1 b;
    public final /* synthetic */ oe1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcg(ne1 ne1Var, oe1 oe1Var) {
        super(1);
        this.b = ne1Var;
        this.c = oe1Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                me1 me1Var = (me1) obj;
                ArrayList arrayList = this.c.i;
                ne1 ne1Var = this.b;
                if (arrayList.remove(ne1Var)) {
                    EGLSurface eGLSurface = ne1Var.a;
                    ne1Var.a = null;
                    me1Var.e(eGLSurface);
                    ne1Var.a();
                }
                break;
            default:
                this.b.b(this.c, (me1) obj);
                break;
        }
        return e5f.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcg(oe1 oe1Var, ne1 ne1Var) {
        super(1);
        this.c = oe1Var;
        this.b = ne1Var;
    }
}

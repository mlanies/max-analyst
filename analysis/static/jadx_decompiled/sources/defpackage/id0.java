package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.p0;

/* loaded from: classes2.dex */
public final /* synthetic */ class id0 implements qj3, s0a, lde, km7, x3a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ id0(ld0 ld0Var, String str, int i, Context context) {
        this.a = ld0Var;
        this.o = str;
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.x3a
    public void a(Object obj) {
        int i = this.b;
        p0 p0Var = (p0) this.a;
        ((d) this.o).a(i, p0Var, (String) this.c, (mp) obj);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Drawable drawableC = ((ld0) this.a).c((Context) this.c);
        int i = this.b;
        drawableC.setBounds(0, 0, i, i);
        drawableC.draw((Canvas) this.o);
    }

    @Override // defpackage.s0a
    public void e(ez9 ez9Var) {
        String str = (String) this.o;
        ld0 ld0Var = (ld0) this.a;
        xv6 xv6VarD = xv6.d(ld0Var.b(str));
        int i = this.b;
        xv6VarD.d = i <= 0 ? null : new jic(0.0f, i, i, 12);
        xv6VarD.g = uv6.a;
        xv6VarD.l = new doa(false);
        g0 g0VarA = s36.o().a(xv6VarD.a(), null);
        g0VarA.m(new kd0(ez9Var, ld0Var, (Context) this.c, g0VarA), qq1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    @Override // defpackage.lde
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get() {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id0.get():java.lang.Object");
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        gd gdVar = (gd) obj;
        gdVar.getClass();
        gdVar.A((fd) this.o, (p3b) this.a, (p3b) this.c, this.b);
    }

    public /* synthetic */ id0(Object obj, int i, Object obj2, Object obj3) {
        this.o = obj;
        this.b = i;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ id0(Object obj, Object obj2, Object obj3, int i) {
        this.o = obj;
        this.a = obj2;
        this.c = obj3;
        this.b = i;
    }
}

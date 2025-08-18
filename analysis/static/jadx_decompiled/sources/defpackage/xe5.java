package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class xe5 implements vt {
    public Object X;
    public Object Y;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public xe5(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.o = je7Var4;
        this.X = je7Var5;
        this.Y = je7Var6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // defpackage.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.xt B(defpackage.lv4 r9, android.os.Looper r10, defpackage.wt r11, defpackage.md3 r12) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.B(lv4, android.os.Looper, wt, md3):xt");
    }

    public rb0 a() {
        String strG = ((xf4) this.a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            strG = strG.concat(" sharedSurfaces");
        }
        if (((Integer) this.o) == null) {
            strG = au1.g(strG, " mirrorMode");
        }
        if (((Integer) this.X) == null) {
            strG = au1.g(strG, " surfaceGroupId");
        }
        if (((eu4) this.Y) == null) {
            strG = au1.g(strG, " dynamicRange");
        }
        if (strG.isEmpty()) {
            return new rb0((xf4) this.a, (List) this.b, (String) this.c, ((Integer) this.o).intValue(), ((Integer) this.X).intValue(), (eu4) this.Y);
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f A[LOOP:0: B:29:0x0179->B:31:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void c() {
        ((lh4) this.b).a = -1L;
        ((lh4) this.c).a = -1L;
        ((lh4) this.o).a = -1L;
        ((lh4) this.X).a = -1L;
    }
}

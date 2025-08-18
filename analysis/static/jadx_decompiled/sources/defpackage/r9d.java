package defpackage;

import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class r9d extends d8d {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final s8g s0;

    public r9d(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, s8g s8gVar) {
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
        this.Y = je7Var5;
        this.Z = je7Var6;
        this.s0 = s8gVar;
    }

    public static void y(s8g s8gVar) {
        s8gVar.a(new r9d(s8gVar.a, s8gVar.d, s8gVar.b, s8gVar.e, s8gVar.f, s8gVar.g, s8gVar));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:40|(2:42|(1:48))|49|(1:51)(1:52)|(9:54|55|56|(1:58)(1:59)|60|(1:62)(1:63)|(1:65)|81|114)(1:66)|67|106|68|69|72|(2:74|(2:76|113)(1:78))(1:(1:80)(6:82|(1:84)|85|(1:87)(1:88)|89|(1:91)(1:92)))|81|114) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        r8 = new java.lang.StringBuilder();
        r8.append("failed to execute onPreExecute method for task ");
        r15 = r10;
        r8.append(r13.f.getId());
        r8.append(" type ");
        r8.append(r13.f.getType());
        r8 = r8.toString();
        defpackage.hm9.p("r9d", r8, r0);
        z(r13.f);
        r9 = (defpackage.o45) r2.getValue();
        r10 = new ru.ok.tamtam.util.HandledException(r8, r0);
        r8 = true;
        ((defpackage.cba) r9).c(r10, true);
        r0 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d8d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9d.x():void");
    }

    public final void z(hua huaVar) {
        try {
            huaVar.d();
        } catch (Throwable th) {
            ((cba) ((o45) this.o.getValue())).c(new HandledException("failed to execute onMaxFailCount method for task " + huaVar.getId() + " type " + huaVar.getType(), th), true);
        }
    }
}

package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class hic extends rg4 {
    public final boolean c;
    public final zv6 d;
    public final eab e;
    public boolean f;
    public final n87 g;
    public final /* synthetic */ iic h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hic(iic iicVar, fi0 fi0Var, eab eabVar, boolean z, zv6 zv6Var) {
        super(fi0Var);
        this.h = iicVar;
        this.f = false;
        this.e = eabVar;
        oj0 oj0Var = (oj0) eabVar;
        Boolean bool = oj0Var.a.s;
        this.c = bool != null ? bool.booleanValue() : z;
        this.d = zv6Var;
        this.g = new n87(iicVar.a, new bkg(23, this));
        oj0Var.a(new xq6(this, fi0Var, false, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    @Override // defpackage.fi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hic.h(int, java.lang.Object):void");
    }

    public final dx6 m(g05 g05Var, jic jicVar, fm5 fm5Var, String str) {
        String str2;
        long j;
        eab eabVar = this.e;
        if (!((oj0) eabVar).c.i(eabVar, "ResizeAndRotateProducer")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        g05Var.o0();
        sb.append(g05Var.Y);
        sb.append("x");
        g05Var.o0();
        sb.append(g05Var.Z);
        String string = sb.toString();
        if (jicVar != null) {
            str2 = jicVar.a + "x" + jicVar.b;
        } else {
            str2 = "Unspecified";
        }
        HashMap map = new HashMap();
        g05Var.o0();
        map.put("Image format", String.valueOf(g05Var.c));
        map.put("Original size", string);
        map.put("Requested size", str2);
        n87 n87Var = this.g;
        synchronized (n87Var) {
            j = n87Var.i - n87Var.h;
        }
        map.put("queueTime", String.valueOf(j));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(fm5Var));
        return new dx6(map);
    }
}

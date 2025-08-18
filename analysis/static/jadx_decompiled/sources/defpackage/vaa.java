package defpackage;

/* loaded from: classes.dex */
public final class vaa implements jp4 {
    public final String a = vaa.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public vaa(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
    }

    @Override // defpackage.jp4
    public final uaa a(uaa uaaVar, Long l) {
        if (!(uaaVar instanceof uaa)) {
            return uaaVar;
        }
        return new uaa(uaaVar.a, uaaVar.b, uaaVar.c, uaaVar.d, l, uaaVar.f, uaaVar.g);
    }

    @Override // defpackage.jp4
    public final uaa b(long j, n7d n7dVar) {
        vaa vaaVar;
        xd7 xd7Var;
        Long lValueOf;
        String str = n7dVar.b;
        Long lValueOf2 = null;
        if (str == null || str.length() == 0) {
            vaaVar = this;
            xd7Var = null;
        } else {
            xd7 xd7Var2 = new xd7(str, iz7.u(n7dVar.d));
            vaaVar = this;
            xd7Var = xd7Var2;
        }
        je7 je7Var = vaaVar.c;
        Long l = n7dVar.e;
        if (l != null) {
            cu8 cu8VarJ = ((au8) je7Var.getValue()).j(j, l.longValue());
            lValueOf = cu8VarJ != null ? Long.valueOf(cu8VarJ.b) : null;
        } else {
            lValueOf = null;
        }
        Long l2 = n7dVar.f;
        if (l2 != null) {
            cu8 cu8VarJ2 = ((au8) je7Var.getValue()).j(j, l2.longValue());
            if (cu8VarJ2 != null) {
                lValueOf2 = Long.valueOf(cu8VarJ2.b);
            }
        }
        return new uaa(n7dVar.a, xd7Var, lValueOf, lValueOf2, Long.valueOf(n7dVar.g), true, 64);
    }

    @Override // defpackage.jp4
    public final uaa c(uaa uaaVar) {
        return uaaVar;
    }

    @Override // defpackage.jp4
    public final byte[] d(uaa uaaVar) {
        return gp4.b(uaaVar);
    }

    @Override // defpackage.jp4
    public final uaa e(byte[] bArr) {
        return gp4.a(bArr, (o45) this.b.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    @Override // defpackage.jp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n7d f(defpackage.uaa r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vaa.f(uaa):n7d");
    }
}

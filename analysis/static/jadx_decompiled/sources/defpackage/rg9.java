package defpackage;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rg9 extends tfg {
    public static final rl8 l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;
    public final rl8 h;
    public long i;
    public final aw0 j;
    public final List k;

    static {
        Pattern pattern = rl8.d;
        fm9.A("multipart/mixed");
        fm9.A("multipart/alternative");
        fm9.A("multipart/digest");
        fm9.A("multipart/parallel");
        l = fm9.A("multipart/form-data");
        m = new byte[]{(byte) 58, (byte) 32};
        n = new byte[]{(byte) 13, (byte) 10};
        byte b = (byte) 45;
        o = new byte[]{b, b};
    }

    public rg9(aw0 aw0Var, rl8 rl8Var, List list) {
        this.j = aw0Var;
        this.k = list;
        Pattern pattern = rl8.d;
        this.h = fm9.A(rl8Var + "; boundary=" + aw0Var.j());
        this.i = -1L;
    }

    @Override // defpackage.tfg
    public final void E(eu0 eu0Var) throws EOFException {
        F(eu0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long F(eu0 eu0Var, boolean z) throws EOFException {
        bt0 bt0Var;
        eu0 bt0Var2;
        if (z) {
            bt0Var2 = new bt0();
            bt0Var = bt0Var2;
        } else {
            bt0Var = 0;
            bt0Var2 = eu0Var;
        }
        List list = this.k;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            aw0 aw0Var = this.j;
            byte[] bArr = o;
            byte[] bArr2 = n;
            if (i >= size) {
                bt0Var2.write(bArr);
                bt0Var2.M(aw0Var);
                bt0Var2.write(bArr);
                bt0Var2.write(bArr2);
                if (!z) {
                    return j;
                }
                long j2 = j + bt0Var.b;
                bt0Var.m();
                return j2;
            }
            qg9 qg9Var = (qg9) list.get(i);
            cj6 cj6Var = qg9Var.a;
            bt0Var2.write(bArr);
            bt0Var2.M(aw0Var);
            bt0Var2.write(bArr2);
            if (cj6Var != null) {
                int size2 = cj6Var.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bt0Var2.L(cj6Var.b(i2)).write(m).L(cj6Var.d(i2)).write(bArr2);
                }
            }
            tfg tfgVar = qg9Var.b;
            rl8 rl8VarH = tfgVar.h();
            if (rl8VarH != null) {
                bt0Var2.L("Content-Type: ").L(rl8VarH.a).write(bArr2);
            }
            long jG = tfgVar.g();
            if (jG != -1) {
                bt0Var2.L("Content-Length: ").i0(jG).write(bArr2);
            } else if (z) {
                bt0Var.m();
                return -1L;
            }
            bt0Var2.write(bArr2);
            if (z) {
                j += jG;
            } else {
                tfgVar.E(bt0Var2);
            }
            bt0Var2.write(bArr2);
            i++;
        }
    }

    @Override // defpackage.tfg
    public final long g() throws EOFException {
        long j = this.i;
        if (j != -1) {
            return j;
        }
        long jF = F(null, true);
        this.i = jF;
        return jF;
    }

    @Override // defpackage.tfg
    public final rl8 h() {
        return this.h;
    }
}

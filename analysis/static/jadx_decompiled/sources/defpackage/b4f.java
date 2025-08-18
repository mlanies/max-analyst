package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b4f {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final t99 b;
    public volatile int c = 0;

    public b4f(t99 t99Var, int i) {
        this.b = t99Var;
        this.a = i;
    }

    public final int a(int i) {
        l99 l99VarC = c();
        int iA = l99VarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) l99VarC.o;
        int i2 = iA + l99VarC.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        l99 l99VarC = c();
        int iA = l99VarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + l99VarC.a;
        return ((ByteBuffer) l99VarC.o).getInt(((ByteBuffer) l99VarC.o).getInt(i) + i);
    }

    public final l99 c() {
        ThreadLocal threadLocal = d;
        l99 l99Var = (l99) threadLocal.get();
        if (l99Var == null) {
            l99Var = new l99();
            threadLocal.set(l99Var);
        }
        m99 m99Var = this.b.a;
        int iA = m99Var.a(6);
        if (iA != 0) {
            int i = iA + m99Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) m99Var.o).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) m99Var.o).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) m99Var.o;
            l99Var.o = byteBuffer;
            if (byteBuffer != null) {
                l99Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                l99Var.b = i4;
                l99Var.c = ((ByteBuffer) l99Var.o).getShort(i4);
            } else {
                l99Var.a = 0;
                l99Var.b = 0;
                l99Var.c = 0;
            }
        }
        return l99Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        l99 l99VarC = c();
        int iA = l99VarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) l99VarC.o).getInt(iA + l99VarC.a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class oq6 extends t1 {
    public static final byte[] t0 = {110, 117, 108, 108};
    public final MessageDigest X;
    public final xna Y;
    public int Z;
    public final OutputStream a;
    public final List b;
    public final String c;
    public final sh0 o = new sh0(18, (byte) 0);
    public boolean s0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [ju8] */
    public oq6(OutputStream outputStream, ArrayList arrayList, String str) throws NoSuchAlgorithmException {
        this.a = outputStream;
        this.b = arrayList;
        this.c = str;
        g9f g9fVar = new g9f(outputStream);
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                this.X = messageDigest;
                g9fVar = new ju8(g9fVar, messageDigest);
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } else {
            this.X = hr9.a;
        }
        this.Y = new xna(g9fVar);
    }

    @Override // defpackage.t1
    public final void a(String str) {
        m();
        xna xnaVar = this.Y;
        xnaVar.getClass();
        xnaVar.write(str, 0, str.length());
    }

    @Override // defpackage.t1, defpackage.kb7
    public final void c0() {
        m();
        if (this.o.t() == 2) {
            this.X.update(t0);
        } else {
            xna xnaVar = this.Y;
            xnaVar.getClass();
            xnaVar.write("null", 0, 4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Y.close();
        int iT = this.o.t();
        if (iT != 0 && iT != 2) {
            throw new JsonStateException("Unfinished document");
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.Y.flush();
    }

    @Override // defpackage.kb7
    public final kb7 g0(String str) {
        int i;
        int iT = this.o.t();
        if ((iT == 0 || iT == 2) && (i = this.Z) >= 0) {
            this.Z = -1;
            while (true) {
                List list = this.b;
                if (i >= list.size()) {
                    break;
                }
                o9e o9eVar = (o9e) list.get(i);
                int iCompareTo = str.compareTo(o9eVar.a);
                if (iCompareTo < 0) {
                    break;
                }
                if (iCompareTo > 0) {
                    o9eVar.a(this);
                }
                i++;
            }
            this.Z = i;
        }
        n(str);
        return this;
    }

    @Override // defpackage.kb7
    public final void i(String str) throws IOException {
        m();
        int iT = this.o.t();
        xna xnaVar = this.Y;
        if (iT != 2) {
            ngg.L(str, xnaVar);
            return;
        }
        if (str.length() == 0) {
            this.X.update(t0);
        }
        xnaVar.getClass();
        xnaVar.write(str, 0, str.length());
    }

    @Override // defpackage.kb7
    public final void l(InputStreamReader inputStreamReader) throws IOException {
        m();
        sh0 sh0Var = this.o;
        int iT = sh0Var.t();
        xna xnaVar = this.Y;
        if (iT == 2 || iT == 5) {
            va7 va7Var = new va7(inputStreamReader);
            kp.B(va7Var, xnaVar);
            if (va7Var.S() == 0) {
                return;
            }
            throw JsonSyntaxException.b(va7Var.o, va7Var.m(), va7Var.S());
        }
        if (iT != 6 && iT != 7) {
            throw new JsonStateException("Nesting problem: ".concat(hx9.l(sh0Var)));
        }
        va7 va7Var2 = new va7(inputStreamReader);
        kp.B(va7Var2, xnaVar);
        while (va7Var2.S() != 0) {
            va7Var2.d(44);
            va7Var2.a(xnaVar);
            kp.B(va7Var2, xnaVar);
        }
    }

    public final void m() {
        sh0 sh0Var = this.o;
        int iT = sh0Var.t();
        if (iT == 1) {
            sh0Var.v(2);
            this.a.write(61);
            this.X.update((byte) 61);
            return;
        }
        xna xnaVar = this.Y;
        if (iT == 4) {
            sh0Var.v(5);
            xnaVar.write(58);
        } else if (iT == 6) {
            sh0Var.v(7);
        } else {
            if (iT != 7) {
                throw new JsonStateException("Nesting problem: ".concat(hx9.l(sh0Var)));
            }
            xnaVar.write(44);
        }
    }

    public final void n(String str) {
        sh0 sh0Var = this.o;
        int iT = sh0Var.t();
        xna xnaVar = this.Y;
        if (iT == 0) {
            sh0Var.v(1);
            xnaVar.write(str);
            return;
        }
        if (iT == 5) {
            xnaVar.write(44);
            sh0Var.v(4);
            ngg.L(str, xnaVar);
        } else if (iT == 2) {
            this.a.write(38);
            sh0Var.v(1);
            xnaVar.write(str);
        } else {
            if (iT != 3) {
                throw new JsonStateException("Nesting problem: ".concat(hx9.l(sh0Var)));
            }
            sh0Var.v(4);
            ngg.L(str, xnaVar);
        }
    }

    @Override // defpackage.kb7
    public final void q() {
        sh0 sh0Var = this.o;
        int iT = sh0Var.t();
        if (iT != 3 && iT != 5) {
            throw new JsonStateException("Nesting problem: ".concat(hx9.l(sh0Var)));
        }
        sh0Var.u();
        this.Y.write(125);
    }

    @Override // defpackage.kb7
    public final void s() {
        m();
        this.o.w(3);
        this.Y.write(123);
    }

    @Override // defpackage.kb7
    public final void t() {
        sh0 sh0Var = this.o;
        int iT = sh0Var.t();
        if (iT != 6 && iT != 7) {
            throw new JsonStateException("Nesting problem: ".concat(hx9.l(sh0Var)));
        }
        sh0Var.u();
        this.Y.write(93);
    }

    @Override // defpackage.kb7
    public final void u() {
        m();
        this.o.w(6);
        this.Y.write(91);
    }
}

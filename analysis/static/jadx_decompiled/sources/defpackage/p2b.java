package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.NoSuchElementException;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class p2b extends t1 {
    public final Writer a;
    public final sh0 b;

    public p2b(Writer writer) {
        sh0 sh0Var = new sh0(18, (byte) 0);
        this.b = sh0Var;
        this.a = writer;
        sh0Var.w(0);
    }

    public static String o(sh0 sh0Var) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = sh0Var.b;
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Illegal Capacity: "));
        }
        int[] iArr2 = new int[Math.max(i, 8)];
        int i2 = 0;
        while (sh0Var.b != 0) {
            int iU = sh0Var.u();
            int length = iArr2.length;
            if (i2 < length) {
                iArr = iArr2;
            } else {
                iArr = new int[length * 2];
                System.arraycopy(iArr2, 0, iArr, 0, length);
                iArr2 = iArr;
            }
            iArr2[i2] = iU;
            i2++;
            iArr2 = iArr;
        }
        while (i2 != 0) {
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            i2--;
            int i3 = iArr2[i2];
            String str = "";
            switch (i3) {
                case 0:
                case 1:
                    break;
                case 2:
                case 3:
                    str = "[";
                    break;
                case 4:
                case 6:
                    str = "{";
                    break;
                case 5:
                    str = "{:";
                    break;
                default:
                    throw new IllegalArgumentException(zr6.h(i3, ""));
            }
            sb.append(str);
            sh0Var.w(i3);
        }
        return sb.toString();
    }

    @Override // defpackage.t1
    public final void a(String str) throws IOException {
        m();
        this.a.write(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        if (this.b.t() != 1) {
            throw new JsonStateException("Unfinished document");
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.kb7
    public final kb7 g0(String str) throws IOException {
        sh0 sh0Var = this.b;
        int iT = sh0Var.t();
        Writer writer = this.a;
        if (iT == 6) {
            writer.write(44);
        } else if (iT != 4) {
            throw new JsonStateException("Nesting problem: " + o(sh0Var));
        }
        sh0Var.v(5);
        ngg.L(str, writer);
        return this;
    }

    @Override // defpackage.kb7
    public final void i(String str) throws IOException {
        m();
        ngg.L(str, this.a);
    }

    @Override // defpackage.kb7
    public final void l(InputStreamReader inputStreamReader) throws IOException {
        m();
        sh0 sh0Var = this.b;
        int iT = sh0Var.t();
        Writer writer = this.a;
        if (iT == 2 || iT == 3) {
            va7 va7Var = new va7(inputStreamReader);
            kp.B(va7Var, writer);
            while (va7Var.S() != 0) {
                va7Var.d(44);
                va7Var.a(writer);
                kp.B(va7Var, writer);
            }
            return;
        }
        if (iT != 6) {
            throw new JsonStateException("Nesting problem: " + o(sh0Var));
        }
        va7 va7Var2 = new va7(inputStreamReader);
        kp.B(va7Var2, writer);
        if (va7Var2.S() == 0) {
            return;
        }
        throw JsonSyntaxException.b(va7Var2.o, va7Var2.m(), va7Var2.S());
    }

    public final void m() throws IOException {
        sh0 sh0Var = this.b;
        int iT = sh0Var.t();
        if (iT == 0) {
            sh0Var.v(1);
            return;
        }
        Writer writer = this.a;
        if (iT == 5) {
            writer.write(":");
            sh0Var.v(6);
        } else if (iT == 2) {
            sh0Var.v(3);
        } else if (iT == 3) {
            writer.write(44);
        } else {
            throw new JsonStateException("Nesting problem: " + o(sh0Var));
        }
    }

    public final void n(int i, int i2) {
        sh0 sh0Var = this.b;
        int iT = sh0Var.t();
        if (iT == i2 || iT == i) {
            sh0Var.u();
        } else {
            throw new JsonStateException("Nesting problem: " + o(sh0Var));
        }
    }

    @Override // defpackage.kb7
    public final void q() throws IOException {
        n(4, 6);
        this.a.write(125);
    }

    @Override // defpackage.kb7
    public final void s() throws IOException {
        m();
        this.b.w(4);
        this.a.write(123);
    }

    @Override // defpackage.kb7
    public final void t() throws IOException {
        n(2, 3);
        this.a.write(93);
    }

    @Override // defpackage.kb7
    public final void u() throws IOException {
        m();
        this.b.w(2);
        this.a.write(91);
    }
}

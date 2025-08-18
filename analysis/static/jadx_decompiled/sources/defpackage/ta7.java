package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class ta7 implements Closeable, Flushable {
    static {
        c32.d(g9e.values());
        g9e.CAN_WRITE_FORMATTED_NUMBERS.b();
        g9e.CAN_WRITE_BINARY_NATIVELY.b();
    }

    public static void d(String str) {
        throw new JsonGenerationException(str, null, null);
    }

    public abstract void S(double d);

    public abstract void U(float f);

    public final void a(ab7 ab7Var) throws IOException {
        int i = 1;
        while (true) {
            hb7 hb7VarU0 = ab7Var.u0();
            if (hb7VarU0 == null) {
                return;
            }
            boolean z = false;
            switch (hb7VarU0.o) {
                case 1:
                    q0();
                    break;
                case 2:
                    n();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    p0();
                    break;
                case 4:
                    m();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    o(ab7Var.S());
                    continue;
                case 6:
                    xpa xpaVar = (xpa) ab7Var;
                    hb7 hb7Var = xpaVar.b;
                    if (hb7Var == hb7.VALUE_STRING) {
                        z = true;
                    } else if (hb7Var == hb7.FIELD_NAME) {
                        z = xpaVar.A0;
                    }
                    if (z) {
                        s0(ab7Var.r0(), ab7Var.t0(), ab7Var.s0());
                    } else {
                        r0(ab7Var.q0());
                        continue;
                    }
                case 7:
                    int iO0 = ab7Var.o0();
                    if (iO0 == 1) {
                        e0(ab7Var.m0());
                    } else if (iO0 == 3) {
                        o0(ab7Var.n());
                    } else {
                        m0(ab7Var.n0());
                        continue;
                    }
                case 8:
                    int iO02 = ab7Var.o0();
                    if (iO02 == 6) {
                        n0(ab7Var.U());
                    } else if (iO02 == 4) {
                        U((float) ((xpa) ab7Var).e0());
                    } else {
                        S(ab7Var.e0());
                        continue;
                    }
                case 9:
                    g(true);
                    continue;
                case 10:
                    g(false);
                    continue;
                case 11:
                    m9g m9gVar = (m9g) this;
                    m9gVar.A0("write a null");
                    m9gVar.B0();
                    continue;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    m9g m9gVar2 = (m9g) ((ha6) this);
                    m9gVar2.A0("write a null");
                    m9gVar2.B0();
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + hb7VarU0);
            }
            i++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract void e0(int i);

    public abstract void g(boolean z);

    public abstract void m();

    public abstract void m0(long j);

    public abstract void n();

    public abstract void n0(BigDecimal bigDecimal);

    public abstract void o(String str);

    public abstract void o0(BigInteger bigInteger);

    public abstract void p0();

    public abstract void q0();

    public abstract void r0(String str);

    public abstract void s0(char[] cArr, int i, int i2);
}

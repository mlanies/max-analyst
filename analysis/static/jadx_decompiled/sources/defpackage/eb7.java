package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import java.io.BufferedInputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.HashMap;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class eb7 extends s1 {
    public static final ra7 b = new ra7();
    public final ab7 a;

    public eb7(ab7 ab7Var) throws JsonSyntaxException {
        this.a = ab7Var;
        try {
            ab7Var.u0();
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static eb7 a(BufferedInputStream bufferedInputStream) throws JsonSyntaxException {
        try {
            ab7 ab7VarL = b.l(bufferedInputStream);
            new HashMap();
            return new eb7(ab7VarL);
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static eb7 d(String str) throws JsonSyntaxException {
        try {
            ab7 ab7VarN = b.n(str);
            new HashMap();
            return new eb7(ab7VarN);
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static String g(ab7 ab7Var) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        ta7 ta7VarK = b.k(charArrayWriter);
        ta7VarK.getClass();
        xpa xpaVar = (xpa) ab7Var;
        hb7 hb7Var = xpaVar.b;
        int i = hb7Var == null ? -1 : hb7Var.o;
        if (i == 5) {
            ta7VarK.o(ab7Var.S());
            hb7 hb7VarU0 = ab7Var.u0();
            i = hb7VarU0 == null ? -1 : hb7VarU0.o;
        }
        if (i == 1) {
            ta7VarK.q0();
            ta7VarK.a(ab7Var);
        } else if (i != 3) {
            hb7 hb7Var2 = xpaVar.b;
            switch (hb7Var2 != null ? hb7Var2.o : -1) {
                case -1:
                    ta7.d("No current event to copy");
                    throw null;
                case 0:
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + hb7Var2);
                case 1:
                    ta7VarK.q0();
                    break;
                case 2:
                    ta7VarK.n();
                    break;
                case 3:
                    ta7VarK.p0();
                    break;
                case 4:
                    ta7VarK.m();
                    break;
                case 5:
                    ta7VarK.o(ab7Var.S());
                    break;
                case 6:
                    xpa xpaVar2 = (xpa) ab7Var;
                    hb7 hb7Var3 = xpaVar2.b;
                    if (!(hb7Var3 != hb7.VALUE_STRING ? hb7Var3 == hb7.FIELD_NAME ? xpaVar2.A0 : false : true)) {
                        ta7VarK.r0(ab7Var.q0());
                        break;
                    } else {
                        ta7VarK.s0(ab7Var.r0(), ab7Var.t0(), ab7Var.s0());
                        break;
                    }
                case 7:
                    int iO0 = ab7Var.o0();
                    if (iO0 != 1) {
                        if (iO0 != 3) {
                            ta7VarK.m0(ab7Var.n0());
                            break;
                        } else {
                            ta7VarK.o0(ab7Var.n());
                            break;
                        }
                    } else {
                        ta7VarK.e0(ab7Var.m0());
                        break;
                    }
                case 8:
                    int iO02 = ab7Var.o0();
                    if (iO02 != 6) {
                        if (iO02 != 4) {
                            ta7VarK.S(ab7Var.e0());
                            break;
                        } else {
                            ta7VarK.U((float) ((xpa) ab7Var).e0());
                            break;
                        }
                    } else {
                        ta7VarK.n0(ab7Var.U());
                        break;
                    }
                case 9:
                    ta7VarK.g(true);
                    break;
                case 10:
                    ta7VarK.g(false);
                    break;
                case 11:
                    m9g m9gVar = (m9g) ta7VarK;
                    m9gVar.A0("write a null");
                    m9gVar.B0();
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    m9g m9gVar2 = (m9g) ((ha6) ta7VarK);
                    m9gVar2.A0("write a null");
                    m9gVar2.B0();
                    break;
            }
        } else {
            ta7VarK.p0();
            ta7VarK.a(ab7Var);
        }
        ta7VarK.close();
        return charArrayWriter.toString();
    }

    public static JsonTypeMismatchException m(int i, int i2) {
        return new JsonTypeMismatchException("Expected " + z7.U(i) + " was " + z7.U(i2));
    }

    @Override // defpackage.db7
    public final int D() {
        return (int) w();
    }

    @Override // defpackage.db7
    public final String H() throws IOException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String strG = g(ab7Var);
                    ab7Var.u0();
                    return strG;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String strQ0 = ab7Var.q0();
                    ab7Var.u0();
                    return strQ0;
                case 11:
                    ab7Var.u0();
                    return "null";
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.db7
    public final String T() throws JsonSyntaxException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.c(0);
                case 1:
                    throw JsonStateException.c(123);
                case 2:
                    throw JsonStateException.c(125);
                case 3:
                    throw JsonStateException.c(91);
                case 4:
                    throw JsonStateException.c(93);
                case 5:
                    String strS = ab7Var.S();
                    ab7Var.u0();
                    return strS;
                case 6:
                    throw JsonStateException.c(34);
                case 7:
                case 8:
                    throw JsonStateException.c(49);
                case 9:
                case 10:
                    throw JsonStateException.c(98);
                case 11:
                    throw JsonStateException.c(110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.db7
    public final String V() throws IOException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    return "";
                case 1:
                case 3:
                case 6:
                    String strG = g(ab7Var);
                    ab7Var.u0();
                    return strG;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    String strQ0 = ab7Var.q0();
                    ab7Var.u0();
                    return strQ0;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    @Override // defpackage.db7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a0() throws ru.ok.android.api.json.JsonTypeMismatchException, ru.ok.android.api.json.JsonSyntaxException {
        /*
            r6 = this;
            ab7 r6 = r6.a
            java.lang.String r0 = "Unknown JsonTokenId "
            java.lang.String r1 = "Cannot parse boolean from string "
            int r2 = r6.m()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r3 = 98
            r4 = 1
            r5 = 0
            switch(r2) {
                case -1: goto Lc5;
                case 0: goto Lc0;
                case 1: goto Lb9;
                case 2: goto Lb2;
                case 3: goto Lab;
                case 4: goto La4;
                case 5: goto L9d;
                case 6: goto L5e;
                case 7: goto L4e;
                case 8: goto L3e;
                case 9: goto L3a;
                case 10: goto L36;
                case 11: goto L32;
                case 12: goto L2a;
                default: goto L11;
            }     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L11:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r2.<init>(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            int r6 = r6.m()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r2.append(r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r6 = r2.toString()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r1.<init>(r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r1     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L27:
            r6 = move-exception
            goto Lcd
        L2a:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r0 = "Embedded objects not supported"
            r6.<init>(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L32:
            r6.u0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            return r5
        L36:
            r6.u0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            return r5
        L3a:
            r6.u0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            return r4
        L3e:
            double r0 = r6.e0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r6.u0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L4c
            goto L4d
        L4c:
            r4 = r5
        L4d:
            return r4
        L4e:
            long r0 = r6.n0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r6.u0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L5c
            goto L5d
        L5c:
            r4 = r5
        L5d:
            return r4
        L5e:
            java.lang.String r0 = r6.q0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r6.u0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r6 = r0.trim()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            int r2 = r6.hashCode()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r3 = 3569038(0x36758e, float:5.001287E-39)
            if (r2 == r3) goto L82
            r3 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r2 == r3) goto L78
            goto L8c
        L78:
            java.lang.String r2 = "false"
            boolean r6 = r6.equals(r2)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            if (r6 == 0) goto L8c
            r6 = r4
            goto L8d
        L82:
            java.lang.String r2 = "true"
            boolean r6 = r6.equals(r2)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            if (r6 == 0) goto L8c
            r6 = r5
            goto L8d
        L8c:
            r6 = -1
        L8d:
            if (r6 == 0) goto L9c
            if (r6 != r4) goto L92
            return r5
        L92:
            ru.ok.android.api.json.JsonTypeMismatchException r6 = new ru.ok.android.api.json.JsonTypeMismatchException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r0 = r1.concat(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r6.<init>(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L9c:
            return r4
        L9d:
            r6 = 39
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        La4:
            r6 = 93
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lab:
            r6 = 91
            ru.ok.android.api.json.JsonTypeMismatchException r6 = m(r3, r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lb2:
            r6 = 125(0x7d, float:1.75E-43)
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lb9:
            r6 = 123(0x7b, float:1.72E-43)
            ru.ok.android.api.json.JsonTypeMismatchException r6 = m(r3, r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lc0:
            ru.ok.android.api.json.JsonStateException r6 = ru.ok.android.api.json.JsonStateException.d(r5)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lc5:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r0 = "Non-blocking parsing not supported"
            r6.<init>(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r6     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lcd:
            ru.ok.android.api.json.JsonSyntaxException r0 = new ru.ok.android.api.json.JsonSyntaxException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb7.a0():boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((xpa) this.a).close();
    }

    @Override // defpackage.db7
    public final String f0() throws IOException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String strG = g(ab7Var);
                    ab7Var.u0();
                    return strG;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String strQ0 = ab7Var.q0();
                    ab7Var.u0();
                    return strQ0;
                case 11:
                    ab7Var.u0();
                    return null;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.db7
    public final boolean hasNext() {
        ab7 ab7Var = this.a;
        switch (ab7Var.m()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
            case 2:
            case 4:
                return false;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
        }
    }

    @Override // defpackage.db7
    public final int peek() {
        ab7 ab7Var = this.a;
        switch (ab7Var.m()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
                return 0;
            case 1:
                return 123;
            case 2:
                return 125;
            case 3:
                return 91;
            case 4:
                return 93;
            case 5:
                return 39;
            case 6:
                return 34;
            case 7:
            case 8:
                return 49;
            case 9:
            case 10:
                return 98;
            case 11:
                return 110;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
        }
    }

    @Override // defpackage.db7
    public final void q() throws JsonSyntaxException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.b(0);
                case 1:
                    throw JsonStateException.b(123);
                case 2:
                    ab7Var.u0();
                    return;
                case 3:
                    throw JsonStateException.b(91);
                case 4:
                    throw JsonStateException.b(93);
                case 5:
                    throw JsonStateException.b(39);
                case 6:
                    throw JsonStateException.b(34);
                case 7:
                case 8:
                    throw JsonStateException.b(49);
                case 9:
                case 10:
                    throw JsonStateException.b(98);
                case 11:
                    throw JsonStateException.b(110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.db7
    public final void s() throws JsonTypeMismatchException, JsonSyntaxException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    ab7Var.u0();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    throw m(123, 91);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw m(123, 34);
                case 7:
                case 8:
                    throw m(123, 49);
                case 9:
                case 10:
                    throw m(123, 98);
                case 11:
                    throw m(123, 110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.db7
    public final void t() throws JsonSyntaxException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.a(0);
                case 1:
                    throw JsonStateException.a(123);
                case 2:
                    throw JsonStateException.a(125);
                case 3:
                    throw JsonStateException.a(91);
                case 4:
                    ab7Var.u0();
                    return;
                case 5:
                    throw JsonStateException.a(39);
                case 6:
                    throw JsonStateException.a(34);
                case 7:
                case 8:
                    throw JsonStateException.a(49);
                case 9:
                case 10:
                    throw JsonStateException.a(98);
                case 11:
                    throw JsonStateException.a(110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.db7
    public final void u() throws JsonTypeMismatchException, JsonSyntaxException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    throw m(91, 123);
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    ab7Var.u0();
                    return;
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw m(91, 34);
                case 7:
                case 8:
                    throw m(91, 49);
                case 9:
                case 10:
                    throw m(91, 98);
                case 11:
                    throw m(91, 110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.db7
    public final long w() throws JsonTypeMismatchException, JsonSyntaxException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    throw m(49, 123);
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    throw m(49, 91);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    String strQ0 = ab7Var.q0();
                    ab7Var.u0();
                    try {
                        return r1.a(strQ0.trim());
                    } catch (NumberFormatException unused) {
                        throw new JsonTypeMismatchException("Cannot parse long from string " + strQ0);
                    }
                case 7:
                    int iS = au1.s(ab7Var.o0());
                    long jN0 = (iS == 0 || iS == 1) ? ab7Var.n0() : ab7Var.p0().longValue();
                    ab7Var.u0();
                    return jN0;
                case 8:
                    double dE0 = ab7Var.e0();
                    ab7Var.u0();
                    return (long) dE0;
                case 9:
                    ab7Var.u0();
                    return 1L;
                case 10:
                    ab7Var.u0();
                    return 0L;
                case 11:
                    ab7Var.u0();
                    return 0L;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
        throw new JsonSyntaxException(e);
    }

    @Override // defpackage.db7
    public final void z() throws JsonSyntaxException, JsonParseException {
        ab7 ab7Var = this.a;
        try {
            switch (ab7Var.m()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    xpa xpaVar = (xpa) ab7Var;
                    hb7 hb7Var = xpaVar.b;
                    if (hb7Var == hb7.START_OBJECT || hb7Var == hb7.START_ARRAY) {
                        int i = 1;
                        while (true) {
                            hb7 hb7VarU0 = xpaVar.u0();
                            if (hb7VarU0 == null) {
                                xpaVar.y0();
                            } else if (hb7VarU0.X) {
                                i++;
                            } else if (hb7VarU0.Y) {
                                i--;
                                if (i == 0) {
                                }
                            } else if (hb7VarU0 == hb7.NOT_AVAILABLE) {
                                throw new JsonParseException(xpaVar, "Not enough content available for `skipChildren()`: non-blocking parser? (" + xpaVar.getClass().getName() + ")");
                            }
                        }
                    }
                    ab7Var.u0();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    ab7Var.u0();
                    return;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ab7Var.m());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
